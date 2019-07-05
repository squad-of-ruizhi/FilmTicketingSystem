package com.yc.one.Util;

import java.util.Arrays;

import static com.yc.one.Util.InitInfo.arr;

public class SeatIndex {

    public int SeatSelected(int x, int y) {  //获取座位号
        int index = (x - 1) * 8 + y - 1;
        return index;
    }

    public String ArrIn(int index) { //将座位号导入字符串
        arr[index] = InitInfo.account;

        return Arrays.toString(arr);
    }

    public String ArrOut(int index) { //将座位号导出字符串
        arr[index] = null;

        return Arrays.toString(arr);
    }
}