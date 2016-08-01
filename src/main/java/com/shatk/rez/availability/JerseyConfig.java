
package com.shatk.rez.availability;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.shatk.rez.availability.endpoints.AvailabilityEndPoint;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(AvailabilityEndPoint.class);
	}

}
