/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author josep
 */
public class Producto extends productoBase{

    public Producto() {
    }
    public Producto(int id, String nombreUsuario, String categoria, String articulo, int costoUnitario, int cantidad) {
        super(id, nombreUsuario, categoria, articulo, costoUnitario, cantidad);
    }

    @Override
    public void setCategoria(String categoria) {
        super.setCategoria(categoria); 
    }

    @Override
    public String getCategoria() {
        return super.getCategoria(); 
    }

    @Override
    public void setNombreUsuario(String nombreUsuario) {
        super.setNombreUsuario(nombreUsuario); 
    }

    @Override
    public String getNombreUsuario() {
        return super.getNombreUsuario(); 
    }

    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(cantidad); 
    }

    @Override
    public int getCantidad() {
        return super.getCantidad(); 
    }

    @Override
    public void setCostoUnitario(int costoUnitario) {
        super.setCostoUnitario(costoUnitario); 
    }

    @Override
    public int getCostoUnitario() {
        return super.getCostoUnitario(); 
    }

    @Override
    public void setArticulo(String articulo) {
        super.setArticulo(articulo); 
    }

    @Override
    public String getArticulo() {
        return super.getArticulo(); 
    }

    @Override
    public void setId(int id) {
        super.setId(id); 
    }

    @Override
    public int getId() {
        return super.getId(); 
    }
    
    
}

