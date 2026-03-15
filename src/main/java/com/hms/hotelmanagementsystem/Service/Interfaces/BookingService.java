package com.hms.hotelmanagementsystem.Service.Interfaces;

import com.hms.hotelmanagementsystem.Dto.BookingDTO;
import com.hms.hotelmanagementsystem.Dto.BookingRequest;
import com.hms.hotelmanagementsystem.Dto.GuestDTO;
import com.hms.hotelmanagementsystem.Dto.HotelReportDTO;
import com.hms.hotelmanagementsystem.Enum.BookingStatus;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    BookingDTO initialiseBooking(BookingRequest bookingRequest);

    BookingDTO addGuests(Long bookingId, List<GuestDTO> guestDtoList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDTO> getAllBookingsByHotelId(Long hotelId);

    HotelReportDTO getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDTO> getMyBookings();
}
