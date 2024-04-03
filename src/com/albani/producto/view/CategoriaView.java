package com.albani.producto.view;

import com.albani.producto.model.entities.Categoria;

import java.util.Scanner;

public class CategoriaView {
    private Scanner scanner;

    public CategoriaView(){
        this.scanner = new Scanner(System.in);
    }
    public void mostrarMenuCategorias() {
        System.out.println("1. Agregar categoría");
        System.out.println("2. Mostrar categorías");
        System.out.println("3. Actualizar categoría");
        System.out.println("4. Eliminar categoría");
        System.out.println("0. Salir");
    }
    public Categoria obtenerNuevaCategoria() {
        System.out.println("Ingrese los datos de la nueva categoría:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Nombre: ");
        scanner.nextLine(); // Limpiar el buffer
        String nombre = scanner.nextLine();
        return new Categoria(id, nombre);
    }

    public int obtenerIdCategoriaEliminar() {
        System.out.print("Ingrese el ID de la categoría que desea eliminar: ");
        return scanner.nextInt();
    }

    public Categoria obtenerDatosCategoriaActualizar() {
        System.out.println("Ingrese los nuevos datos de la categoría:");
        System.out.print("ID de la categoría a actualizar: ");
        int id = scanner.nextInt();
        System.out.print("Nuevo nombre: ");
        scanner.nextLine(); // Limpiar el buffer
        String nombre = scanner.nextLine();
        return new Categoria(id, nombre);
    }

    public int obtenerOpcionMenu() {
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }


}
