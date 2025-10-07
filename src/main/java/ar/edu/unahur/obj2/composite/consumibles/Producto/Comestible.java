package ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Comestible extends Producto{
    protected Integer pesoGr;

    public Comestible(String nombre, Double precioBase, Integer pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }
}
