package com.gerald.stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.binder.ExtendedConsumerProperties;
import org.springframework.cloud.stream.binder.ExtendedProducerProperties;
import org.springframework.cloud.stream.binder.kafka.KafkaConsumerProperties;
import org.springframework.cloud.stream.binder.kafka.KafkaMessageChannelBinder;
import org.springframework.cloud.stream.binder.kafka.KafkaProducerProperties;
import org.springframework.stereotype.Component;

@Component
public class Binding {
//    @Autowired
//    private KafkaMessageChannelBinder binder;
//    
//    @Autowired
//    private ShopChannels channels;
    
    public static final String KEY_SERIALIZER = "key.serializer";
    
    public static final String KEY_DESERIALIZER = "key.deserializer";
    
    public static final String VALUE_SERIALIZER = "value.serializer";
    
    public static final String VALUE_DESERIALIZER = "value.deserializer"; 
    
    @PostConstruct
    public void postConstruct() {
//        binder.bindConsumer("createShop", "merchandise-server", channels.onCreateShop(), extendedConsumerProperties());
//        binder.bindProducer("createShop", channels.createShop(), extendedProducerProperties());
//        
//        binder.bindConsumer("createShopResp", "shop-server", channels.createShopResp(), extendedConsumerProperties());
//        binder.bindProducer("createShopResp", channels.responseShopCreation(), extendedProducerProperties());
//        
//        binder.bindConsumer("closeShop", "merchandise-server", channels.onCloseShop(), extendedConsumerProperties());
//        binder.bindProducer("closeShop", channels.closeShop(), extendedProducerProperties());
    }
    
    private ExtendedConsumerProperties<KafkaConsumerProperties> extendedConsumerProperties() {
        return new ExtendedConsumerProperties<>(new KafkaConsumerProperties());
    }
    
    private ExtendedProducerProperties<KafkaProducerProperties> extendedProducerProperties() {
        KafkaProducerProperties props = new KafkaProducerProperties();
        return new ExtendedProducerProperties<>(props);
    }
}
