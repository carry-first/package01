package com.jpanel.greedySnake;

import java.util.ArrayList;

public class snake {
    private int x,y;

    int direction = 3;

    private int snakeHeight = 3;

    public snake() {
    }

    public int getSnakeHeight() {
        return snakeHeight;
    }

    public void setSnakeHeight(int snakeHeight) {
        this.snakeHeight = snakeHeight;
    }

    public snake(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
