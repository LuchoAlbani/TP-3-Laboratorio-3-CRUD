package com.albani.producto.model.repositories;

import com.albani.producto.model.entities.Producto;

import java.util.ArrayList;

public class ProductoRepository {

    //CREAR UN PRODUCTO
    public static void crearProducto(ArrayList<Producto> listaProductos, Producto producto){
        listaProductos.add(producto);
    }

    //LEER LOS PRODUCTOS = MOSTRAR
    public static void leerProductos(ArrayList<Producto> listaProductos){
        for (Producto producto : listaProductos){
            System.out.println(producto);
        }
    }

    //ACTUALIZAR UN PRODUCTO
    public static void actualizarProducto(ArrayList<Producto> listaProductos, Producto productoActualizado){
        for(int i=0; i<listaProductos.size(); i++){
            if (listaProductos.get(i).getId().equals(productoActualizado.getId())){
                listaProductos.set(i, productoActualizado);
                return;
            }else{
                System.out.printf("Producto no encontroado con el ID: " + productoActualizado.getId());
            }
        }

    }

    //ELIMINAR UN PRODUCTO
    public static void eliminarProducto(ArrayList<Producto> listaProductos, Integer id){
        for(int i=0; i<listaProductos.size(); i++){
            if (listaProductos.get(i).getId().equals(id)){
                listaProductos.remove(i);
                return;
            }else{
                System.out.println("Producto no encontrado con el ID: "+ id);
            }

        }

    }

}
