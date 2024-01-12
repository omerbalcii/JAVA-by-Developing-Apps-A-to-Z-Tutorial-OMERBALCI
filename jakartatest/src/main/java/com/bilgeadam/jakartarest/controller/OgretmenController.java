package com.bilgeadam.jakartarest.controller;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path(value = "/ogretmen")
public class OgretmenController
{
	@GET
	@Path(value = "/getall")
	public String print()
	{
		// localhost:8080/jakartatest/ogretmen/getall
		return "Hello, Worlddd!";
	}
	 
}