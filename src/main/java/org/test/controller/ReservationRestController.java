package org.test.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.entity.Reservation;
import org.test.repository.ReservationRepository;

@RestController
public class ReservationRestController {
	
	@RequestMapping
	Collection<Reservation> reservations(){
		return this.repo.findAll();
	}
	
	@Autowired
	private ReservationRepository repo;

}
