package ar.edu.unahur.obj2.composite.consumibles.Producto.Bebibles;

public class JugoDeNaranja extends Bebible{
    private Boolean conAzucar;
    public JugoDeNaranja(String nombre, Double pesoBase, Integer capacidadMl, Boolean conAzucar) {
        super(nombre, pesoBase, capacidadMl);
        this.conAzucar = conAzucar;
    }

    public Double doCosto() {
        return conAzucar ? 2.2 : 5.5;
    }
}
