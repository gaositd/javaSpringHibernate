package com.cursojava.cursojavaspringboot.javaPuro.clase30.poo;


public class UsoCoche {

    public static void main(String[] args) {
        Clase30 carro1 = new Clase30();
        Clase30 carro2 = new Clase30("Nissan Sentra 2017",6,5000,3000,3000,2000);

        carro1.setMarcaModelo("Chevrolet S10 2023");
        carro1.setRuedas(4);
        carro1.setLargo(3000);
        carro1.setAncho(1000);
        carro1.setMotor(1600);
        carro1.setPeso(800);

        System.out.println("Datos del carro 1 =  Marca y Modelo = " + carro1.getMarcaModelo()+" Ruedas = "+carro1.getRuedas()+" largo = "+carro1.getLargo()+" Ancho = "+carro1.getAncho()+" Motor = "+carro1.getMotor()+" Peso = "+carro1.getPeso());
        System.out.println();
        System.out.println("Datos del carro 2 =  Marca y Modelo = " + carro2.getMarcaModelo()+" Ruedas = "+carro2.getRuedas()+" largo = "+carro2.getLargo()+" Ancho = "+carro2.getAncho()+" Motor = "+carro2.getMotor()+" Peso = "+carro2.getPeso());
    }
}
