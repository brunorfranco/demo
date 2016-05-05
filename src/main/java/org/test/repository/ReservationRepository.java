package org.test.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

//	@Query("...") We can override the convention using this annotation
	Collection<Reservation> findByReservationName(String reservationName);
}
