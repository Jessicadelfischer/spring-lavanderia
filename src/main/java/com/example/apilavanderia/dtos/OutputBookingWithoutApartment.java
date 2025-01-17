package com.example.apilavanderia.dtos;

import com.example.apilavanderia.enums.Machine;
import com.example.apilavanderia.models.Booking;

import java.time.LocalDate;

public record OutputBookingWithoutApartment(LocalDate date, String hour, Machine machine, int id) {
    public OutputBookingWithoutApartment(Booking booking) {
        this(booking.getDate(), booking.getHour().hourToString(), booking.getMachine(), booking.getId());
    }
}
