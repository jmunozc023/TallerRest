/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mycompany.proyectofinal;

import BaseDatos.Utils; //Import para tener acceso a los recursos de las listas
import Pojo.Usuario; //Import para tener acceso a los objetos Pojo del Usuario
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
@Path("login") //Path login para poder ser accedido por REST
public class LoginResource { //Clase REST para el Login

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
    //Implementacion del verbo Get de Rest, que obtiene un objeto Usuario y lo ordena con los Querys necesarios para crear el JSON
    public Usuario getJson(@QueryParam("u")String nombreUsuario, @QueryParam("p")String password) {
        //Validacion de los datos de Usuario para retornar al sistema si son correctos
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
    //Implementacion del verbo POST de Rest, que obtiene un objeto Usuario y lo envia convertido en JSON
    public Usuario postJson(Usuario content) {
        content.setId(Utils.usuarioList.size()+1);
        Utils.usuarioList.add(content);
        return content;
    }
}
