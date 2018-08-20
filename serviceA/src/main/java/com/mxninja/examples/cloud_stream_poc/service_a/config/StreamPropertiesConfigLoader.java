package com.mxninja.examples.cloud_stream_poc.service_a.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * 8/20/2018
 *
 * @author Mohammad Ali
 */

@Data
@Validated
@ConfigurationProperties("csp.kafka")
@Component
public class StreamPropertiesConfigLoader {

    private String topic;

}
