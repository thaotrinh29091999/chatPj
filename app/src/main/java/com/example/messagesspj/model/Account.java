package com.example.messagesspj.model;

public class Account {

    public static final String TABLE_NAME = "accounts";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_ACCOUNT = "account";

    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_ACCOUNT + " TEXT,"
                    + ")";

    private int id;
    private String userName;
    private String passWork;
    private String createdAt;
    private String updatedAt;
    private String delateAt;
    private int status;

    public Account(int id, String userName, String passWork, String createdAt, String updatedAt, String delateAt, int status) {
        this.id = id;
        this.userName = userName;
        this.passWork = passWork;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.delateAt = delateAt;
        this.status = status;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWork() {
        return passWork;
    }

    public void setPassWork(String passWork) {
        this.passWork = passWork;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDelateAt() {
        return delateAt;
    }

    public void setDelateAt(String delateAt) {
        this.delateAt = delateAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
