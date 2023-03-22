package rmr.java.mouredev22.models;

import rmr.java.mouredev22.interfaces.Poligono;

public class Cuadrado implements Poligono {
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public Double calcArea() {
        return lado * lado;
    }
}