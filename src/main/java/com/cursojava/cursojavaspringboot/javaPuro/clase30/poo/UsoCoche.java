package com.cursojava.cursojavaspringboot.javaPuro.clase30.poo;


import javax.swing.*;

public class UsoCoche {

    public static void main(String[] args) {
        Clase30 carro1 = new Clase30();
        Clase30 carro2 = new Clase30("Nissan Sentra 2017",6,5000,3000,3000,2000,"Rojo",4245,true, false,258000);
        Clase30 carro3 = new Clase30();
        String datos;

        carro1.setMarcaModelo("Chevrolet S10 2023");
        carro1.setRuedas(4);
        carro1.setLargo(3000);
        carro1.setAncho(1000);
        carro1.setMotor(1600);
        carro1.setpesoPlataforma(800);
        carro1.setColor("Azul");
        carro1.setPesoTotal(3456);
        carro1.setAsientosCuero(false);
        carro1.setClimatizado(true);
        carro1.setPrecioTotal(358000);

        datos = JOptionPane.showInputDialog("Marca y modelo del auto");
        carro3.setMarcaModelo(datos);

        datos = JOptionPane.showInputDialog("¿Cuanto pesa la plataforma?");
        carro3.setpesoPlataforma(Integer.parseInt(datos));

        datos = JOptionPane.showInputDialog("¿Cuantas ruedas tiene?");
        carro3.setRuedas(Integer.parseInt(datos));

        datos = JOptionPane.showInputDialog("Largo de la plataforma");
        carro3.setLargo(Integer.parseInt(datos));

        datos = JOptionPane.showInputDialog("Ancho de la plataforma");
        carro3.setAncho(Integer.parseInt(datos));

        datos = JOptionPane.showInputDialog("CM3 del motor");
        carro3.setMotor(Integer.parseInt(datos));

        datos = JOptionPane.showInputDialog("Color del auto");
        carro3.setColor(datos);

        datos = JOptionPane.showInputDialog("Peso total del auto");
        carro3.setPesoTotal(Integer.parseInt(datos));

        datos = JOptionPane.showInputDialog("¿Asientos de cuero ('SI/NO')?");
        carro3.setAsientosCuero((datos == "SI" || datos ==  "si" || datos ==  "Si" || datos ==  "sI" ? true : false));

        datos = JOptionPane.showInputDialog("¿Tiene aire acondicionado ('SI/NO')?");
        carro3.setClimatizado((datos == "SI" || datos ==  "si" || datos ==  "Si" || datos ==  "sI" ? true : false));

        datos = JOptionPane.showInputDialog("¿Cuanto cuesta el auto?");
        carro3.setPrecioTotal(Double.parseDouble(datos));

        System.out.println("Datos del carro 1 =  Marca y Modelo = " + carro1.getMarcaModelo()+" Ruedas = "+carro1.getRuedas()+" largo = "+carro1.getLargo()+"cm Ancho = "+carro1.getAncho()+"cm Motor = "+carro1.getMotor()+"cm3 Peso = "+carro1.getPesoPlataforma() +"kg "+carro1.getColor() +" Peso total "+ carro1.getPesoTotal()+ "kg ¿Asientos de cuero?" + (carro1.isAsientosCuero() ? " Si" : "No")+" "+ (carro1.isClimatizado() ? "Tiene Aire acondicionado" : "Es austero")+" EL precio del auto es de $"+carro1.getPrecioTotal());
        System.out.println();
        System.out.println("Datos del carro 2 =  Marca y Modelo = " + carro2.getMarcaModelo()+" Ruedas = "+carro2.getRuedas()+" largo = "+carro2.getLargo()+"cm Ancho = "+carro2.getAncho()+"cm Motor = "+carro2.getMotor()+"cm3 Peso = "+carro2.getPesoPlataforma() +"kg "+carro2.getColor() +" Peso total "+ carro2.getPesoTotal()+ "Kg ¿Asientos de cuero?" + (carro2.isAsientosCuero() ? " Si" : "No")+" "+ (carro2.isClimatizado() ? "Tiene Aire acondicionado" : "Es austero")+" EL precio del auto es de $"+carro2.getPrecioTotal());
        System.out.println();
        System.out.println("Datos del carro 3 =  Marca y Modelo = " + carro3.getMarcaModelo()+" Ruedas = "+carro3.getRuedas()+" largo = "+carro3.getLargo()+"cm Ancho = "+carro3.getAncho()+"cm Motor = "+carro3.getMotor()+"cm3 Peso = "+carro3.getPesoPlataforma() +"kg "+carro3.getColor() +" Peso total "+ carro3.getPesoTotal()+ "Kg ¿Asientos de cuero?" + (carro3.isAsientosCuero() ? " Si" : "No")+" "+ (carro3.isClimatizado() ? "Tiene Aire acondicionado" : "Es austero")+" EL precio del auto es de $"+carro3.getPrecioTotal());
    }
}
