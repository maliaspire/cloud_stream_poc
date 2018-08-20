package com.mxninja.examples.cloud_stream_poc.service_b.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 8/19/2018
 *
 * @author Mohammad Ali
 */
public interface StreamChannel {

    String INPUT = "csp";

    @Input(INPUT)
    SubscribableChannel inboundChannel();

}
