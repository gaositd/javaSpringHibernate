import javax.swing.JOptionPane;

public class Empleado{

  private String nombre;
  private String apellidos;
  private double sueldoBase;
  private double sueldoNeto;
  private double aumentarSueldo;

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getApellidos() {
    return apellidos;
  }
  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }
  public double getSueldoBase() {
    return sueldoBase;
  }
  public void setSueldoBase(double sueldoBase) {
    double aumentaPorcentage = 0;
    aumentaPorcentage = Double.parseDouble(JOptionPane
    .showInputDialog("Introduce radio:"));
    
  }
  
  public double getAumentarSueldo() {
    return aumentarSueldo;
  }
  public void setAumentarSueldo(double aumentarSueldo) {
    this.aumentarSueldo = aumentarSueldo;
  }
  @Override
  public String toString() {
    return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase=" + sueldoBase + "]";
  }

  
}