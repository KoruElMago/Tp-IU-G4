package Jugador;

import Jugador.Estadistica;
import Personaje.Personaje;
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
  
  private List<Estadistica> estadisticas;
  
  public Jugador(final String nombre) {
    this.nombreJugador = nombre;
    this.calificacion = 0;
    ArrayList<Estadistica> _arrayList = new ArrayList<Estadistica>();
    this.estadisticas = _arrayList;
  }
  
  public Estadistica obtenerEstadisticas(final Personaje personaje) {
    Estadistica res = null;
    for (final Estadistica e : this.estadisticas) {
      Personaje _personaje = e.getPersonaje();
      boolean _equals = Objects.equal(_personaje, personaje);
      if (_equals) {
        res = e;
      }
    }
    return res;
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
  public List<Estadistica> getEstadisticas() {
    return this.estadisticas;
  }
  
  public void setEstadisticas(final List<Estadistica> estadisticas) {
    this.estadisticas = estadisticas;
  }
}
