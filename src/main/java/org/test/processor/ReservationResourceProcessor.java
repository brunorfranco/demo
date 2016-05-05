package org.test.processor;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;
import org.test.entity.Reservation;

@Component
public class ReservationResourceProcessor implements ResourceProcessor<Resource<Reservation>>{

	@Override
	public Resource<Reservation> process(Resource<Reservation> reservationResource) {
		reservationResource.add(new Link("http://s3.com/imgs/" + reservationResource.getContent().getId() 
				+ ".jpg", "profile-photo"));
		return reservationResource;
	}

}
