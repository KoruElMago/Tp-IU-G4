package Jugador;

import Duelo.Duelo;
import Jugador.Jugador;
import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
import TarjetaDeDuelo.TarjetaDeDuelo;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Estadisticas {
  private Personaje personaje;
  
  private int vecesQueInicio;
  
  private int kills;
  
  private int deads;
  
  private int assists;
  
  private int victorias;
  
  private Linea mejorLinea;
  
  private List<Linea> ubicaciones;
  
  private double calificacionEnDuelo;
  
  public Estadisticas(final Personaje personaje) {
    this.personaje = personaje;
    this.kills = 0;
    this.deads = 0;
    this.assists = 0;
    this.vecesQueInicio = 0;
    this.victorias = 0;
    this.mejorLinea = Linea.Bottom;
  }
  
  public int empato(final Duelo duelo, final Jugador jug) {
    int _xblockexpression = (int) 0;
    {
      this.assists++;
      TarjetaDeDuelo _tarjetaDe = duelo.tarjetaDe(jug);
      Linea _linea = _tarjetaDe.getLinea();
      this.ubicaciones.add(_linea);
      TarjetaDeDuelo _tarjetaDe_1 = duelo.tarjetaDe(jug);
      Integer _obtenerPoderDeAtaque = _tarjetaDe_1.obtenerPoderDeAtaque();
      this.calificacionEnDuelo = (((Integer) _obtenerPoderDeAtaque)).intValue();
      int _xifexpression = (int) 0;
      TarjetaDeDuelo _tarjetaJugador1 = duelo.getTarjetaJugador1();
      Jugador _jugador = _tarjetaJugador1.getJugador();
      boolean _equals = Objects.equal(_jugador, jug);
      if (_equals) {
        _xifexpression = this.vecesQueInicio++;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object gano(final Duelo duelo, final Jugador jug) {
    Object _xblockexpression = null;
    {
      this.victorias++;
      TarjetaDeDuelo _tarjetaDe = duelo.tarjetaDe(jug);
      Linea _linea = _tarjetaDe.getLinea();
      this.ubicaciones.add(_linea);
      TarjetaDeDuelo _tarjetaDe_1 = duelo.tarjetaDe(jug);
      Integer _obtenerPoderDeAtaque = _tarjetaDe_1.obtenerPoderDeAtaque();
      this.calificacionEnDuelo = (((Integer) _obtenerPoderDeAtaque)).intValue();
      Object _xifexpression = null;
      TarjetaDeDuelo _tarjetaJugador1 = duelo.getTarjetaJugador1();
      Jugador _jugador = _tarjetaJugador1.getJugador();
      boolean _equals = Objects.equal(_jugador, jug);
      if (_equals) {
        Linea _xblockexpression_1 = null;
        {
          this.vecesQueInicio++;
          TarjetaDeDuelo _tarjetaDe_2 = duelo.tarjetaDe(jug);
          Linea _linea_1 = _tarjetaDe_2.getLinea();
          _xblockexpression_1 = this.mejorLinea = _linea_1;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = Integer.valueOf(this.kills++);
      }
      _xblockexpression = ((Object)_xifexpression);
    }
    return ((Comparable<?>)_xblockexpression);
  }
  
  public int perdio(final Duelo duelo, final Jugador jug) {
    int _xblockexpression = (int) 0;
    {
      TarjetaDeDuelo _tarjetaDe = duelo.tarjetaDe(jug);
      Linea _linea = _tarjetaDe.getLinea();
      this.ubicaciones.add(_linea);
      TarjetaDeDuelo _tarjetaDe_1 = duelo.tarjetaDe(jug);
      Integer _obtenerPoderDeAtaque = _tarjetaDe_1.obtenerPoderDeAtaque();
      this.calificacionEnDuelo = (((Integer) _obtenerPoderDeAtaque)).intValue();
      int _xifexpression = (int) 0;
      TarjetaDeDuelo _tarjetaJugador1 = duelo.getTarjetaJugador1();
      Jugador _jugador = _tarjetaJugador1.getJugador();
      boolean _equals = Objects.equal(_jugador, jug);
      if (_equals) {
        _xifexpression = this.vecesQueInicio++;
      } else {
        _xifexpression = this.deads++;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Pure
  public Personaje getPersonaje() {
    return this.personaje;
  }
  
  public void setPersonaje(final Personaje personaje) {
    this.personaje = personaje;
  }
  
  @Pure
  public int getVecesQueInicio() {
    return this.vecesQueInicio;
  }
  
  public void setVecesQueInicio(final int vecesQueInicio) {
    this.vecesQueInicio = vecesQueInicio;
  }
  
  @Pure
  public int getKills() {
    return this.kills;
  }
  
  public void setKills(final int kills) {
    this.kills = kills;
  }
  
  @Pure
  public int getDeads() {
    return this.deads;
  }
  
  public void setDeads(final int deads) {
    this.deads = deads;
  }
  
  @Pure
  public int getAssists() {
    return this.assists;
  }
  
  public void setAssists(final int assists) {
    this.assists = assists;
  }
  
  @Pure
  public int getVictorias() {
    return this.victorias;
  }
  
  public void setVictorias(final int victorias) {
    this.victorias = victorias;
  }
  
  @Pure
  public Linea getMejorLinea() {
    return this.mejorLinea;
  }
  
  public void setMejorLinea(final Linea mejorLinea) {
    this.mejorLinea = mejorLinea;
  }
  
  @Pure
  public List<Linea> getUbicaciones() {
    return this.ubicaciones;
  }
  
  public void setUbicaciones(final List<Linea> ubicaciones) {
    this.ubicaciones = ubicaciones;
  }
  
  @Pure
  public double getCalificacionEnDuelo() {
    return this.calificacionEnDuelo;
  }
  
  public void setCalificacionEnDuelo(final double calificacionEnDuelo) {
    this.calificacionEnDuelo = calificacionEnDuelo;
  }
}
