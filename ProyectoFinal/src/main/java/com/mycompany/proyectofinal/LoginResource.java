/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mycompany.proyectofinal;

import BaseDatos.Utils;
import Pojo.Usuario;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author josep
 */
@Path("login")
public class LoginResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LoginResource
     */
    public LoginResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.proyectofinal.LoginResource
     * @param nombreUsuario
     * @param password
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getJson(@QueryParam("u")String nombreUsuario, @QueryParam("p")String password) {
        for (var u : Utils.usuarioList) {
            if (u.getNombreUsuario().equals(nombreUsuario)&& u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    /**
     * PUT method for updating or creating an instance of LoginResource
     * @param content representation for the resource
     * @return 
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Usuario postJson(Usuario content) {
        content.setId(Utils.usuarioList.size()+1);
        Utils.usuarioList.add(content);
        return content;
    }
}
