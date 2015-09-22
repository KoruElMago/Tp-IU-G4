package controladores;

import Jugador.Jugador;
import controladores.ControladorEstadisticas;
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
  
  public ControladorEstadisticas abrirSeleccionEstadistica() {
    Jugador _jugador = this.usuario.getJugador();
    return new ControladorEstadisticas(_jugador);
  }
}
