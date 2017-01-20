package com.movies.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.Validator;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.movies.data.ActorRetorno;
import com.movies.service.ActorList;


	@Path("/actor")
	@RequestScoped
public class ActorService {
	
		
	    @Inject
	    private ActorList repository;


	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public ActorRetorno listAllActors() {
	        return repository.readAllActor();
	    }

	    @GET
	    @Path("/{id:[0-9][0-9]*}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public ActorRetorno lookupActorById(@PathParam("id") long id) {
	         return repository.findActorById(id);
	        	         
	    }
}
