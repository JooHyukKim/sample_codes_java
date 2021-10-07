package com.joohyukkim.example.constructor.staticfactory;

public class GoodHandler {

    private String url;
    private String username;
    private String password;
    private int num;
    private int heightInCM;
    private long price;

    private GoodHandler(String url, long price) {
        this.url = url;
        this.price = price;
    }

    private GoodHandler(int num, long price) {
        this.num = num;
        this.price = price;
    }

    private GoodHandler(int num, int heightInCM) {
        this.num = num;
        this.heightInCM = heightInCM;
    }

    private GoodHandler(String password, int num) {
        this.password = password;
        this.num = num;
    }

    private GoodHandler(String url, String username) {
        this.url = url;
        this.username = username;
    }

    private GoodHandler(String username) {
        this.username = username;
    }

    private GoodHandler(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    // below is factory ----------------------------------
    public static GoodHandler fromUrlAndPrice(String url, long price) {
        return new GoodHandler(url, price);
    }

    public static GoodHandler fromNumAndPrice(int num, long price) {
        return new GoodHandler(num, price);
    }

    public static GoodHandler fromNumAndHeightInCM(int num, int heightInCM) {
        return new GoodHandler(num, heightInCM);
    }

    public static GoodHandler fromPasswordAndNum(String password, int num) {
        return new GoodHandler(password, num);
    }

    public static GoodHandler fromUrlAndUsername(String url, String username) {
        return new GoodHandler(url, username);
    }

    public static GoodHandler fromUsername(String username) {
        return new GoodHandler(username);
    }

    public static GoodHandler fromUrlAndUsernameAndPassword(String url, String username, String password) {
        return new GoodHandler(url, username, password);
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
