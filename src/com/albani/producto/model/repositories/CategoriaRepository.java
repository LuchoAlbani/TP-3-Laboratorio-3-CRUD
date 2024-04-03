package com.albani.producto.model.repositories;

import com.albani.producto.model.entities.Categoria;


import java.util.ArrayList;

public class CategoriaRepository {

    public static void agregarCategoria(ArrayList<Categoria> listaCategorias, Categoria categoria){
        listaCategorias.add(categoria);
    }
    public static void eliminarCategoria(ArrayList<Categoria> listaCategorias, Integer id) {
        for (int i = 0; i < listaCategorias.size(); i++) {
            if (listaCategorias.get(i).getId().equals(id)) {
                listaCategorias.remove(i);
                return;
            }
        }
        System.out.println("Categoría no encontrada con el ID: " + id);
    }

    public static void actualizarCategoria(ArrayList<Categoria> listaCategorias, Categoria categoriaActualizada) {
        for (int i = 0; i < listaCategorias.size(); i++) {
            if (listaCategorias.get(i).getId().equals(categoriaActualizada.getId())) {
                listaCategorias.set(i, categoriaActualizada);
                return;
            }
        }
        System.out.println("Categoría no encontrada con el ID: " + categoriaActualizada.getId());
    }

    public static void mostrarCategorias(ArrayList<Categoria> listaCategorias) {
        for (Categoria categoria : listaCategorias) {
            System.out.println("ID: " + categoria.getId() + ", Nombre: " + categoria.getNombre());
        }
    }


}
