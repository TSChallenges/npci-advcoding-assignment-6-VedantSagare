package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
    public Product product1() {
        Product product = new Product();
        product.setId(1);
        product.setName("Tumbler");
        return product;
    }

    @Bean
    public Product product2() {
        Product product = new Product();
        product.setId(2);
        product.setName("Bucket");
        return product;
    }
}
