package Jugador;

import Denuncia.Denuncia;
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
  
  private List<Denuncia> denuncias;
  
  public Jugador(final String nombre) {
    this.nombreJugador = nombre;
    this.calificacion = 0;
    ArrayList<Estadisticas> _arrayList = new ArrayList<Estadisticas>();
    this.estadisticas = _arrayList;
    ArrayList<Denuncia> _arrayList_1 = new ArrayList<Denuncia>();
    this.denuncias = _arrayList_1;
  }
  
  public Estadisticas obtenerEstadisticas(final Personaje personaje) {
    for (final Estadisticas e : this.estadisticas) {
      Personaje _personaje = e.getPersonaje();
      boolean _equals = Objects.equal(_personaje, personaje);
      if (_equals) {
        return e;
      }
    }
    return null;
  }
  
  public void derrota(final Duelo duelo) {
    TarjetaDeDuelo _tarjetaDe = duelo.tarjetaDe(this);
    Personaje personaje = _tarjetaDe.getPersonaje();
    for (final Estadisticas e1 : this.estadisticas) {
      Personaje _personaje = e1.getPersonaje();
      boolean _equals = Objects.equal(_personaje, personaje);
      if (_equals) {
        int _deads = e1.getDeads();
        int _plus = (_deads + 1);
        e1.setDeads(_plus);
        int _vecesQueInicio = e1.getVecesQueInicio();
        int _plus_1 = (_vecesQueInicio + 1);
        e1.setVecesQueInicio(_plus_1);
      }
    }
  }
  
  public void victoria(final Duelo duelo) {
    TarjetaDeDuelo _tarjetaDe = duelo.tarjetaDe(this);
    Personaje personaje = _tarjetaDe.getPersonaje();
    for (final Estadisticas e1 : this.estadisticas) {
      Personaje _personaje = e1.getPersonaje();
      boolean _equals = Objects.equal(_personaje, personaje);
      if (_equals) {
        int _kills = e1.getKills();
        int _plus = (_kills + 1);
        e1.setKills(_plus);
        int _vecesQueInicio = e1.getVecesQueInicio();
        int _plus_1 = (_vecesQueInicio + 1);
        e1.setVecesQueInicio(_plus_1);
      }
    }
  }
  
  public void empate(final Duelo duelo) {
    TarjetaDeDuelo _tarjetaDe = duelo.tarjetaDe(this);
    Personaje personaje = _tarjetaDe.getPersonaje();
    for (final Estadisticas e1 : this.estadisticas) {
      Personaje _personaje = e1.getPersonaje();
      boolean _equals = Objects.equal(_personaje, personaje);
      if (_equals) {
        int _assists = e1.getAssists();
        int _plus = (_assists + 1);
        e1.setAssists(_plus);
        int _vecesQueInicio = e1.getVecesQueInicio();
        int _plus_1 = (_vecesQueInicio + 1);
        e1.setVecesQueInicio(_plus_1);
      }
    }
  }
  
  public boolean agregarDenuncia(final Denuncia denuncia) {
    return this.denuncias.add(denuncia);
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
  
  @Pure
  public List<Denuncia> getDenuncias() {
    return this.denuncias;
  }
  
  public void setDenuncias(final List<Denuncia> denuncias) {
    this.denuncias = denuncias;
  }
}
