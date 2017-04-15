package com.gerald.stream;

import java.util.Date;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class MerchandiseListener {    
    private int messageCount = 0;
    
    @StreamListener("createShop")
    @SendTo("createShopResp")
    public String onCreateShop(Shop shop) {
        if((++messageCount) % 3 != 0) {
            System.out.println("exception for, <" + shop + ">, time = " + new Date());
            
            throw new RuntimeException();
        }
        messageCount = 0;
        
        System.out.println("received, <" + shop + ">, time = " + new Date());
        
        return "response for <" + shop.getName() + ">";
    }
    
    @StreamListener("closeShop")
    public void onCloseShop(Shop shop) {
        System.out.println("close received, <" + shop + ">");
    }
}
