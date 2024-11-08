package com.example.demo.Payment;

import org.springframework.stereotype.Component;


public class Gpay implements Payment{

    public Gpay(String value){

    }

    @Override
    public void process() {
        System.out.println("Gpay");
    }
}
