package ar.edu.unahur.obj2.composite.consumibles.Producto.Comestibles.Medialuna;

import ar.edu.unahur.obj2.composite.consumibles.Producto.Comestibles.Comestible;

public class Medialuna extends Comestible{
    private final TipoDeMediaLuna tipo;

    public Medialuna(String nombre, Double precioBase, Integer pesoGr, TipoDeMediaLuna tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto() {
        return switch(tipo) {
            case TipoDeMediaLuna.DE_MANTECA -> 2.5;
            case TipoDeMediaLuna.CON_DULCE_DE_LECHE -> 1.25;
            case TipoDeMediaLuna.DE_GRASA -> 3.0;
        };
    }
}
