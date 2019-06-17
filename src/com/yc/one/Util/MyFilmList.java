package com.yc.one.Util;

import com.yc.one.UI.MainUI.MyFilm;

public class MyFilmList  {
    private String mname;
    private int price;
    private String seatlocation;
    private String hall;
    private String date;
    private int count;

    public MyFilmList(String mname, int price, String seatlocation, String hall, String date, int count) {
        this.mname = mname;
        this.price = price;
        this.seatlocation = seatlocation;
        this.hall = hall;
        this.date = date;
        this.count = count;
    }

    @Override
    public String toString() {
        return "MyFilmList{" +
                "mname='" + mname + '\'' +
                ", price=" + price +
                ", seatlocation='" + seatlocation + '\'' +
                ", hall='" + hall + '\'' +
                ", date='" + date + '\'' +
                ", count=" + count +
                '}';
    }
}
