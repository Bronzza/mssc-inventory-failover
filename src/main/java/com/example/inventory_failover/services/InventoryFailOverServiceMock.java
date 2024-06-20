package com.example.inventory_failover.services;

import common.model.BeerInventoryDto;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.UUID;

@Service
public class InventoryFailOverServiceMock implements InventoryFailOverService{

    @Override
    public BeerInventoryDto getInventoryDtoMock(UUID beerId) {
        return BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(beerId)
                .quantityOnHand(999)
                .lastModifiedDate(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .build();
    }
}
