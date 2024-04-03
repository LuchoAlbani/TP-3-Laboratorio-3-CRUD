package com.albani.producto.controller;

import com.albani.producto.model.entities.Categoria;
import com.albani.producto.model.repositories.CategoriaRepository;
import com.albani.producto.view.CategoriaView;

import java.util.ArrayList;

public class CategoriaController {
    private ArrayList<Categoria> listaCategorias;
    private CategoriaView categoriaView;

    public CategoriaController() {
        this.listaCategorias = new ArrayList<>();
        this.categoriaView = new CategoriaView();
    }

    public void agregarCategoria() {
        Categoria nuevaCategoria = categoriaView.obtenerNuevaCategoria();
        CategoriaRepository.agregarCategoria(listaCategorias, nuevaCategoria);
    }

    public void mostrarCategorias() {
        CategoriaRepository.mostrarCategorias(listaCategorias);
    }

    public void actualizarCategoria() {
        Categoria categoriaActualizada = categoriaView.obtenerDatosCategoriaActualizar();
        CategoriaRepository.actualizarCategoria(listaCategorias, categoriaActualizada);
    }

    public void eliminarCategoria() {
        int id = categoriaView.obtenerIdCategoriaEliminar();
        CategoriaRepository.eliminarCategoria(listaCategorias, id);
    }

    public void gestionarCategorias() {
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
