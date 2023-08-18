package com.cursojava.cursojavaspringboot.javaPuro.clase30.poo;

public class Clase30 {
//coche https://www.youtube.com/watch?v=ZY5pwm92cWQ&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=34
    private String marcaModelo;
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean asientosCuero;

    public Clase30(){
        marcaModelo ="Renult alfaRomeo 2023";
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
    }

    public Clase30(
            String MarcaModelo,
            int Ruedas,
            int Largo,
            int Ancho,
            int Motor,
            int PesoPlataforma,
            String Color,
            int PesoTotal,
            boolean AsientosCuero
    ){
        this.marcaModelo = MarcaModelo;
        this.ruedas = Ruedas;
        this.largo = Largo;
        this.ancho = Ancho;
        this.motor = Motor;
        this.pesoPlataforma = PesoPlataforma;
        this.color = Color;
        this.pesoTotal = PesoTotal;
        this.asientosCuero = AsientosCuero;
    }

    public String getMarcaModelo() {
        
        return this.marcaModelo;
    }

    public void setMarcaModelo(String MarcaModelo) {
        
        this.marcaModelo = MarcaModelo;
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

    public int getPesoPlataforma() {
        return this.pesoPlataforma;
    }

    public void setpesoPlataforma(int PesoPlataforma) {
        this.pesoPlataforma = PesoPlataforma;
    }

    public void setPesoPlataforma(int pesoPlataforma) {
        this.pesoPlataforma = pesoPlataforma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public boolean isAsientosCuero() {
        return asientosCuero;
    }

    public void setAsientosCuero(boolean asientosCuero) {
        this.asientosCuero = asientosCuero;
    }

    @Override
    public String toString() {
        return "Clase30{" +
                "ruedas=" + ruedas +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", motor=" + motor +
                ", pesoPlataforma=" + pesoPlataforma +
                '}';
    }
}