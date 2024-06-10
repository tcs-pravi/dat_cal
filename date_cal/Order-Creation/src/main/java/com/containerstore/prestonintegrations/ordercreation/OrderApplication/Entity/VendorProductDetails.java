package com.containerstore.prestonintegrations.ordercreation.OrderApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vendor_product_holiday")
public class VendorProductDetails {

    @Id
    @GeneratedValue
    private int id;
    private String vendor_name;
    private String product_desc;
    private String manufacturing_code;
    private long manufacturing_total_biz_days;
    private String replacement_manufacturing_code;
    private long replacement_manufacturing_total_biz_days;
}
