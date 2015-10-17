package controladores;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors/* 
@TransactionalAndObservable */
@SuppressWarnings("all")
public class ControladorEstadisticas {
  private /* //de control de jugador
  	Jugador */Object jugador;
  
  private /* List<Estadisticas> */Object estadisticas;
  
  private /* Estadisticas */Object estadisticaSeleccionada;
  
  private String nombrePersonaje;
  
  private Integer vecesQueInicio;
  
  private Integer kills;
  
  private Integer deads;
  
  private Integer assist;
  
  private Integer victorias;
  
  private /* Linea */Object mejorLinea;
  
  private /* List<Linea> */Object ubicaciones /* Skipped initializer because of errors */;
  
  private double calificacionEnDuelo;
  
  public ControladorEstadisticas(final /* Jugador */Object jugador) {
    this.jugador = jugador;
  }
  
  public Object getNombreJugador() {
    throw new Error("Unresolved compilation problems:"
      + "\nnombreJugador cannot be resolved");
  }
  
  public ArrayList<String> getNombreEstadisticas() {
    throw new Error("Unresolved compilation problems:"
      + "\nEstadisticas cannot be resolved to a type."
      + "\nestadisticas cannot be resolved"
      + "\npersonaje cannot be resolved"
      + "\nnombre cannot be resolved");
  }
  
  public Object getEstadisticas() {
    throw new Error("Unresolved compilation problems:"
      + "\nestadisticas cannot be resolved");
  }
  
  public Estadisticas getEstadisticaPersonaje() {
    throw new Error("Unresolved compilation problems:"
      + "\nEstadisticas cannot be resolved to a type."
      + "\nEstadisticas cannot be resolved to a type."
      + "\npersonaje cannot be resolved"
      + "\nnombre cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public double actualizar(final /* Estadisticas */Object estadisticas) {
    throw new Error("Unresolved compilation problems:"
      + "\nvecesQueInicio cannot be resolved"
      + "\nkills cannot be resolved"
      + "\ndeads cannot be resolved"
      + "\nassists cannot be resolved"
      + "\nvictorias cannot be resolved"
      + "\nmejorLinea cannot be resolved"
      + "\nubicaciones cannot be resolved"
      + "\ncalificacionEnDuelo cannot be resolved");
  }
  
  public Object seleccionar() {
    return null;
  }
  
  public void abrirEstadistica() {
    throw new Error("Unresolved compilation problems:"
      + "\nEstadisticas cannot be resolved to a type."
      + "\nestadisticas cannot be resolved"
      + "\npersonaje cannot be resolved"
      + "\nnombre cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public void setNombrePersonaje(final String nombrePersonaje) {
    this.nombrePersonaje = nombrePersonaje;
    this.abrirEstadistica();
  }
  
  public void setEstadisticaSeleccionada(final /* Estadisticas */Object s) {
    this.estadisticaSeleccionada = s;
    this.actualizar(s);
  }
  
  @Pure
  public //de control de jugador
  	Jugador getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final //de control de jugador
  	Jugador jugador) {
    this.jugador = jugador;
  }
  
  public void setEstadisticas(final /* List<Estadisticas> */Object estadisticas) {
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
  public /* List<Linea> */Object getUbicaciones() {
    return this.ubicaciones;
  }
  
  public void setUbicaciones(final /* List<Linea> */Object ubicaciones) {
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
