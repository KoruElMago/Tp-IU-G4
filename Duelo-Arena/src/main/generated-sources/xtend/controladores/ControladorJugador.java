package controladores;

import Jugador.Jugador;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@TransactionalAndObservable
@Accessors
@SuppressWarnings("all")
public class ControladorJugador {
  private Jugador jugador;
  
  public ControladorJugador(final Jugador jugador) {
    this.jugador = jugador;
  }
  
  public String getNombreJugador() {
    return this.jugador.getNombreJugador();
  }
  
  @Pure
  public Jugador getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final Jugador jugador) {
    this.jugador = jugador;
  }
}
