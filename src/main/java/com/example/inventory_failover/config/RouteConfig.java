package com.example.inventory_failover.config;

import com.example.inventory_failover.controllers.InventoryHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Profile("local-discovery")
@Configuration
public class RouteConfig {

    @Bean
    public RouterFunction inventoryRoute(InventoryHandler handler) {
        return route(GET("/inventory-failover").and(accept(MediaType.APPLICATION_JSON)),
                handler::listInventory);
    }
}
