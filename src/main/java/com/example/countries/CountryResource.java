package com.example.countries;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/countries")
public class CountryResource {

    @Inject
    @RestClient
    CountryService countryService;

    @GET
    @Path("/capital/{capitalName}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCountryByCapital(@PathParam("capitalName") String capitalName) {
        return countryService.getCountryByName(capitalName);
    }
}