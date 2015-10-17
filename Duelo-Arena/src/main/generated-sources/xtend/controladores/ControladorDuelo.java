package controladores;

import controladores.ControladorDenuncia;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors/* 
@TransactionalAndObservable */
@SuppressWarnings("all")
public class ControladorDuelo {
  private /* DueloEntreLeyendas */Object del;
  
  private /* Duelo */Object duelo;
  
  private /* TarjetaDeDuelo */Object t1;
  
  private /* TarjetaDeDuelo */Object t2;
  
  private String personaje1;
  
  private String personaje2;
  
  private /* Linea */Object linea1;
  
  private /* Linea */Object linea2;
  
  private String nombre1;
  
  private String nombre2;
  
  private Integer puntaje1;
  
  private Integer puntaje2;
  
  private String nombreGanador;
  
  public ControladorDuelo(final /* Duelo */Object duelo, final /* DueloEntreLeyendas */Object del) {
    throw new Error("Unresolved compilation problems:"
      + "\ntarjetaJugador1 cannot be resolved"
      + "\ntarjetaJugador2 cannot be resolved"
      + "\npersonaje cannot be resolved"
      + "\nnombre cannot be resolved"
      + "\npersonaje cannot be resolved"
      + "\nnombre cannot be resolved"
      + "\nlinea cannot be resolved"
      + "\nlinea cannot be resolved"
      + "\njugador cannot be resolved"
      + "\nnombreJugador cannot be resolved"
      + "\njugador cannot be resolved"
      + "\nnombreJugador cannot be resolved");
  }
  
  public String comenzarDuelo() {
    throw new Error("Unresolved compilation problems:"
      + "\nresolverse cannot be resolved"
      + "\njugador cannot be resolved"
      + "\ncalificacion cannot be resolved"
      + "\njugador cannot be resolved"
      + "\ncalificacion cannot be resolved"
      + "\ntarjetaGanador cannot be resolved"
      + "\njugador cannot be resolved"
      + "\nnombreJugador cannot be resolved");
  }
  
  public ControladorDenuncia comenzarDenuncia() {
    throw new Error("Unresolved compilation problems:"
      + "\njugador cannot be resolved"
      + "\njugador cannot be resolved");
  }
  
  @Pure
  public DueloEntreLeyendas getDel() {
    return this.del;
  }
  
  public void setDel(final DueloEntreLeyendas del) {
    this.del = del;
  }
  
  @Pure
  public Duelo getDuelo() {
    return this.duelo;
  }
  
  public void setDuelo(final Duelo duelo) {
    this.duelo = duelo;
  }
  
  @Pure
  public TarjetaDeDuelo getT1() {
    return this.t1;
  }
  
  public void setT1(final TarjetaDeDuelo t1) {
    this.t1 = t1;
  }
  
  @Pure
  public TarjetaDeDuelo getT2() {
    return this.t2;
  }
  
  public void setT2(final TarjetaDeDuelo t2) {
    this.t2 = t2;
  }
  
  @Pure
  public String getPersonaje1() {
    return this.personaje1;
  }
  
  public void setPersonaje1(final String personaje1) {
    this.personaje1 = personaje1;
  }
  
  @Pure
  public String getPersonaje2() {
    return this.personaje2;
  }
  
  public void setPersonaje2(final String personaje2) {
    this.personaje2 = personaje2;
  }
  
  @Pure
  public Linea getLinea1() {
    return this.linea1;
  }
  
  public void setLinea1(final Linea linea1) {
    this.linea1 = linea1;
  }
  
  @Pure
  public Linea getLinea2() {
    return this.linea2;
  }
  
  public void setLinea2(final Linea linea2) {
    this.linea2 = linea2;
  }
  
  @Pure
  public String getNombre1() {
    return this.nombre1;
  }
  
  public void setNombre1(final String nombre1) {
    this.nombre1 = nombre1;
  }
  
  @Pure
  public String getNombre2() {
    return this.nombre2;
  }
  
  public void setNombre2(final String nombre2) {
    this.nombre2 = nombre2;
  }
  
  @Pure
  public Integer getPuntaje1() {
    return this.puntaje1;
  }
  
  public void setPuntaje1(final Integer puntaje1) {
    this.puntaje1 = puntaje1;
  }
  
  @Pure
  public Integer getPuntaje2() {
    return this.puntaje2;
  }
  
  public void setPuntaje2(final Integer puntaje2) {
    this.puntaje2 = puntaje2;
  }
  
  @Pure
  public String getNombreGanador() {
    return this.nombreGanador;
  }
  
  public void setNombreGanador(final String nombreGanador) {
    this.nombreGanador = nombreGanador;
  }
}
