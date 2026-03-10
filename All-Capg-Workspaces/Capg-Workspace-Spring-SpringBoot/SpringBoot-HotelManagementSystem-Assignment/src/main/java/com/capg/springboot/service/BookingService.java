package com.capg.springboot.service;

import java.util.List;
import com.capg.springboot.entity.Booking;

public interface BookingService {

    Booking addBooking(Booking booking);

    List<Booking> getAllBookings();

    Booking getBookingById(Long id);

    Booking updateBooking(Long id, Booking booking);

    void deleteBooking(Long id);
}