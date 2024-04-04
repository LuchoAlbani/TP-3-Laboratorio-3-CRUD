package com.albani.producto.model.repositories;

import com.albani.producto.model.entities.Categoria;

import java.util.ArrayList;

public class CategoriaRepository {

    public static void agregarCategoria(ArrayList<Categoria> listaCategorias, Categoria categoria){
        // Este método toma una lista de categorías y una nueva categoría.
        // Agrega la nueva categoría a la lista.
        listaCategorias.add(categoria);
    }

    public static void eliminarCategoria(ArrayList<Categoria> listaCategorias, Integer id) {
        // Este método toma una lista de categorías y un ID.
        // Recorre cada categoría en la lista y, si encuentra una categoría con el mismo ID,
        // la elimina de la lista.
        for (int i = 0; i < listaCategorias.size(); i++) {
            if (listaCategorias.get(i).getId().equals(id)) {
                listaCategorias.remove(i);
                return;
            }
        }
        System.out.println("Categoría no encontrada con el ID: " + id);
    }

    public static void actualizarCategoria(ArrayList<Categoria> listaCategorias, Categoria categoriaActualizada) {
        // Este método toma una lista de categorías y una categoría actualizada.
        // Recorre cada categoría en la lista y, si encuentra una categoría con el mismo ID que categoriaActualizada,
        // reemplaza la categoría existente con la categoría actualizada.
        for (int i = 0; i < listaCategorias.size(); i++) {
            if (listaCategorias.get(i).getId().equals(categoriaActualizada.getId())) {
                listaCategorias.set(i, categoriaActualizada);
                return;
            }
        }
        System.out.println("Categoría no encontrada con el ID: " + categoriaActualizada.getId());
    }

    public static void mostrarCategorias(ArrayList<Categoria> listaCategorias) {
        // Este método toma una lista de categorías.
        // Recorre cada categoría en la lista y la imprime en la consola.
        for (Categoria categoria : listaCategorias) {
            System.out.println("ID: " + categoria.getId() + ", Nombre: " + categoria.getNombre());
        }
    }
}
