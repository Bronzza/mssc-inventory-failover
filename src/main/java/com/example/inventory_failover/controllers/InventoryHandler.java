package com.example.inventory_failover.controllers;

import com.example.inventory_failover.services.InventoryFailOverService;
import common.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Profile("local-discovery")
@Component
@RequiredArgsConstructor
public class InventoryHandler {

    private final InventoryFailOverService failOverService;

    public Mono<ServerResponse> listInventory(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(failOverService.getInventoryDtoMock()), BeerInventoryDto.class);
    }
}
