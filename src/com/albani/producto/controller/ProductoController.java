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
    }

    public void mostrarProductos() {
        ProductoRepository.leerProductos(listaProductos);
    }

    public void actualizarProducto() {
        Producto productoActualizado = ProductoView.obtenerDatosProductoActualizar();
        ProductoRepository.actualizarProducto(listaProductos, productoActualizado);
    }

    public void eliminarProducto() {
        int id = ProductoView.obtenerIdProducto();
        ProductoRepository.eliminarProducto(listaProductos, id);
    }



}
