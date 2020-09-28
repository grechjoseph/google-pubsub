package com.jg.pubsub.PubSubPublisher.messaging;

import com.jg.pubsub.PubSubPublisher.dto.MyMessage;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "pubsubOutputChannel")
public interface PubSubOutboundGateway {

    void sendToPubsub(MyMessage message);

}
