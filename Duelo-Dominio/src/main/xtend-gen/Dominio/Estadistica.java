package Dominio;

import Dominio.Jugador;
import Dominio.Linea;
import Dominio.Personaje;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Estadistica {
  private Jugador jugador;
  
  private Personaje personaje;
  
  private float calificacion;
  
  private List<Linea> posiciones;
  
  private float vecesQueInicio;
  
  private float victorias;
  
  private float kills;
  
  private float deads;
  
  private float asists;
  
  private Linea ubicacion;
  
  public Estadistica(final Personaje personaje, final Jugador jugador) {
    this.personaje = personaje;
    this.jugador = jugador;
    ArrayList<Linea> _arrayList = new ArrayList<Linea>();
    this.posiciones = _arrayList;
    this.ubicacion = null;
    this.vecesQueInicio = 0;
    this.victorias = 0;
    this.kills = 0;
    this.deads = 0;
    this.asists = 0;
    this.calificacion = 0;
  }
  
  public Integer gano(final Linea linea) {
    Integer _xblockexpression = null;
    {
      this.ubicacion = linea;
      this.posiciones.add(linea);
      this.victorias++;
      _xblockexpression = this.jugador.gano();
    }
    return _xblockexpression;
  }
  
  public float perdio(final Linea linea) {
    float _xblockexpression = (float) 0;
    {
      this.posiciones.add(linea);
      _xblockexpression = this.deads++;
    }
    return _xblockexpression;
  }
  
  public float empato(final Linea linea) {
    float _xblockexpression = (float) 0;
    {
      this.posiciones.add(linea);
      _xblockexpression = this.asists++;
    }
    return _xblockexpression;
  }
  
  public float inicio() {
    return this.vecesQueInicio++;
  }
  
  public double calcularPoderDeAtaque() {
    double _random = Math.random();
    return (((this.calificacion + ((this.kills + (this.asists / 2)) - this.deads)) * this.vecesQueInicio) * _random);
  }
  
  @Pure
  public Jugador getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final Jugador jugador) {
    this.jugador = jugador;
  }
  
  @Pure
  public Personaje getPersonaje() {
    return this.personaje;
  }
  
  public void setPersonaje(final Personaje personaje) {
    this.personaje = personaje;
  }
  
  @Pure
  public float getCalificacion() {
    return this.calificacion;
  }
  
  public void setCalificacion(final float calificacion) {
    this.calificacion = calificacion;
  }
  
  @Pure
  public List<Linea> getPosiciones() {
    return this.posiciones;
  }
  
  public void setPosiciones(final List<Linea> posiciones) {
    this.posiciones = posiciones;
  }
  
  @Pure
  public float getVecesQueInicio() {
    return this.vecesQueInicio;
  }
  
  public void setVecesQueInicio(final float vecesQueInicio) {
    this.vecesQueInicio = vecesQueInicio;
  }
  
  @Pure
  public float getVictorias() {
    return this.victorias;
  }
  
  public void setVictorias(final float victorias) {
    this.victorias = victorias;
  }
  
  @Pure
  public float getKills() {
    return this.kills;
  }
  
  public void setKills(final float kills) {
    this.kills = kills;
  }
  
  @Pure
  public float getDeads() {
    return this.deads;
  }
  
  public void setDeads(final float deads) {
    this.deads = deads;
  }
  
  @Pure
  public float getAsists() {
    return this.asists;
  }
  
  public void setAsists(final float asists) {
    this.asists = asists;
  }
  
  @Pure
  public Linea getUbicacion() {
    return this.ubicacion;
  }
  
  public void setUbicacion(final Linea ubicacion) {
    this.ubicacion = ubicacion;
  }
}
