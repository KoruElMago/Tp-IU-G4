package Exepcion;

@SuppressWarnings("all")
public class ContraseñaIncorrectaException extends Exception {
  public String toString() {
    return "La contraseña que ingresaste es incorrecta. Vuelve a intentar";
  }
}
