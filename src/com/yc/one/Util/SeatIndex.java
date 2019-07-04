package com.yc.one.Util;

public class SeatIndex {
    private String[] arr= new String[40];
    private int i;
    public int SeatSelected(int x,int y){  //获取座位号
        int index=(x - 1) * 8 + y - 1;
        return index;
    }

    public String[] ArrIn(int index){ //将座位号导入字符串
        arr[i]=String.valueOf(index);
        i++;
        return arr;
    }
}
