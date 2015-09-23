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
  }
  
  public int resolverse() {
    int _xblockexpression = (int) 0;
    {
      Integer poderJ1 = this.tarjetaJugador1.obtenerPoderDeAtaque();
      Integer poderJ2 = this.tarjetaJugador2.obtenerPoderDeAtaque();
      boolean _greaterThan = (poderJ1.compareTo(poderJ2) > 0);
      if (_greaterThan) {
        this.tarjetaGanador = this.tarjetaJugador1;
        this.gano(this.tarjetaJugador1);
        this.perdio(this.tarjetaJugador2);
      }
      boolean _greaterThan_1 = (poderJ2.compareTo(poderJ1) > 0);
      if (_greaterThan_1) {
        this.tarjetaGanador = this.tarjetaJugador2;
        this.gano(this.tarjetaJugador2);
        this.perdio(this.tarjetaJugador1);
      }
      int _xifexpression = (int) 0;
      boolean _equals = Objects.equal(this.tarjetaGanador, null);
      if (_equals) {
        _xifexpression = this.empate();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
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
