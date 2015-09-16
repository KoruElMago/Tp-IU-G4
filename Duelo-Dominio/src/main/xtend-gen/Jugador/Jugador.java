package Jugador;

import Jugador.Estadistica;
import Personaje.Personaje;
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
  
  public Object obtenerEstadisticas(final Personaje personaje) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method personaje is undefined for the type Jugador"
      + "\nThe method or field e is undefined for the type Jugador"
      + "\n== cannot be resolved");
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
