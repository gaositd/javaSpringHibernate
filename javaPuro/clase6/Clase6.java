public class Clase6 {
    public static void main(String[] args) {
        byte edad = 0;
        final double doble = 1.0987654321;

        System.out.println("Variables edad = "+ edad);
        System.out.println("Constante doble = "+ doble);


        edad = 45;
        System.out.println("Variables edad = "+ edad);
        System.out.println("las contantes no se pueden modificar");
        /*doble = 12.34567890;
        System.out.println("Constante doble = "+ doble);
        //las contantes no se pueden modificar
        */
    }
}