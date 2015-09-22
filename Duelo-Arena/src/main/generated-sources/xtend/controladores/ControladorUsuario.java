package controladores;

import Jugador.Jugador;
import usuario.Usuario;

@SuppressWarnings("all")
public class ControladorUsuario {
  private Usuario usuario;
  
  public ControladorUsuario(final Usuario usuario) {
    this.usuario = usuario;
  }
  
  public String toString() {
    Jugador _jugador = this.usuario.getJugador();
    return _jugador.getNombreJugador();
  }
}
