package com.sopan.leftmenu.model;

import com.sopan.leftmenu.interfaces.Resourceble;

/**
 * Created by Sopan on 23.12.2014.
 */
public class SlideMenuItem implements Resourceble {
    private String name;
    private int imageRes;

    public SlideMenuItem(String name, int imageRes) {
        this.name = name;
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}
