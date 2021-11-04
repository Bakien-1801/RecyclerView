package com.nsb.recyclerview.Model;

public class Menu {

    private  int imvRes;
    private  String title;
    private  String detail;

    public Menu(int imvRes, String title, String detail) {
        this.imvRes = imvRes;
        this.title = title;
        this.detail = detail;
    }

    public int getImvRes() {
        return imvRes;
    }

    public void setImvRes(int imvRes) {
        this.imvRes = imvRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
