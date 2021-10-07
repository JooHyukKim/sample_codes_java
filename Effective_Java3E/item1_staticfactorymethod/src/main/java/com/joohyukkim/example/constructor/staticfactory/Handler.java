package com.joohyukkim.example.constructor.staticfactory;

public class Handler {

    private final String url;
    private final String username;
    private final String password;

    private Handler(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static Handler from(String url, String username, String password) {
        return new Handler(
                url,
                username,
                password
        );
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
