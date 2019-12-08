package com.pluralsight.globomantics.springintegration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableIntegration
public class DirectChannelConfig {
    @Bean
    public MessageChannel directChannel() {
        return new DirectChannel();
    }
}