package Duelo;

import Jugador.Estadisticas;
import Jugador.Jugador;
import Personaje.Personaje;
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
  
  public void resolverse() {
    double suerteJ1 = Math.random();
    double suerteJ2 = Math.random();
    double poderJ1 = (this.tarjetaJugador1.obtenerPoderDeAtaque()).intValue();
    double poderJ2 = (this.tarjetaJugador2.obtenerPoderDeAtaque()).intValue();
    this.actualizarPuntaje(this.tarjetaJugador1, (poderJ1 * suerteJ1));
    this.actualizarPuntaje(this.tarjetaJugador2, (poderJ2 * suerteJ2));
    if (((poderJ1 * suerteJ1) > (poderJ2 * suerteJ2))) {
      this.tarjetaGanador = this.tarjetaJugador1;
      this.gano(this.tarjetaJugador1);
      this.perdio(this.tarjetaJugador2);
    }
    if (((poderJ2 * suerteJ2) > (poderJ1 * suerteJ1))) {
      this.tarjetaGanador = this.tarjetaJugador2;
      this.gano(this.tarjetaJugador2);
      this.perdio(this.tarjetaJugador1);
    } else {
      this.empate();
    }
  }
  
  public void actualizarPuntaje(final TarjetaDeDuelo t, final double d) {
    final Personaje p = t.getPersonaje();
    Jugador _jugador = t.getJugador();
    Estadisticas _obtenerEstadisticas = _jugador.obtenerEstadisticas(p);
    _obtenerEstadisticas.setCalificacionEnDuelo(d);
  }
  
  public void empate() {
    this.tarjetaJugador1.actualizarEmpate(this);
    this.tarjetaJugador2.actualizarEmpate(this);
  }
  
  public void perdio(final TarjetaDeDuelo duelo) {
    duelo.actualizarDerrota(this);
  }
  
  public void gano(final TarjetaDeDuelo duelo) {
    duelo.actualizarVictoria(this);
  }
  
  public TarjetaDeDuelo tarjetaDe(final Jugador jugador) {
    TarjetaDeDuelo _xifexpression = null;
    Jugador _jugador = this.tarjetaJugador1.getJugador();
    boolean _equals = Objects.equal(_jugador, jugador);
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
