package com.coupon.customer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = {"com.coupon"})
@EnableFeignClients(basePackages = {"com.coupon"})
public class CouponCustomerApplication {

    public static void main(String[] args){
        SpringApplication.run(CouponCustomerApplication.class,args);
    }
}
