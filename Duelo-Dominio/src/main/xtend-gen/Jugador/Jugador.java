package Jugador;

import Duelo.Duelo;
import Jugador.Estadisticas;
import Personaje.Personaje;
import TarjetaDeDuelo.TarjetaDeDuelo;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Jugador {
  private String nombreJugador;
  
  private int calificacion;
  
  private List<Estadisticas> estadisticas;
  
  public Jugador(final String nombre) {
    this.nombreJugador = nombre;
    this.calificacion = 0;
    ArrayList<Estadisticas> _arrayList = new ArrayList<Estadisticas>();
    this.estadisticas = _arrayList;
  }
  
  public Estadisticas obtenerEstadisticas(final Personaje personaje) {
    Estadisticas res = null;
    for (final Estadisticas e : this.estadisticas) {
      Personaje _personaje = e.getPersonaje();
      boolean _equals = Objects.equal(_personaje, personaje);
      if (_equals) {
        res = e;
      }
    }
    return res;
  }
  
  public Object derrota(final Duelo duelo) {
    Object _xblockexpression = null;
    {
      Estadisticas eAux = null;
      TarjetaDeDuelo _tarjetaDe = duelo.tarjetaDe(this);
      Personaje personaje = _tarjetaDe.getPersonaje();
      for (final Estadisticas e1 : this.estadisticas) {
        Personaje _personaje = e1.getPersonaje();
        boolean _equals = Objects.equal(_personaje, personaje);
        if (_equals) {
          eAux = e1;
        }
      }
      boolean _equals_1 = Objects.equal(eAux, null);
      if (_equals_1) {
        Estadisticas _estadisticas = new Estadisticas(personaje);
        eAux = _estadisticas;
      }
      _xblockexpression = eAux.gano(duelo, this);
    }
    return _xblockexpression;
  }
  
  public int victoria(final Duelo duelo) {
    int _xblockexpression = (int) 0;
    {
      Estadisticas eAux = null;
      TarjetaDeDuelo _tarjetaDe = duelo.tarjetaDe(this);
      Personaje personaje = _tarjetaDe.getPersonaje();
      for (final Estadisticas e1 : this.estadisticas) {
        Personaje _personaje = e1.getPersonaje();
        boolean _equals = Objects.equal(_personaje, personaje);
        if (_equals) {
          eAux = e1;
        }
      }
      boolean _equals_1 = Objects.equal(eAux, null);
      if (_equals_1) {
        Estadisticas _estadisticas = new Estadisticas(personaje);
        eAux = _estadisticas;
      }
      _xblockexpression = eAux.perdio(duelo, this);
    }
    return _xblockexpression;
  }
  
  public int empate(final Duelo duelo) {
    int _xblockexpression = (int) 0;
    {
      Estadisticas eAux = null;
      TarjetaDeDuelo _tarjetaDe = duelo.tarjetaDe(this);
      Personaje personaje = _tarjetaDe.getPersonaje();
      for (final Estadisticas e1 : this.estadisticas) {
        Personaje _personaje = e1.getPersonaje();
        boolean _equals = Objects.equal(_personaje, personaje);
        if (_equals) {
          eAux = e1;
        }
      }
      boolean _equals_1 = Objects.equal(eAux, null);
      if (_equals_1) {
        Estadisticas _estadisticas = new Estadisticas(personaje);
        eAux = _estadisticas;
      }
      _xblockexpression = eAux.empato(duelo, this);
    }
    return _xblockexpression;
  }
  
  @Pure
  public String getNombreJugador() {
    return this.nombreJugador;
  }
  
  public void setNombreJugador(final String nombreJugador) {
    this.nombreJugador = nombreJugador;
  }
  
  @Pure
  public int getCalificacion() {
    return this.calificacion;
  }
  
  public void setCalificacion(final int calificacion) {
    this.calificacion = calificacion;
  }
  
  @Pure
  public List<Estadisticas> getEstadisticas() {
    return this.estadisticas;
  }
  
  public void setEstadisticas(final List<Estadisticas> estadisticas) {
    this.estadisticas = estadisticas;
  }
}
