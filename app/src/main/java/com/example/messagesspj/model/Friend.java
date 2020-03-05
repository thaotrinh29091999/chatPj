package com.example.messagesspj.model;

public class Friend {

    public static final String TABLE_NAME = "friends";
    public static final String COLUMN_FRIEND = "friend";
    public static final String COLUMN_ID = "id";

    private int id;
    private int accountId;

    public Friend(int id, int accountId) {
        this.id = id;
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Friend() {
    }
}
