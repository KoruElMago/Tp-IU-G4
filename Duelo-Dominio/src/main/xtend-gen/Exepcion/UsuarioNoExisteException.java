package Exepcion;

@SuppressWarnings("all")
public class UsuarioNoExisteException extends Exception {
  public String toString() {
    return "Usuario no existe";
  }
}
