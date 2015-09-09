package Duelo;

import TarjetaDeDuelo.TarjetaDeDuelo;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Duelo {
  @Accessors
  private TarjetaDeDuelo jugador1;
  
  private TarjetaDeDuelo jugador2;
  
  public Duelo(final TarjetaDeDuelo j1, final TarjetaDeDuelo j2) {
    this.jugador1 = j1;
    this.jugador2 = j2;
  }
  
  @Pure
  public TarjetaDeDuelo getJugador1() {
    return this.jugador1;
  }
  
  public void setJugador1(final TarjetaDeDuelo jugador1) {
    this.jugador1 = jugador1;
  }
}
