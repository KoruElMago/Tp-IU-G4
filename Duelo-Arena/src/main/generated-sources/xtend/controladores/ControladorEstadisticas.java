package controladores;

import Jugador.Estadisticas;
import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class ControladorEstadisticas {
  private Estadisticas estadisticas;
  
  public ControladorEstadisticas(final Estadisticas estadisticas) {
    this.estadisticas = estadisticas;
  }
  
  /**
   * this.personaje = personaje
   * this.vecesQueInicio = 1
   * this.kills = 2
   * this.deads = 3
   * this.assist = 4
   * this.victorias = 5
   * this.mejorLinea = Linea.Top
   * this.ubicaciones = new ArrayList<Linea>()
   * this.ubicaciones.add(Linea.Top);
   * this.ubicaciones.add(Linea.Bottom);
   * this.calificacionEnDuelo = 5
   */
  public Personaje getPersonaje() {
    return this.estadisticas.getPersonaje();
  }
  
  public String getNombre() {
    Personaje _personaje = this.estadisticas.getPersonaje();
    return _personaje.getNombre();
  }
  
  public Integer getVecesQueInicio() {
    return Integer.valueOf(this.estadisticas.getVecesQueInicio());
  }
  
  public Integer getKills() {
    return Integer.valueOf(this.estadisticas.getKills());
  }
  
  public Integer getDeads() {
    return Integer.valueOf(this.estadisticas.getDeads());
  }
  
  public Integer getAssist() {
    return Integer.valueOf(this.estadisticas.getAssists());
  }
  
  public Integer getVictorias() {
    return Integer.valueOf(this.estadisticas.getVictorias());
  }
  
  public Linea getMejorLinea() {
    return this.estadisticas.getMejorLinea();
  }
  
  public List<Linea> getUbicaciones() {
    return this.estadisticas.getUbicaciones();
  }
  
  public Integer getCalificacionEnDuelo() {
    return Integer.valueOf(this.estadisticas.getCalificacionEnDuelo());
  }
  
  @Pure
  public Estadisticas getEstadisticas() {
    return this.estadisticas;
  }
  
  public void setEstadisticas(final Estadisticas estadisticas) {
    this.estadisticas = estadisticas;
  }
}
