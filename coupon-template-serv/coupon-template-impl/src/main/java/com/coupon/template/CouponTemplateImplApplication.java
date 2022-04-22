package com.coupon.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = {"com.coupon"})
public class CouponTemplateImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponTemplateImplApplication.class, args);
    }

}
