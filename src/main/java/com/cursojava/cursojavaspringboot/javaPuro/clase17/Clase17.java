import javax.swing.JOptionPane;
public class Clase17 {
    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Nombnre de usuario");
        double edad = Double.parseDouble(JOptionPane.showInputDialog("Edad del usuario"));
        double numero = 45.0;
        System.out.println("Fue dado >>> " + userName + " <<< >>> " +edad+" <<<");
        System.out.print("numero con formato >>> "+ numero + "<<<< ");
        System.out.printf("%1.2f", edad/6);
        System.out.println("raiz cuadrada de edad " + edad);
        System.out.printf("%1.15f",Math.sqrt(edad));
    }
}
