package ar.edu.unahur.obj2.composite.consumibles.Producto.Bebibles;

import ar.edu.unahur.obj2.composite.consumibles.Producto.Producto;

public abstract class Bebible extends Producto{
    protected Integer capacidadMl;

    public Bebible(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase); 
        this.capacidadMl = capacidadMl;
    }

    @Override
    public Double costo(){
        return Double.min(super.costo(), capacidadMl * doCosto());
    }

    public abstract Double doCosto();
}
