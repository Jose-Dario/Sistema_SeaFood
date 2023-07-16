package com.example.sistema_seafood;

public class ProductoOrdenado {
    private Producto producto;
    private int cantidad;

    public ProductoOrdenado(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal(){
        return producto.getPrecio()*cantidad;
    }
}