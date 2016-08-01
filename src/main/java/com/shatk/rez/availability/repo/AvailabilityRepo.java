package com.shatk.rez.availability.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shatk.rez.availability.domain.Availability;

@Repository
public class AvailabilityRepo {
	
	List<Availability> availabilityList;
	
	public List<Availability> searchByDate(){
		
		/**
		 * *  Make jdbc communication... hardcoded 
		 * @return
		 */
		availabilityList = new ArrayList<Availability>();
		
		Availability availability = new Availability();
		availability.setAvailableSeatsEconomy(15);
		availability.setAvailableSeatsBusiness(05);
		availabilityList.add(availability);
		
		return availabilityList;
	}
	
}
