package com.containerstore.prestonintegrations.ordercreation.OrderApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "store")
public class Store {

    @Id
    private String store_code;
    private String store_number;
    private Long store_phone;
    private String store_name;
    private String shipMarket;
    private boolean isPickup;
    private boolean isPadTransit;
}
