package Duelo;

import TarjetaDeDuelo.TarjetaDeDuelo;
import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Duelo {
  private TarjetaDeDuelo jugador1;
  
  private TarjetaDeDuelo jugador2;
  
  private TarjetaDeDuelo ganador;
  
  public Duelo(final TarjetaDeDuelo j1, final TarjetaDeDuelo j2) {
    this.jugador1 = j1;
    this.jugador2 = j2;
    this.ganador = null;
    this.resolverse();
  }
  
  public Object resolverse() {
    Object _xblockexpression = null;
    {
      int poderJ1 = this.jugador1.obtenerPoderDeAtaque();
      int poderJ2 = this.jugador2.obtenerPoderDeAtaque();
      if ((poderJ1 > poderJ2)) {
        this.ganador = this.jugador1;
        this.gano(this.jugador1);
        this.perdio(this.jugador2);
      }
      if ((poderJ2 > poderJ1)) {
        this.ganador = this.jugador2;
        this.gano(this.jugador2);
        this.perdio(this.jugador1);
      }
      Object _xifexpression = null;
      boolean _equals = Objects.equal(this.ganador, null);
      if (_equals) {
        _xifexpression = this.empate();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object empate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method actualizarEmpate is undefined for the type Duelo");
  }
  
  public void perdio(final TarjetaDeDuelo duelo) {
    duelo.actualizarDerrota();
  }
  
  public void gano(final TarjetaDeDuelo duelo) {
    duelo.actualizarVictoria();
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
  
  @Pure
  public TarjetaDeDuelo getGanador() {
    return this.ganador;
  }
  
  public void setGanador(final TarjetaDeDuelo ganador) {
    this.ganador = ganador;
  }
}
