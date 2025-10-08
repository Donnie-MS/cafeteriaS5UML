package ar.edu.unahur.obj2.composite.consumibles.Producto.Bebibles;

public class Cafe extends Bebible{
    private Boolean conLeche;

    public Cafe(String nombre, Double precioBase, Integer capacidadMl, Boolean conLeche) {
        super(nombre, precioBase, capacidadMl);
        this.conLeche = conLeche;
    }

    @Override
    public Double doCosto() {
        return conLeche ? 8.0 : 4.0;
    }
}
