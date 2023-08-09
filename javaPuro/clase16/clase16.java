import java.util.Scanner;
public class clase16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String escribir = null;
        double resultado = 0;
        final byte constante = 19;

        System.out.println("Escribe algo... un numero que lo multiplicare por 19");
        escribir = entrada.nextLine();
        System.out.println(escribir);
        resultado = Double.parseDouble(escribir) * constante;
        System.out.println(resultado);
    }
}