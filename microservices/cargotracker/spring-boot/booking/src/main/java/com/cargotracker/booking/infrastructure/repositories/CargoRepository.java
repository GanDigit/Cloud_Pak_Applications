package com.cargotracker.booking.infrastructure.repositories;

import com.cargotracker.booking.domain.model.aggregates.BookingId;
import com.cargotracker.booking.domain.model.aggregates.Cargo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Repository class for the Cargo Aggregate
 */
public interface CargoRepository extends JpaRepository<Cargo, Long> {
     Cargo findByBookingId(BookingId bookingId);

     List<BookingId> findAllBookingIds();
     List<Cargo> findAll();
}