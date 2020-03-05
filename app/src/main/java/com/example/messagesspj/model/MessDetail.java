package com.example.messagesspj.model;

public class MessDetail {

    public static final String TABLE_NAME = "MessDetailes";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_MESSDETAIL = "messdetail";

    private int id;

    public MessDetail(int id, int accountId, String text, String time) {
        this.id = id;
        this.accountId = accountId;
        this.text = text;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int accountId;
    private String text;
    private String time;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MessDetail(int accountId, String text, String time) {
        this.accountId = accountId;
        this.text = text;
        this.time = time;
    }

    public MessDetail() {
    }
}
