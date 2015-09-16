package Duelo;

import TarjetaDeDuelo.TarjetaDeDuelo;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Duelo {
  private TarjetaDeDuelo jugador1;
  
  private TarjetaDeDuelo jugador2;
  
  public Duelo(final TarjetaDeDuelo j1, final TarjetaDeDuelo j2) {
    this.jugador1 = j1;
    this.jugador2 = j2;
    this.resolverse();
  }
  
  public void resolverse() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method obtenerPoderDeATaque is undefined for the type Duelo");
  }
  
  @Pure
  public TarjetaDeDuelo getJugador1() {
    return this.jugador1;
  }
  
  public void setJugador1(final TarjetaDeDuelo jugador1) {
    this.jugador1 = jugador1;
  }
  
  @Pure
  public TarjetaDeDuelo getJugador2() {
    return this.jugador2;
  }
  
  public void setJugador2(final TarjetaDeDuelo jugador2) {
    this.jugador2 = jugador2;
  }
}
