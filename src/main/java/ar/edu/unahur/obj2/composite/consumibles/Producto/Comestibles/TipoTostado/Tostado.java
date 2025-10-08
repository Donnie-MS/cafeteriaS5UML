package ar.edu.unahur.obj2.composite.consumibles.Producto.Comestibles.TipoTostado;

import ar.edu.unahur.obj2.composite.consumibles.Producto.Comestibles.Comestible;

public class Tostado extends Comestible{
    private TipoTostado tipo;

    public Tostado(String nombre, Double precioBase, Integer pesoGr, TipoTostado tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    public Double doCosto() {
        return switch(tipo) {
            case TipoTostado.JAMON_Y_QUESO -> 2.2;
            case TipoTostado.SALAME_Y_QUESO -> 5.2;
        };
    }
}
