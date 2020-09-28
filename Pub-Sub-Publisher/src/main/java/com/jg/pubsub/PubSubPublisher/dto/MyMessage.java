package com.jg.pubsub.PubSubPublisher.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyMessage {

    private String id;
    private String message;

}
