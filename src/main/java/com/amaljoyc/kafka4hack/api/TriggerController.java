package com.amaljoyc.kafka4hack.api;

import com.amaljoyc.kafka4hack.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by achemparathy on 07.11.17.
 */
@RestController
public class TriggerController {

    @Value("${kafka.topic}")
    private String topic;

    @Autowired
    private Sender sender;

    @RequestMapping(method = RequestMethod.GET, value = "/send")
    public void sendMessage(@RequestParam(value = "payload") String payload) {
        sender.send(topic, payload);
    }
}
