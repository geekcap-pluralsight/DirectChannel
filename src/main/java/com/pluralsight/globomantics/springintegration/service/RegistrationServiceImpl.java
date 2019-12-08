package com.pluralsight.globomantics.springintegration.service;

import com.pluralsight.globomantics.springintegration.config.DirectChannelGateway;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    private static final Logger logger = LogManager.getLogger(RegistrationServiceImpl.class);

    @Autowired
    private DirectChannelGateway directChannelGateway;

    @Override
    public void setupReservation(String ... lastNames) {
        for (String lastName :lastNames ) {
            logger.info("[Thread ID: {}] Setup Reservation for user {}", Thread.currentThread().getId(), lastName);

            // Create the reservation record
            directChannelGateway.createReservationRecord(MessageBuilder.withPayload(lastName).build());
        }

        // Do other things for reservation setup...
    }
}
