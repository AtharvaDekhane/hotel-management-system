package com.hms.hotelmanagementsystem.Stratergy;

import com.hms.hotelmanagementsystem.Entity.InventoryEntity;

import java.math.BigDecimal;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(InventoryEntity inventory) {
        return inventory.getRoom().getBasePrice();
    }
}
