package ar.edu.unahur.obj2.composite.consumibles.Producto.Comestibles;

import ar.edu.unahur.obj2.composite.consumibles.Producto.Producto;

public abstract class Comestible extends Producto{
    protected Integer pesoGr;

    public Comestible(String nombre, Double precioBase, Integer pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }
    
    public Double costo() {
        return pesoGr * precioBase;
    }
    
    public abstract Double doCosto();
}
