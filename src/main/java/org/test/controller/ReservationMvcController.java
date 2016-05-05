package org.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.test.repository.ReservationRepository;

@Controller
public class ReservationMvcController {

	@RequestMapping("/reservations.php")
	public String reservations(Model model){
		model.addAttribute("reservations", this.rr.findAll());
		
		return "reservations"; //src/main/resources/templates/...
	}
	
	@Autowired
	private ReservationRepository rr;
}
