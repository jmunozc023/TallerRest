/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Pojo.Producto; //Import para llamar los objetos POJO del producto
import Pojo.Usuario; //Import para llamar los objetos POJO del Usuario
import java.util.ArrayList; 
import java.util.List;

/**
 *
 * @author josep
 */
public class Utils {
    public static List<Usuario> usuarioList= new ArrayList<>(); // Creacion de una lista estatica para almacenar Usuarios
    public static List<Producto> productoList= new ArrayList<>(); //Creacion de una lista estatica para almacenar productos que ingresan los usuarios
}
