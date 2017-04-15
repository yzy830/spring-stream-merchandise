package com.gerald.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MerchandiseChannels {
    @Input
    SubscribableChannel createShop();
    
    @Output
    MessageChannel createShopResp();
    
    @Input
    SubscribableChannel closeShop();
}
