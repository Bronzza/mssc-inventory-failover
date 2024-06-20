package com.example.inventory_failover.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Profile;

@Profile("local-discovery")
@EnableEurekaClient
@EnableDiscoveryClient
public class LocalDiscovery {
}
