package com.cursojava.cursojavaspringboot.javaPuro.clase30.poo;

public class Clase30 {
//coche https://www.youtube.com/watch?v=ZY5pwm92cWQ&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=31
    private String marcaModelo;
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;

    public Clase30(){
        marcaModelo ="Renult alfaRomeo 2023";
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }

    public Clase30(String MarcaModelo, int Ruedas, int Largo, int Ancho, int Motor, int Peso){
        this.marcaModelo = MarcaModelo;
        this.ruedas = Ruedas;
        this.largo = Largo;
        this.ancho = Ancho;
        this.motor = Motor;
        this.peso = Peso;
    }

    public String getMarcaModelo() {
        return MarcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        MarcaModelo = marcaModelo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Clase30{" +
                "ruedas=" + ruedas +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", motor=" + motor +
                ", peso=" + peso +
                '}';
    }
}