package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.javarush.task.task30.task3008.MessageType.*;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<String, Connection>();

    public static void main(String[] args) {
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)){
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                Handler handler = new Handler(serverSocket.accept());
                handler.start();
            }
        } catch (Exception e) {
            System.out.println("Ошибочка вышла!");
        }
    }
    /**
    отправляет сообщение message всем соединениям из connectionMap
     */
    public static void sendBroadcastMessage(Message message) {
        try {
            for (Connection value : connectionMap.values()) {
                value.send(message);
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("Сообщение не доставлено");
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        private Handler(Socket socket) {
            this.socket = socket;
        }
        /**
         * главный метод
         */
        public void run() {
            ConsoleHelper.writeMessage("Установлено новое соединение с удаленным адресом " + socket.getRemoteSocketAddress());
            String userName = null;
            try (Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);

                if(userName.trim().length() > 0) {
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }

            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Произошла ошибка при обмене данными с удаленным адресом "  + socket.getRemoteSocketAddress());
            }

            ConsoleHelper.writeMessage("Соединение с удаленным адресом закрыто");
        }
        /**
        * этап рукопожатия (знакомства сервера с клиентом)
         */
        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST, "Пожалуйста, введите имя:"));
                Message response = connection.receive();

                String userName = response.getData();

                if (response.getType() != USER_NAME) {
                    ConsoleHelper.writeMessage("Введённое имя не соответствует протоколу. Пожалуйста, введите имя:");
                    continue;
                }

                if (userName.isEmpty() || connectionMap.keySet().contains(userName)) {
                    ConsoleHelper.writeMessage("Введённое имя пустое или уже занято. Пожалуйста, введите имя:");
                    continue;
                }

                connectionMap.put(userName, connection);
                connection.send(new Message(MessageType.NAME_ACCEPTED, "Вы добавлены в чат!"));
                return userName;
            }
        }
        /**
        * уведомляем нового userName о всех остальных участниках чата
         */
        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (String name: connectionMap.keySet()) {
                if (!name.equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                }
            }
        }
        /**
         * главный цикл обработки сообщений сервером
         */
        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true) {
                Message message = connection.receive();
                if (message.getType() == TEXT) {
                    String newMessage = userName + ": " + message.getData();
                    sendBroadcastMessage(new Message(TEXT, newMessage));
                } else {
                    ConsoleHelper.writeMessage("Ошибка! Принятое сообщение не является текстом!");
                }

            }
        }
    }
}
