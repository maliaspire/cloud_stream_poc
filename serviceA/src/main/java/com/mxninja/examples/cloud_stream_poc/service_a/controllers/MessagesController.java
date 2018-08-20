package com.mxninja.examples.cloud_stream_poc.service_a.controllers;

import com.mxninja.examples.cloud_stream_poc.service_a.models.StreamMessage;
import com.mxninja.examples.cloud_stream_poc.service_a.services.StreamSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 8/20/2018
 *
 * @author Mohammad Ali
 */

@RestController
@RequestMapping("messaging")
public class MessagesController {

    private final StreamSenderService STREAM_SENDER_SERVICE;

    @Autowired
    public MessagesController(StreamSenderService streamSenderService) {
        STREAM_SENDER_SERVICE = streamSenderService;
    }

    /**
     * used to send message to topic in cloud stream
     * @param body json body
     * @return true if the message sent, otherwise false
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mono<Boolean>> sendMessage(@RequestBody StreamMessage body) {
        STREAM_SENDER_SERVICE.sendGreeting(body);
        return new ResponseEntity<>(Mono.just(true), HttpStatus.CREATED);
    }

}
