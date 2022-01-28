package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BotClient extends Client {

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if(message.contains(":")) {
                String[] messageSplit = message.split(": ");
                if (messageSplit.length != 2) return;

                Date date = Calendar.getInstance().getTime();
                String format = null;

                switch (messageSplit[1]) {
                    case "дата":
                        format = "d.MM.YYYY";
                        break;
                    case "день":
                        format = "d";
                        break;
                    case "месяц":
                        format = "MMMM";
                        break;
                    case "год":
                        format = "YYYY";
                        break;
                    case "время":
                        format = "H:mm:ss";
                        break;
                    case "час":
                        format = "H";
                        break;
                    case "минуты":
                        format = "m";
                        break;
                    case "секунды":
                        format = "s";
                        break;
                }
                if (format != null) {
                    String response = "Информация для " + messageSplit[0] + ": " + new SimpleDateFormat(format).format(date);
                    BotClient.this.sendTextMessage(response);
                }
            }
        }
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        // Бот не должен отправлять текст введенный с консоли
        return false;
    }

    @Override
    protected String getUserName() {
        String botName = "date_bot_" + (int) (Math.random() * 100);
        return botName;
    }

    public static void main(String[] args) {
        new BotClient().run();
    }
}
