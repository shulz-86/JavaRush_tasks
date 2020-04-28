package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top; /** верхняя координата */
    int left; /** левая координата */
    int width; /** ширина */
    int height; /** высота */

    public void initialize(int top){
        this.top = top;
    }
    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
    }
    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }


    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.initialize(5);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.initialize(rectangle1.top,5);
        Rectangle rectangle3 = new Rectangle();
        rectangle3.initialize(rectangle2.top,rectangle2.left,8);
        Rectangle rectangle4 = new Rectangle();
        rectangle4.initialize(rectangle3.top,rectangle3.left,rectangle3.width,8);

    }
}
