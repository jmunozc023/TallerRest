/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mycompany.tallerrest3;

import Database.Utils;
import Pojo.User;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author josep
 */
@Path("logiin")
@RequestScoped
public class LogiinResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LogiinResource
     */
    public LogiinResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.tallerrest3.LogiinResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public User getJson(@QueryParam("u")String userName, @QueryParam("p")String password) {
       for(User u : Utils.userList)
        {
            if(u.getPassword().equals(password) && u.getUserName().equals(userName))
                return u;
        }
      
      return null;
    }

    /**
     * PUT method for updating or creating an instance of LogiinResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public User putJson(User content) {
        content.setId(Utils.userList.size() + 1 );
        Utils.userList.add(content);
        
        return content;
    }
}
