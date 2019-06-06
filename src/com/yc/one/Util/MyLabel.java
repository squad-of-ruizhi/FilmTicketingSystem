package com.yc.one.Util;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class MyLabel extends Label {
    private int x,y;
    public MyLabel(Composite parent, int style) {
        super(parent, style);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
