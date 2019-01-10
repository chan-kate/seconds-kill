package com.nd.config;


import com.nd.api.dto.JsonSerializer;
import com.nd.api.dto.Stock;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date : ${date} ${time}
 * @author : 新梦想IT教育.陈超
 * @version V1.0
 */
@Configuration
public class KafkaConfig {

    @Value("${kafka.brokerList}")
    private String brokerList ;

    @Value("${kafka.swicth}")
    private boolean check ;

    @Bean
    public KafkaProducer<String,Stock> build(){

        if (!check){
            return null ;
        }

        //初始化生产者
        Map<String, Object> props = new HashMap<String, Object>(16);
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("metadata.broker.list", brokerList);
        props.put("bootstrap.servers", brokerList);
        props.put("key.serializer", StringSerializer.class);
        props.put("value.serializer", JsonSerializer.class);
        KafkaProducer<String, Stock> producer = new KafkaProducer(props);
        return producer ;
    }

}
