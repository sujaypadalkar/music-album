package com.creamos.musicalbum.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/rest")
public class MusicAlbumResource {

	@Path("/hello")
	@GET
	public String sayHello(){
		return "Hello to the world of REST Web Services";
	}
	
	@Path("/hello/{user}")
	@GET
	public String sayHelloToUser(@PathParam("user") String user){
		return "Hello "+user;
	}
}
