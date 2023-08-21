import javax.swing.JOptionPane;

public class Clase22 {
    public static void main(String[] args) {
        String genero = " ";
        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (M/H)");
        }while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
    }
}