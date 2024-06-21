package com.example.inventory_failover.services;

import common.model.BeerInventoryDto;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.UUID;

@Service
public class InventoryFailOverServiceMock implements InventoryFailOverService{

    @Override
    public BeerInventoryDto getInventoryDtoMock(UUID beerId) {
        return createDummyInventoryDto();
    }

    @Override
    public BeerInventoryDto getInventoryDtoMock() {
        return createDummyInventoryDto();
    }

    private static BeerInventoryDto createDummyInventoryDto() {
        return BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .quantityOnHand(999)
                .lastModifiedDate(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .build();
    }
}
