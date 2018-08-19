package com.codepianist.controller.rest;

import com.codepianist.data.UserMemoryDAO;
import com.codepianist.model.User;
import com.codepianist.model.entities.UserEntity;
import com.codepianist.model.resource.UserResource;
import com.google.common.base.Joiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;


@Path("/v1/user")
public class UserController {

    private static final Logger L= LoggerFactory.getLogger(UserController.class);
    private UserMemoryDAO userDAO= new UserMemoryDAO();

    @POST
    @Path("create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(UserResource user){

        L.info(Joiner.on(" ").join("Received user= ", user));
        try {
            UserEntity userEntity = User.toUserEntity(user);
            userDAO.create(userEntity);
            return Response.status(201)
                    .entity("User created!")
                    .build();
        }
        catch (Exception e){
            return Response.status(403)
                    .entity("Failed to create user!")
                    .build();
        }

    }

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAll(){
        List<UserEntity> result= userDAO.listAll();
        List<UserResource> list= result.stream()
            .map(User::toUserResponse)
            .collect(Collectors.toList());
        return Response.status(201)
                .entity(list)
                .build();

    }

}
