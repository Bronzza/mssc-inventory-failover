package com.example.inventory_failover.services;


import common.model.BeerInventoryDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface InventoryFailOverService {

    BeerInventoryDto getInventoryDtoMock(UUID beerId) ;

    BeerInventoryDto getInventoryDtoMock() ;
}
