package com.containerstore.prestonintegrations.ordercreation.OrderApplication.service;

import com.containerstore.prestonintegrations.ordercreation.OrderApplication.repo.StoreCodeRepository;
import com.containerstore.prestonintegrations.ordercreation.OrderApplication.repo.TransitDaysRepository;

public class TransitDaysCalculation {
    private  final TransitDaysRepository transitDaysRepository;
    private final StoreCodeRepository storeCodeRepository;



    public TransitDaysCalculation(TransitDaysRepository transitDaysRepository, StoreCodeRepository storeCodeRepository) {
        this.transitDaysRepository = transitDaysRepository;
        this.storeCodeRepository = storeCodeRepository;
    }

    private int calculateTransitDays(int zip,String StoreCode)
    {
        if(storeCodeRepository.findIsPickupByStoreCode(StoreCode) ) return 0;

        return transitDaysRepository.findByZip(zip).getTransit_days();
    }
    public  int calculatePadTransit(Boolean isPadTransit)
    {
        if(isPadTransit) return 1;
        return 0;
    }

}
