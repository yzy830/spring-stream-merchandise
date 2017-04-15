package com.gerald.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(MerchandiseChannels.class)
public class MerchandiseApp {    
    public static void main( String[] args ) {
        SpringApplication.run(MerchandiseApp.class, args);
    }
}
