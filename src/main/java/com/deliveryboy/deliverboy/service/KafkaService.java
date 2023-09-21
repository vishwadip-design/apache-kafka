package com.deliveryboy.deliverboy.service;

import com.deliveryboy.deliverboy.config.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    //can produce message using kafkaTemplate
    @Autowired
    KafkaTemplate<String,String>kafkaTemplate;

    private Logger logger=LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){

        this.kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME,location);
        this.logger.info(" messages produced");
        return true;
    }

}
