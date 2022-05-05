package com.example.jersey;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("myresource")
public class Resources {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		
		return "Hi Kawin";
	}
}
