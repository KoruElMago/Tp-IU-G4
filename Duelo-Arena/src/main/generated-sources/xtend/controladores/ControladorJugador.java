package controladores;

import Jugador.Estadisticas;
import Jugador.Jugador;
import Personaje.Personaje;
import com.google.common.base.Objects;
import controladores.ControladorEstadisticas;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@TransactionalAndObservable
@Accessors
@SuppressWarnings("all")
public class ControladorJugador {
  private Jugador jugador;
  
  private String nombrePersonaje;
  
  public ControladorJugador(final Jugador jugador) {
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
  
  public Personaje getEstadisticaPersonaje() {
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
    return est.getPersonaje();
  }
  
  public ControladorEstadisticas seleccionar() {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Personaje to Jugador");
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
