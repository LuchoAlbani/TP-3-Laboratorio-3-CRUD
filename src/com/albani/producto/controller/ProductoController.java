package com.albani.producto.controller;

import com.albani.producto.model.entities.Producto;
import com.albani.producto.model.repositories.ProductoRepository;
import com.albani.producto.view.ProductoView;

import java.util.ArrayList;

public class ProductoController {

    private ArrayList<Producto> listaProductos;
    private ProductoView ProductoView;

    public ProductoController(){
        this.listaProductos = new ArrayList<>();
        this.ProductoView = new ProductoView();

    }
    public void agregarProducto() {
        Producto nuevoProducto = ProductoView.obtenerNuevoProducto();
        ProductoRepository.crearProducto(listaProductos, nuevoProducto);
        System.out.println("Producto agregado con éxito."); // Mensaje de éxito
    }

    public void mostrarProductos() {
        ProductoRepository.leerProductos(listaProductos);
    }

    public void actualizarProducto() {
        Producto productoActualizado = ProductoView.obtenerDatosProductoActualizar();
        ProductoRepository.actualizarProducto(listaProductos, productoActualizado);
        System.out.println("Producto actualizado con éxito."); // Mensaje de éxito
    }

    public void eliminarProducto() {
        int id = ProductoView.obtenerIdProducto();
        ProductoRepository.eliminarProducto(listaProductos, id);
    }

    public void gestionarProductos() {
        while (true) {
            ProductoView.mostrarMenu();
            int opcion = ProductoView.obtenerOpcionMenu();
            switch (opcion) {
                case 1: // Agregar producto
                    agregarProducto();
                    break;
                case 2: // Mostrar productos
                    mostrarProductos();
                    break;
                case 3: // Actualizar producto
                    actualizarProducto();
                    break;
                case 4: // Eliminar producto
                    eliminarProducto();
                    break;
                case 0: // Salir
                    return;
                default:
                    System.out.println("Opción inválida, por favor selecciona una opción válida.");
            }
        }
    }



}
