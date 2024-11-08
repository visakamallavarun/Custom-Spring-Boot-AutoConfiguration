package com.exe.Config;

import com.example.demo.Payment.Gpay;
import com.example.demo.Payment.Payment;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@AutoConfiguration
//@Configuration
public class PaymentConfig {

    @Bean
    @Primary
    public Payment payment(){
        return new Gpay("");
    }
}