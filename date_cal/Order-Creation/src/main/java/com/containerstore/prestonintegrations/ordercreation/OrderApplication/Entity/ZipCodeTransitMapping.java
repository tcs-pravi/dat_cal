package com.containerstore.prestonintegrations.ordercreation.OrderApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="transit_days")
public class ZipCodeTransitMapping {

    @Id
    private int zip;
    private String city;
    private String state;
    private int transit_days;
}
