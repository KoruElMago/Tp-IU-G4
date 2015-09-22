package usuario;

import Jugador.Jugador;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Usuario {
  private String nombre;
  
  private String contraseña;
  
  private Jugador jugador;
  
  public Usuario(final String nombre, final String contraseña) {
    this.nombre = nombre;
    this.contraseña = contraseña;
    Jugador _jugador = new Jugador(nombre);
    this.jugador = _jugador;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public String getContraseña() {
    return this.contraseña;
  }
  
  public void setContraseña(final String contraseña) {
    this.contraseña = contraseña;
  }
  
  @Pure
  public Jugador getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final Jugador jugador) {
    this.jugador = jugador;
  }
}
