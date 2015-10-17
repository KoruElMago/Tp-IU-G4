package controladores;

import controladores.ControladorEstadisticas;
import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

/* @TransactionalAndObservable */@Accessors
@SuppressWarnings("all")
public class ControladorJugador {
  private /* Jugador */Object jugador;
  
  private String nombrePersonaje;
  
  public ControladorJugador(final /* Jugador */Object jugador) {
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
  
  public Object getEstadisticaPersonaje() {
    throw new Error("Unresolved compilation problems:"
      + "\nEstadisticas cannot be resolved to a type."
      + "\nEstadisticas cannot be resolved to a type."
      + "\npersonaje cannot be resolved"
      + "\nnombre cannot be resolved"
      + "\n== cannot be resolved"
      + "\npersonaje cannot be resolved");
  }
  
  public ControladorEstadisticas seleccionar() {
    Object _estadisticaPersonaje = this.getEstadisticaPersonaje();
    return new ControladorEstadisticas(_estadisticaPersonaje);
  }
  
  @Pure
  public Jugador getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final Jugador jugador) {
    this.jugador = jugador;
  }
  
  @Pure
  public String getNombrePersonaje() {
    return this.nombrePersonaje;
  }
  
  public void setNombrePersonaje(final String nombrePersonaje) {
    this.nombrePersonaje = nombrePersonaje;
  }
}
