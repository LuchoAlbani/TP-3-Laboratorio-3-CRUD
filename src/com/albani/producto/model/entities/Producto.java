package com.albani.producto.model.entities;

public class Producto {

    private Integer id;
    private String nombre;
    private Float precio;
    private Categoria categoria; // Nuevo atributo

    public Producto(Integer id, String nombre, Float precio, Categoria categoria) {
        // Constructor de la clase Producto
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria; // Inicializar la categoría
    }

    // Métodos getter y setter para los atributos de la clase Producto
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() { // Nuevo método getter
        return categoria;
    }

    public void setCategoria(Categoria categoria) { // Nuevo método setter
        this.categoria = categoria;
    }
}
