/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Isadora
 */
public class Producto {
    private String nombre;
    private int precioNeto;
    private int precioIva;
    private String categoria;
    private int sku;
    private float unidades;

    public Producto() {
    }

    public Producto(String nombre, int precioNeto, int precioIva, String categoria, int sku, float unidades) {
        this.nombre = nombre;
        this.precioNeto = precioNeto;
        this.precioIva = precioIva;
        this.categoria = categoria;
        this.sku = sku;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(int precioNeto) {
        this.precioNeto = precioNeto;
    }

    public int getPrecioIva() {
        return precioIva;
    }

    public void setPrecioIva(int precioIva) {
        this.precioIva = precioIva;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public float getUnidades() {
        return unidades;
    }

    public void setUnidades(float unidades) {
        this.unidades = unidades;
    }
    
}
    