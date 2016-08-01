package com.shatk.rez.availability.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shatk.rez.availability.domain.Availability;
import com.shatk.rez.availability.repo.AvailabilityRepo;

@Service
public class AvailabilityService {
	
	@Autowired AvailabilityRepo availabilityRepo;
	
	public List<Availability> searchByDate(){
				
		return availabilityRepo.searchByDate();
	}

}
