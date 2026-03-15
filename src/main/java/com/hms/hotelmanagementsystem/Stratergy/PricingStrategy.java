package com.hms.hotelmanagementsystem.Stratergy;

import com.hms.hotelmanagementsystem.Entity.InventoryEntity;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(InventoryEntity inventory);
}
