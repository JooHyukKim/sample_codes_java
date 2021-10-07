package com.joohyukkim.example.builder;

import java.math.BigDecimal;

public class DeliveryOrder {
    private final String clientName;
    private final String clientNumber;
    private final Long storeNumber;
    private final BigDecimal price;
    private String request = "";

    private DeliveryOrder(String clientName, String clientNumber, Long storeNumber, BigDecimal price, String request) {
        this.clientName = clientName;
        this.clientNumber = clientNumber;
        this.storeNumber = storeNumber;
        this.price = price;
        this.request = request;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "clientName='" + clientName + '\'' +
                ", clientNumber='" + clientNumber + '\'' +
                ", storeNumber=" + storeNumber +
                ", price=" + price +
                ", request='" + request + '\'' +
                '}';
    }

    public static class Builder {
        private String clientName;
        private String clientNumber;
        private Long storeNumber;
        private BigDecimal price;
        private String request;

        public Builder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public Builder clientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }

        public Builder storeNumber(Long storeNumber) {
            this.storeNumber = storeNumber;
            return this;
        }

        public Builder request(String request) {
            this.request = request;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public DeliveryOrder build() {
            return new DeliveryOrder(
                    this.clientName,
                    this.clientNumber,
                    this.storeNumber,
                    this.price,
                    this.request
            );
        }

    }
}
