package com.albani.producto.controller;

import com.albani.producto.model.entities.Categoria;
import com.albani.producto.model.repositories.CategoriaRepository;
import com.albani.producto.view.CategoriaView;

import java.util.ArrayList;

public class CategoriaController {
    private ArrayList<Categoria> listaCategorias;
    private CategoriaView categoriaView;

    public CategoriaController() {
        // Se inicializa la lista de categorías y la vista de categorías
        this.listaCategorias = new ArrayList<>();
        this.categoriaView = new CategoriaView();
    }

    public void agregarCategoria() {
        // Se obtiene una nueva categoría de la vista y se agrega a la lista de categorías
        Categoria nuevaCategoria = categoriaView.obtenerNuevaCategoria();
        CategoriaRepository.agregarCategoria(listaCategorias, nuevaCategoria);
    }

    public void mostrarCategorias() {
        // Se muestran todas las categorías en la lista de categorías
        CategoriaRepository.mostrarCategorias(listaCategorias);
    }

    public void actualizarCategoria() {
        // Se obtienen los datos actualizados de una categoría de la vista y se actualiza en la lista de categorías
        Categoria categoriaActualizada = categoriaView.obtenerDatosCategoriaActualizar();
        CategoriaRepository.actualizarCategoria(listaCategorias, categoriaActualizada);
    }

    public void eliminarCategoria() {
        // Se obtiene el ID de una categoría de la vista y se elimina de la lista de categorías
        int id = categoriaView.obtenerIdCategoriaEliminar();
        CategoriaRepository.eliminarCategoria(listaCategorias, id);
    }

    public void gestionarCategorias() {
        // Bucle infinito que muestra un menú de categorías al usuario hasta que decida salir
        while (true) {
            categoriaView.mostrarMenuCategorias();
            int opcion = categoriaView.obtenerOpcionMenu();
            switch (opcion) {
                case 1: // Agregar categoría
                    agregarCategoria();
                    break;
                case 2: // Mostrar categorías
                    mostrarCategorias();
                    break;
                case 3: // Actualizar categoría
                    actualizarCategoria();
                    break;
                case 4: // Eliminar categoría
                    eliminarCategoria();
                    break;
                case 0: // Salir
                    return;
                default:
                    System.out.println("Opción inválida, por favor selecciona una opción válida.");
            }
        }
    }
}
