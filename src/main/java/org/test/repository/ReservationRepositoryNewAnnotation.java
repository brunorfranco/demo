package org.test.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.entity.Reservation;

@RepositoryRestResource
public interface ReservationRepositoryNewAnnotation extends JpaRepository<Reservation, Long>{

//	@Query("...") We can override the convention using this annotation
	Collection<Reservation> findByReservationName( @Param("rn") String reservationName);
}
