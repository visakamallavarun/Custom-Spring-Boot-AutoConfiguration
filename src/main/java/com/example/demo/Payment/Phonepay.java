package com.example.demo.Payment;

public class Phonepay implements Payment{


    @Override
    public void process() {
        System.out.println("Phonepay");
    }
}
