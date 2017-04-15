package com.gerald.stream;

import javax.annotation.Resource;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {    
    @Resource(name = "createShopResp")
    private MessageChannel createShopRespChannel;
    
    private int count = 0;
    
    private int respCount = 0;
//    
//    @RequestMapping("/resp")
//    public String respShop() {
//        responseShopCreationChannel.send(MessageBuilder.withPayload("response for <" + (respCount++) + ">").build());
//        
//        return "done";
//    }
}
