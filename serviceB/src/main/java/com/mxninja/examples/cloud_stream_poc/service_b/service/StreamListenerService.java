package com.mxninja.examples.cloud_stream_poc.service_b.service;

import com.mxninja.examples.cloud_stream_poc.service_b.config.StreamChannel;
import com.mxninja.examples.cloud_stream_poc.service_b.models.StreamMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * 8/19/2018
 *
 * @author Mohammad Ali
 */

@Component
@Slf4j
public class StreamListenerService {

    @StreamListener(StreamChannel.INPUT)
    public void handleStream(@Payload StreamMessage message) {
        log.info("Receive from topic(" + StreamChannel.INPUT + ") json: " + message);
    }

}
