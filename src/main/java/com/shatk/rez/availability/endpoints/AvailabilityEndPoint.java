package com.shatk.rez.availability.endpoints;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shatk.rez.availability.domain.Availability;
import com.shatk.rez.availability.service.AvailabilityService;

@Component
@Path("/availability")
public class AvailabilityEndPoint {
	
	private static final Logger logger = LoggerFactory.getLogger(AvailabilityEndPoint.class);
	
	@Autowired 
	private AvailabilityService availabilityService;

	@GET
	@Path("/searchByDate")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Availability> searchByDate() {
		logger.info("----- AvailabilityEndPoint: searchByDate() invoked..... " );
		return availabilityService.searchByDate();

	}

}
