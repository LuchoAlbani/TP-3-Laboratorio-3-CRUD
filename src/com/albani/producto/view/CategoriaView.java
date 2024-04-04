package com.albani.producto.view;

import com.albani.producto.model.entities.Categoria;

import java.util.Scanner;

public class CategoriaView {
    private Scanner scanner;

    public CategoriaView(){
        // Se inicializa el scanner para leer la entrada del usuario
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenuCategorias() {
        // Se muestra un menú de categorías al usuario
        System.out.println("1. Agregar categoría");
        System.out.println("2. Mostrar categorías");
        System.out.println("3. Actualizar categoría");
        System.out.println("4. Eliminar categoría");
        System.out.println("0. Salir");
    }

    public Categoria obtenerNuevaCategoria() {
        // Se obtiene la información de una nueva categoría del usuario
        System.out.println("Ingrese los datos de la nueva categoría:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Nombre: ");
        scanner.nextLine(); // Limpiar el buffer
        String nombre = scanner.nextLine();
        return new Categoria(id, nombre);
    }

    public int obtenerIdCategoriaEliminar() {
        // Se obtiene el ID de una categoría que el usuario desea eliminar
        System.out.print("Ingrese el ID de la categoría que desea eliminar: ");
        return scanner.nextInt();
    }

    public Categoria obtenerDatosCategoriaActualizar() {
        // Se obtiene la información actualizada de una categoría del usuario
        System.out.println("Ingrese los nuevos datos de la categoría:");
        System.out.print("ID de la categoría a actualizar: ");
        int id = scanner.nextInt();
        System.out.print("Nuevo nombre: ");
        scanner.nextLine(); // Limpiar el buffer
        String nombre = scanner.nextLine();
        return new Categoria(id, nombre);
    }

    public int obtenerOpcionMenu() {
        // Se obtiene la opción del menú que el usuario desea seleccionar
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }
}
