package com.containerstore.prestonintegrations.ordercreation.OrderApplication.repo;

import com.containerstore.prestonintegrations.ordercreation.OrderApplication.Entity.ZipCodeTransitMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransitDaysRepository extends JpaRepository<ZipCodeTransitMapping, Integer> {
    ZipCodeTransitMapping findByZip(int zip);
}
