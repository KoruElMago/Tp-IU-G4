package Jugador;

import Personaje.Personaje;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Estadistica {
  private Personaje personaje;
  
  private int vecesQueInicio;
  
  private int kills;
  
  private int deads;
  
  private int assists;
  
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
}
