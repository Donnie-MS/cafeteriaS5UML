package ar.edu.unahur.obj2.composite.consumibles;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Consumible{
    private String nombre;
    private Double precioBase;
    private List<Consumible> consumibles;

    public Combo(String nombre, Double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        consumibles = new ArrayList<>();
    }

    public Combo(String nombre, Double precioBase, List<Consumible> consumibles) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.consumibles = new ArrayList<>(consumibles);
    }

    public void agregarConsumible(Consumible unConsumible) {
        consumibles.add(unConsumible);
    }

    public void eliminarConsumible(Consumible unConsumible) {
        consumibles.remove(unConsumible);
    }

    public Double costo() {
        return consumibles.stream().mapToDouble(consumible -> consumible.costo()).sum();
    }
}
