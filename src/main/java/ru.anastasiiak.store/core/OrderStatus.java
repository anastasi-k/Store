package ru.anastasiiak.store.core;

public enum OrderStatus {
    CREATED ("создан"),
    PAID ("оплачен"),
    COMPLETED("выполнен");

    OrderStatus(String title) {
    }
}
