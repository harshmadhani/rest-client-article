package com.example.countries;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RegisterRestClient(baseUri = "https://restcountries.com/v3.1")
public interface CountryService {
    @GET
    @Path("/capital/{capitalName}")
    String getCountryByName(@PathParam("capitalName") String capitalName);
}
