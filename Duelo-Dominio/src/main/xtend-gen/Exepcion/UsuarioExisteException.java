package Exepcion;

@SuppressWarnings("all")
public class UsuarioExisteException extends Exception {
  public String toString() {
    return "El usuario que quieres crear ya existe o es incorrecto";
  }
}
