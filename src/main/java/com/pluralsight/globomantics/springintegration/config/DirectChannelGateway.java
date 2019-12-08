package com.pluralsight.globomantics.springintegration.config;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = "directChannelGateway", defaultRequestChannel = "directChannel")
public interface DirectChannelGateway {
    @Gateway
    void createReservationRecord(Message<String> lastName);
}