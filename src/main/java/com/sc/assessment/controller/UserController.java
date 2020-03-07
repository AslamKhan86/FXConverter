package com.sc.assessment.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sc.assessment.exception.UserException;
import com.sc.assessment.service.UserService;
import com.sc.assessment.service.impl.UserServiceImpl;

@Path("/user/profile")
public class UserController {

	UserService userService = new UserServiceImpl();

	@Path("{userId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserProfile(@PathParam("userId") String userId) {
		try {
			return Response.status(200).entity(userService.getUserData(userId)).build();
		} catch (UserException userEx) {
			return Response.status(userEx.getErrorCode()).entity(userEx.getErrorMsg()).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Internal Server Error").build();
		}
	}
}
