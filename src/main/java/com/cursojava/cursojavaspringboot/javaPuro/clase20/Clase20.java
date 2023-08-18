import javax.swing.JOptionPane;
public class Clase20 {
    public static void main(String[] args) {
        String clave = "secreto";
        String pass = JOptionPane.showInputDialog("Dar la clave secreta o cigue en el ciclo");
        byte intentos = 0;
        while (clave.equals(pass) == false){
            System.out.println("Clave incorrecta intenta de nuevo");
            intentos++;
            if(intentos == 10){
                System.out.println("Ya me aburri adios");
                JOptionPane.showMessageDialog(null,"Ya me aburri adios");
                break;
            }else{
                pass = JOptionPane.showInputDialog("Dar la clave secreta o cigue en el ciclo");
            }
        }
    }
}