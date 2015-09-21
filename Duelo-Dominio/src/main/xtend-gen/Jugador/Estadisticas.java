package Jugador;

import Duelo.Duelo;
import Jugador.Jugador;
import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
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
  
  private int calificacionEnDuelo;
  
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
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to int");
  }
  
  public Object gano(final Duelo duelo, final Jugador jug) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to int");
  }
  
  public int perdio(final Duelo duelo, final Jugador jug) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to int");
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
  public int getCalificacionEnDuelo() {
    return this.calificacionEnDuelo;
  }
  
  public void setCalificacionEnDuelo(final int calificacionEnDuelo) {
    this.calificacionEnDuelo = calificacionEnDuelo;
  }
}
