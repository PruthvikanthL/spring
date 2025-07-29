package com.icecream.management.service;

import com.icecream.management.dto.IceCreamDto;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class IceCreamService {
    private final List<String> validCoupan = Arrays.asList("WLC112", "PKWC36", "MAJAK1");
    private final Map<String, Double> flavourPrices;
    public IceCreamService() {
        System.out.println("Runnning the IceCreamService Constuctar");
        flavourPrices =new HashMap<>();
        flavourPrices.put("Vanilla", 50.0);
        flavourPrices.put("Chocolate", 60.0);
        flavourPrices.put("Strawberry", 55.0);
    }

    public double Counttotal(IceCreamDto iceCreamDto) {
        double basevalue =flavourPrices.getOrDefault(iceCreamDto.getFlavour(),0.0);
        double total=basevalue*iceCreamDto.getQuantity();
        if(iceCreamDto.isAddOns()) total+=20;
        if(iceCreamDto.isTakeAway()) total+=10;
        if(validCoupan.contains(iceCreamDto.getCoupon())){
            total=total*0.9;
        }
        return total;
    }
}
