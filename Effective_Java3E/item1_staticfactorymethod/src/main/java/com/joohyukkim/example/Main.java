package com.joohyukkim.example;

import com.joohyukkim.example.constructor.overloading.BadHandler;
import com.joohyukkim.example.constructor.staticfactory.GoodHandler;
import com.joohyukkim.example.constructor.staticfactory.Handler;
import com.joohyukkim.example.builder.DeliveryOrder;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        builderTest();
        handlerTest();
        badHandlerTest();
        goodHandlerTest();
    }

    private static void goodHandlerTest() {
        String url = "joohyukkim.com";
        String username = "JooHyukKim";
        String password = "changeme";
        int num = 22;
        int heightInCM = 140;
        long price = 1232131L;

        GoodHandler handler = GoodHandler.fromUrlAndPrice(url, price);
        handler = GoodHandler.fromNumAndPrice(num, price);
        handler = GoodHandler.fromNumAndHeightInCM(num, heightInCM);
        handler = GoodHandler.fromPasswordAndNum(password, num);
        handler = GoodHandler.fromUrlAndUsername(url, username);
        handler = GoodHandler.fromUsername(username);
        handler = GoodHandler.fromUrlAndUsernameAndPassword(url, username, password);

    }


    private static void badHandlerTest() {
        String url = "joohyukkim.com";
        String username = "JooHyukKim";
        String password = "changeme";
        int num = 22;
        int heightInCM = 140;
        long price = 1232131L;

        BadHandler handler = new BadHandler(url, price);
        handler = new BadHandler(num, price);
        handler = new BadHandler(num, heightInCM);
        handler = new BadHandler(password, num);
        handler = new BadHandler(url, username);
        handler = new BadHandler(username);
        handler = new BadHandler(url, username, password);

    }


    public static void builderTest() {
        System.out.println("----------------------------------");

        System.out.println("creating instance of a Delivery Order");
        DeliveryOrder order = new DeliveryOrder.Builder()
                .clientName("Kim, Joo Hyuk")
                .clientNumber("ZRC1235412")
                .storeNumber(12790211L)
                .price(new BigDecimal("17991.2911112"))
                .build();

        System.out.println("created  :  " + order);

        System.out.println("----------------------------------");
    }

    public static void handlerTest() {
        System.out.println("----------------------------------");

        System.out.println("Creating instance of a Handler");

        Handler handler = Handler.from(
                "jdbc://postgressql.com/database?tablename"
                , "kimjoohyuk"
                , "changeme"
        );

        System.out.println("created  :   " + handler);

        System.out.println("----------------------------------");

    }
}
