package com.joohyukkim.example.constructor.overloading;

public class BadHandler {

    private String url;
    private String username;
    private String password;
    private int num;
    private int heightInCM;
    private long price;

    public BadHandler(String url, long price) {
        this.url = url;
        this.price = price;
    }

    public BadHandler(int num, long price) {
        this.num = num;
        this.price = price;
    }

    public BadHandler(int num, int heightInCM) {
        this.num = num;
        this.heightInCM = heightInCM;
    }

    public BadHandler(String password, int num) {
        this.password = password;
        this.num = num;
    }

    public BadHandler(String url, String username) {
        this.url = url;
        this.username = username;
    }

    public BadHandler(String username) {
        this.username = username;
    }

    public BadHandler(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Handler{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
