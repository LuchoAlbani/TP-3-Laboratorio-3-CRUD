package com.albani.producto.model.repositories;

import com.albani.producto.model.entities.Producto;

import java.util.ArrayList;

public class ProductoRepository {

    //CREAR UN PRODUCTO
    public static void crearProducto(ArrayList<Producto> listaProductos, Producto producto){
        // Este método toma una lista de productos y un producto nuevo.
        // Agrega el nuevo producto a la lista.
        listaProductos.add(producto);
    }

    //LEER LOS PRODUCTOS = MOSTRAR
    public static void leerProductos(ArrayList<Producto> listaProductos){
        // Este método toma una lista de productos.
        // Recorre cada producto en la lista y lo imprime en la consola,
        // incluyendo su categoría.
        for (Producto producto : listaProductos) {
            System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Categoría: " + producto.getCategoria().getNombre());
        }
    }

    //ACTUALIZAR UN PRODUCTO
    public static void actualizarProducto(ArrayList<Producto> listaProductos, Producto productoActualizado){
        // Este método toma una lista de productos y un producto actualizado.
        // Recorre cada producto en la lista y, si encuentra un producto con el mismo ID que productoActualizado,
        // reemplaza el producto existente con el producto actualizado.
        for(int i=0; i<listaProductos.size(); i++){
            if (listaProductos.get(i).getId().equals(productoActualizado.getId())){
                listaProductos.set(i, productoActualizado);
                return;
            }else{
                System.out.printf("Producto no encontrado con el ID: " + productoActualizado.getId());
            }
        }
    }

    //ELIMINAR UN PRODUCTO
    public static void eliminarProducto(ArrayList<Producto> listaProductos, Integer id){
        // Este método toma una lista de productos y un ID.
        // Recorre cada producto en la lista y, si encuentra un producto con el mismo ID,
        // lo elimina de la lista.
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
