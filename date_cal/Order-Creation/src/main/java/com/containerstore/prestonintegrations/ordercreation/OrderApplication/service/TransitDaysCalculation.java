package com.containerstore.prestonintegrations.ordercreation.OrderApplication.service;

import com.containerstore.prestonintegrations.ordercreation.OrderApplication.repo.StoreRepository;
import com.containerstore.prestonintegrations.ordercreation.OrderApplication.repo.ZipcodeTransitMappingRepository;

public class TransitDaysCalculation {
    private  final ZipcodeTransitMappingRepository zipcodeTransitMappingRepository;
    private final StoreRepository storeRepository;



    public TransitDaysCalculation(ZipcodeTransitMappingRepository zipcodeTransitMappingRepository, StoreRepository storeRepository) {
        this.zipcodeTransitMappingRepository = zipcodeTransitMappingRepository;
        this.storeRepository = storeRepository;
    }

    private int calculateTransitDays(int zip,String StoreCode)
    {
        if(storeRepository.findIsPickupByStoreCode(StoreCode) ) return 0;

        return zipcodeTransitMappingRepository.findByZip(zip).getTransit_days();
    }
    public  int calculatePadTransit(String StoreCode)
    {
        if(storeRepository.findIsPadTransitByStoreCode(StoreCode)) return 1;
        return 0;
    }

}
