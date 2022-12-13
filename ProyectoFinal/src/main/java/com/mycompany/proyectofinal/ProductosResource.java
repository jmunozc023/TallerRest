/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mycompany.proyectofinal;

import BaseDatos.Utils;
import Pojo.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author josep
 */
@Path("productos")
public class ProductosResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ProductosResource
     */
    public ProductosResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.proyectofinal.ProductosResource
     * @param id
     * @param nombreUsuario
     * @param articulo
     * @param costoUnitario
     * @param cantidad
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> getJson(@QueryParam("id") int id, @QueryParam("u")String nombreUsuario, @QueryParam("n")String articulo, @QueryParam("c") int costoUnitario, @QueryParam("ca") int cantidad) {
        var productoList= new ArrayList<Producto>();
        
        if (nombreUsuario.isEmpty()) {
            productoList.add(Utils.productoList.get(id));
        } else {
            for (var p: Utils.productoList){
                if (p.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                    productoList.add(p);
                }
            }
        }
        return productoList;
    }

    /**
     * PUT method for updating or creating an instance of ProductosResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Producto postJson(Producto content){
        content.setId(Utils.productoList.size()+1);
        Utils.productoList.add(content);
        return content;
    }
    
    
    
}
