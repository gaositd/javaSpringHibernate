package com.cursojava.cursojavaspringboot.javaPuro.clase30.poo;


public class UsoCoche {

    public static void main(String[] args) {
        Clase30 carro1 = new Clase30();
        Clase30 carro2 = new Clase30("Nissan Sentra 2017",6,5000,3000,3000,2000,"Rojo",4245,true);

        carro1.setMarcaModelo("Chevrolet S10 2023");
        carro1.setRuedas(4);
        carro1.setLargo(3000);
        carro1.setAncho(1000);
        carro1.setMotor(1600);
        carro1.setpesoPlataforma(800);
        carro1.setColor("Azul");
        carro1.setPesoTotal(3456);
        carro1.setAsientosCuero(false);

        System.out.println("Datos del carro 1 =  Marca y Modelo = " + carro1.getMarcaModelo()+" Ruedas = "+carro1.getRuedas()+" largo = "+carro1.getLargo()+"cm Ancho = "+carro1.getAncho()+"cm Motor = "+carro1.getMotor()+"cm3 Peso = "+carro1.getPesoPlataforma() +"kg "+carro1.getColor() +" Peso total "+ carro1.getPesoTotal()+ "kg ¿Asientos de cuero?" + (carro1.isAsientosCuero() ? " Si" : "No"));
        System.out.println();
        System.out.println("Datos del carro 2 =  Marca y Modelo = " + carro2.getMarcaModelo()+" Ruedas = "+carro2.getRuedas()+" largo = "+carro2.getLargo()+"cm Ancho = "+carro2.getAncho()+"cm Motor = "+carro2.getMotor()+"cm3 Peso = "+carro2.getPesoPlataforma() +"kg "+carro2.getColor() +" Peso total "+ carro2.getPesoTotal()+ "Kg ¿Asientos de cuero?" + (carro2.isAsientosCuero() ? " Si" : "No"));
    }
}
