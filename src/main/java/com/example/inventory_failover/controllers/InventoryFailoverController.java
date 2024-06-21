package com.example.inventory_failover.controllers;

import com.example.inventory_failover.services.InventoryFailOverService;
import common.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Profile("!local-discovery")
@Slf4j
@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
public class InventoryFailoverController {

    private final InventoryFailOverService failOverService;

    @GetMapping("/inventory/{beerId}")
    BeerInventoryDto listBeersById(@PathVariable UUID beerId){
        log.debug("Accessing inventory failover service for beer with id:" + beerId);

        BeerInventoryDto inventoryDtoMock = failOverService.getInventoryDtoMock(beerId);
        return inventoryDtoMock;
    }


}
