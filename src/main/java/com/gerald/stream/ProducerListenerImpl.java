package com.gerald.stream;

import org.springframework.kafka.support.ProducerListenerAdapter;

public class ProducerListenerImpl<K,V> extends ProducerListenerAdapter<K, V> {
    @Override
    public void onError(String topic, Integer partition, K key, V value, Exception exception) {
        System.out.println("fail to send message. target = <" + topic + ":" + partition + ">, " + "key = " + key + ", value = " + value);
        exception.printStackTrace();
    }
}
