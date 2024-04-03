package com.albani.producto.view;

import com.albani.producto.model.entities.Producto;

import java.util.Scanner;

public class ProductoView {

    private Scanner scanner;

    public ProductoView(){
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("0. Salir");
    }

     public Producto obtenerNuevoProducto() {
        System.out.println("Ingrese los datos del nuevo producto:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Nombre: ");
        scanner.nextLine(); // Limpiar el buffer
        String nombre = scanner.nextLine();
        System.out.print("Precio: ");
        float precio = scanner.nextFloat();
        return new Producto(id, nombre, precio);
    }
    public int obtenerIdProducto() {
        System.out.print("Ingrese el ID del producto: ");
        return scanner.nextInt();
    }

    public Producto obtenerDatosProductoActualizar() {
        System.out.println("Ingrese los nuevos datos del producto:");
        System.out.print("ID del producto a actualizar: ");
        int id = scanner.nextInt();
        System.out.print("Nuevo nombre: ");
        scanner.nextLine(); // Limpiar el buffer
        String nombre = scanner.nextLine();
        System.out.print("Nuevo precio: ");
        float precio = scanner.nextFloat();
        return new Producto(id, nombre, precio);
    }


}