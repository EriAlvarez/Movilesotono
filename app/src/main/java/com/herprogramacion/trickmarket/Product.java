package com.herprogramacion.trickmarket;

/**
 * POJO de un producto
 */
public class Product {
    /**
     * Nombre del producto
     */
    private String nombre;
    /**
     * Especificaciones del producto
     */
    private String descripcion;
    /**
     * Precio del producto
     */
    private String precio;
    /**
     * Valoraciones del producto
     */
    private String horario;
    /**
     * Identificador del campo horario
     */
    private float rating;
    /**
     * Identificador de la imagen para miniatura
     */
    private int idThumbnail;

    public Product(String nombre, String descripcion, String precio, String horario, float rating, int idThumbnail) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.horario= horario;
        this.rating = rating;
        this.idThumbnail = idThumbnail;
    }

    public Product() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getHorario() { return horario; }

    public float getRating() {
        return rating;
    }

    public int getIdThumbnail() {
        return idThumbnail;
    }
}
