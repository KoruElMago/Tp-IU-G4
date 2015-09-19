package Duelo;

import Jugador.Jugador;
import TarjetaDeDuelo.TarjetaDeDuelo;
import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Duelo {
  private TarjetaDeDuelo tarjetaJugador1;
  
  private TarjetaDeDuelo tarjetaJugador2;
  
  private TarjetaDeDuelo tarjetaGanador;
  
  public Duelo(final TarjetaDeDuelo j1, final TarjetaDeDuelo j2) {
    this.tarjetaJugador1 = j1;
    this.tarjetaJugador2 = j2;
    this.tarjetaGanador = null;
    this.resolverse();
  }
  
  public int resolverse() {
    throw new Error("Unresolved compilation problems:"
      + "\n> cannot be resolved."
      + "\n> cannot be resolved.");
  }
  
  public int empate() {
    int _xblockexpression = (int) 0;
    {
      this.tarjetaJugador1.actualizarEmpate(this);
      _xblockexpression = this.tarjetaJugador2.actualizarEmpate(this);
    }
    return _xblockexpression;
  }
  
  public Object perdio(final TarjetaDeDuelo duelo) {
    return duelo.actualizarDerrota(this);
  }
  
  public int gano(final TarjetaDeDuelo duelo) {
    return duelo.actualizarVictoria(this);
  }
  
  public TarjetaDeDuelo tarjetaDe(final Jugador jugador) {
    TarjetaDeDuelo _xifexpression = null;
    boolean _equals = Objects.equal(this.tarjetaJugador1, jugador);
    if (_equals) {
      return this.tarjetaJugador1;
    } else {
      _xifexpression = this.tarjetaJugador2;
    }
    return _xifexpression;
  }
  
  @Pure
  public TarjetaDeDuelo getTarjetaJugador1() {
    return this.tarjetaJugador1;
  }
  
  public void setTarjetaJugador1(final TarjetaDeDuelo tarjetaJugador1) {
    this.tarjetaJugador1 = tarjetaJugador1;
  }
  
  @Pure
  public TarjetaDeDuelo getTarjetaJugador2() {
    return this.tarjetaJugador2;
  }
  
  public void setTarjetaJugador2(final TarjetaDeDuelo tarjetaJugador2) {
    this.tarjetaJugador2 = tarjetaJugador2;
  }
  
  @Pure
  public TarjetaDeDuelo getTarjetaGanador() {
    return this.tarjetaGanador;
  }
  
  public void setTarjetaGanador(final TarjetaDeDuelo tarjetaGanador) {
    this.tarjetaGanador = tarjetaGanador;
  }
}
