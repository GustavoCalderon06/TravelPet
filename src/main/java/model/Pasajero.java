package model;

public class Pasajero {
    private String nombre;
    private boolean descuento;

    public Pasajero(String nombre, boolean descuento){
        this.nombre = nombre;
        this.descuento = descuento;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean tieneDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
}
