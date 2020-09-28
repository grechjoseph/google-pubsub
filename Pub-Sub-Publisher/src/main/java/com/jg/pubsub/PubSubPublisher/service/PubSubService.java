package com.jg.pubsub.PubSubPublisher.service;

import com.jg.pubsub.PubSubPublisher.dto.MyMessage;
import com.jg.pubsub.PubSubPublisher.messaging.PubSubOutboundGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
@EnableScheduling
@RequiredArgsConstructor
public class PubSubService {

    private final PubSubOutboundGateway messagingGateway;

    @Scheduled(fixedDelay = 3_000L)
    public void publishMessage() {
        messagingGateway.sendToPubsub(MyMessage.builder()
                .id(UUID.randomUUID().toString())
                .message("From Publisher.")
                .build());
        log.info("Message sent to gateway.");
    }

}
