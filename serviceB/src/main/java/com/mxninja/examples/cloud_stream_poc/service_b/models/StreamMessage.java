package com.mxninja.examples.cloud_stream_poc.service_b.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 8/19/2018
 *
 * @author Mohammad Ali
 */

@Data
@ToString
@EqualsAndHashCode
public class StreamMessage {

    private String message;

}
