package ru.netology.service;

public class CustomsService{
    public static final int TARIFF = 100;
    public static int calculateCustoms(int price, int weight) {
        int tax = price/100 + weight*TARIFF;
        return tax;
    }
}