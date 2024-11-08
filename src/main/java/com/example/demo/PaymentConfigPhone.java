package com.example.demo;

import com.example.demo.Payment.Payment;
import com.example.demo.Payment.Phonepay;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
@AutoConfiguration
@ConditionalOnClass(value = product.class)
public class PaymentConfigPhone {

    @Bean
    @ConditionalOnClass(value = Phonepay.class)
    @ConditionalOnBean(value = product.class)
    public Payment payments(){
        return new Phonepay();
    }
}