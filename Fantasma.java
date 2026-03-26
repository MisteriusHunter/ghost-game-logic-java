package com.mycompany.practicapoo1;

public class Fantasma {

    private String nombre;
    private String color;
    private int velocidad;
    private int vidas;

    public Fantasma() {
        this.nombre = "NONE";
        this.color = "NONE";
        this.velocidad = 0;
        this.vidas = 3;        
    }

    public Fantasma(String color, int vidas) {
        this.color = color;
        this.vidas = vidas;
        this.nombre = "NONE"; //SE AGREGA MANUAL
        this.velocidad = 0;   //SE AGREGA MANUAL              
    }

    public Fantasma(String nombre, String color, int velocidad, int vidas) {
        this.nombre = nombre;
        this.color = color;
        this.velocidad = velocidad;
        this.vidas = vidas;        
    }

    public void Aparecer() {
        System.out.printf("%nFantasma %s aparece en pantalla...!!!", getColor());
    }

    public void Acelerar(int incremento) {
        if (incremento > 0) {
            setVelocidad(getVelocidad() + incremento);
            System.out.printf("%nFantasma %s está acelerando!!! Velocidad actual: %d", getColor(), getVelocidad());
        }
    }

    public void Morir() {
        if (getVidas() > 0) {
            setVidas(getVidas() - 1);
            if (getVidas() == 0) {
                System.out.printf("%nGAME OVER del Fantasma %s", getColor());
            } else {
                System.out.printf("%nFantasma %s pierde 1 vida. Vidas actuales: %d", getColor(), getVidas());
            }
        }
    }

    public void MostrarInformacion() {        
        System.out.printf("%n%nInformación Fantasma %s", getColor().toUpperCase());
        System.out.printf("%nNombre    : %s", getNombre());        
        System.out.printf("%nVelocidad : %d", getVelocidad());
        System.out.printf("%nVidas     : %d", getVidas());
        this.Aparecer();        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}

