package com.example.tacocloud;

import lombok.Data;

/**
 * @Author: kbs
 */
@Data
public class Order {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
