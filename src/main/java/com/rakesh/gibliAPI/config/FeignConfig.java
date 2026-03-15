package com.rakesh.gibliAPI.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FeignConfig {

    @Bean
    public Encoder encoder(){
        return new SpringFormEncoder();
//        return new SpringFormEncoder(
//                new SpringEncoder(() -> new HttpMessageConverters(new RestTemplate().getMessageConverters()))
//        );
    }
}