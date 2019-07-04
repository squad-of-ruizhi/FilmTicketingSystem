package com.yc.one.Util;

public class MySeat {
    private int x,y;

    public MySeat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MySeat{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public boolean SeatSelected(int arr[],int x,int y){
        int index=(x - 1) * 6 + y - 1;
        if (arr[index] == 0) {
            arr[index] = 1;
            return false; //    可以选择
        }else{
            return true; //     此座有人
        }
    }
}
