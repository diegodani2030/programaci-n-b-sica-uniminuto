package main;

public class Gato extends animal {
    private String color;
    private String raza;

    public Gato() {
    }

    public Gato(String color, String especie, String raza) {
        super(especie);
        this.color = color;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void maullar() {
        System.out.println("El gato hace miau");
    }

    public void jugar() {
        System.out.println("Juega con el ratón");
    }

    public String mostrarInformacion() {
        String info = "\nGato.raza = " + this.raza;
        info = info + "\nGato.color = " + this.color;
        return info;
    }
}
