package com.javarush.task.task24.task2413;

import javax.swing.*;
import java.awt.*;

public class Layer extends JPanel {

    private char[][] matrix;

    public Layer(char[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                switch (matrix[i][j]) {
                    case 'O':
                        g.setColor(java.awt.Color.GREEN); //Задаем зеленый цвет для шарика
                        break;
                    case 'M':
                        g.setColor(Color.BLUE); //Задаем синий цвет для доски
                        break;
                    case 'H':
                        g.setColor(Color.CYAN); //Задаем бирюзовый цвет для кирпичей
                        break;
                    case '-':
                    case '|':
                        g.setColor(Color.BLACK); //Задаем черный цвет для границ
                        break;
                    default:
                        g.setColor(Color.DARK_GRAY); //Задаем темно-серый цвет для всего остального
                }
                g.fillRect(j * 20, i * 20, 20, 20);
            }
        }
    }
}
