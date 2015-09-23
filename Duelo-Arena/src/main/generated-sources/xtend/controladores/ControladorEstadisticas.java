package controladores;

import Jugador.Estadisticas;
import Jugador.Jugador;
import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class ControladorEstadisticas {
  private Jugador jugador;
  
  private List<Estadisticas> estadisticas;
  
  private Estadisticas estadisticaSeleccionada;
  
  private String nombrePersonaje;
  
  private Integer vecesQueInicio;
  
  private Integer kills;
  
  private Integer deads;
  
  private Integer assist;
  
  private Integer victorias;
  
  private Linea mejorLinea;
  
  private List<Linea> ubicaciones = new ArrayList<Linea>();
  
  private double calificacionEnDuelo;
  
  public ControladorEstadisticas(final Jugador jugador) {
    this.jugador = jugador;
  }
  
  public String getNombreJugador() {
    return this.jugador.getNombreJugador();
  }
  
  public ArrayList<String> getNombreEstadisticas() {
    final ArrayList<String> nombres = new ArrayList<String>();
    List<Estadisticas> _estadisticas = this.jugador.getEstadisticas();
    for (final Estadisticas es : _estadisticas) {
      Personaje _personaje = es.getPersonaje();
      String _nombre = _personaje.getNombre();
      nombres.add(_nombre);
    }
    return nombres;
  }
  
  public List<Estadisticas> getEstadisticas() {
    return this.jugador.getEstadisticas();
  }
  
  public Estadisticas getEstadisticaPersonaje() {
    Estadisticas est = null;
    List<Estadisticas> _estadisticas = this.getEstadisticas();
    for (final Estadisticas s : _estadisticas) {
      Personaje _personaje = s.getPersonaje();
      String _nombre = _personaje.getNombre();
      boolean _equals = Objects.equal(_nombre, this.nombrePersonaje);
      if (_equals) {
        est = s;
      }
    }
    return est;
  }
  
  public double actualizar(final Estadisticas estadisticas) {
    double _xblockexpression = (double) 0;
    {
      int _vecesQueInicio = estadisticas.getVecesQueInicio();
      this.vecesQueInicio = Integer.valueOf(_vecesQueInicio);
      int _kills = estadisticas.getKills();
      this.kills = Integer.valueOf(_kills);
      int _deads = estadisticas.getDeads();
      this.deads = Integer.valueOf(_deads);
      int _assists = estadisticas.getAssists();
      this.assist = Integer.valueOf(_assists);
      int _victorias = estadisticas.getVictorias();
      this.victorias = Integer.valueOf(_victorias);
      Linea _mejorLinea = estadisticas.getMejorLinea();
      this.mejorLinea = _mejorLinea;
      List<Linea> _ubicaciones = estadisticas.getUbicaciones();
      this.ubicaciones = _ubicaciones;
      double _calificacionEnDuelo = estadisticas.getCalificacionEnDuelo();
      _xblockexpression = this.calificacionEnDuelo = _calificacionEnDuelo;
    }
    return _xblockexpression;
  }
  
  public Object seleccionar() {
    return null;
  }
  
  public void abrirEstadistica() {
    List<Estadisticas> _estadisticas = this.jugador.getEstadisticas();
    for (final Estadisticas est : _estadisticas) {
      Personaje _personaje = est.getPersonaje();
      String _nombre = _personaje.getNombre();
      boolean _equals = Objects.equal(_nombre, this.nombrePersonaje);
      if (_equals) {
        this.actualizar(est);
        this.setEstadisticaSeleccionada(est);
      }
    }
  }
  
  public void setNombrePersonaje(final String nombrePersonaje) {
    this.nombrePersonaje = nombrePersonaje;
    this.abrirEstadistica();
  }
  
  public void setEstadisticaSeleccionada(final Estadisticas s) {
    this.estadisticaSeleccionada = s;
    this.actualizar(s);
  }
  
  @Pure
  public Jugador getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final Jugador jugador) {
    this.jugador = jugador;
  }
  
  public void setEstadisticas(final List<Estadisticas> estadisticas) {
    this.estadisticas = estadisticas;
  }
  
  @Pure
  public Estadisticas getEstadisticaSeleccionada() {
    return this.estadisticaSeleccionada;
  }
  
  @Pure
  public String getNombrePersonaje() {
    return this.nombrePersonaje;
  }
  
  @Pure
  public Integer getVecesQueInicio() {
    return this.vecesQueInicio;
  }
  
  public void setVecesQueInicio(final Integer vecesQueInicio) {
    this.vecesQueInicio = vecesQueInicio;
  }
  
  @Pure
  public Integer getKills() {
    return this.kills;
  }
  
  public void setKills(final Integer kills) {
    this.kills = kills;
  }
  
  @Pure
  public Integer getDeads() {
    return this.deads;
  }
  
  public void setDeads(final Integer deads) {
    this.deads = deads;
  }
  
  @Pure
  public Integer getAssist() {
    return this.assist;
  }
  
  public void setAssist(final Integer assist) {
    this.assist = assist;
  }
  
  @Pure
  public Integer getVictorias() {
    return this.victorias;
  }
  
  public void setVictorias(final Integer victorias) {
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
