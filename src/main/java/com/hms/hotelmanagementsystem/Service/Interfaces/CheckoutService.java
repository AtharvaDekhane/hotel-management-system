package com.hms.hotelmanagementsystem.Service.Interfaces;

import com.hms.hotelmanagementsystem.Entity.BookingEntity;

public interface CheckoutService {

    String getCheckoutSession(BookingEntity booking, String successUrl, String failureUrl);

}
