package com.mxninja.examples.cloud_stream_poc.service_a.services;

import com.mxninja.examples.cloud_stream_poc.service_a.config.StreamChannel;
import com.mxninja.examples.cloud_stream_poc.service_a.models.StreamMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

/**
 * 8/19/2018
 *
 * @author Mohammad Ali
 */

@Service
@Slf4j
public class StreamSenderService {

    private final StreamChannel SMS_STREAM;

    public StreamSenderService(StreamChannel streamChannel){
        SMS_STREAM = streamChannel;
    }

    public void sendGreeting(StreamMessage message) {
        log.info("send to topic (" + StreamChannel.OUTPUT + ") json: " + message);
        MessageChannel messageChannel = SMS_STREAM.outboundChannel();
        messageChannel.send(MessageBuilder
                .withPayload(message)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }

}
