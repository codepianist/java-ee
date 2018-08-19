package com.codepianist.controller.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/v1/test")
public class TestController {

    @GET
    public String test(){
        return "Tested!";
    }

}
