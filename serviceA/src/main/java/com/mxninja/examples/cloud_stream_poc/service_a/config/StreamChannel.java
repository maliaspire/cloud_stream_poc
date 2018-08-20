package com.mxninja.examples.cloud_stream_poc.service_a.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 8/19/2018
 *
 * @author Mohammad Ali
 */
public interface StreamChannel {

    String OUTPUT = "csp";

    @Output(OUTPUT)
    MessageChannel outboundChannel();

}
