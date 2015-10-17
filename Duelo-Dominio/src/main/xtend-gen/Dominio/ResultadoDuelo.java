package Dominio;

import Dominio.Estadistica;
import Dominio.Linea;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public abstract class ResultadoDuelo {
  private Linea linea;
  
  private Estadistica jugador;
  
  public ResultadoDuelo(final Estadistica estadistica, final Linea linea) {
    this.linea = linea;
    this.jugador = estadistica;
    this.actualizarDatos();
  }
  
  public abstract void actualizarDatos();
  
  public float inicio() {
    return this.jugador.inicio();
  }
  
  @Pure
  public Linea getLinea() {
    return this.linea;
  }
  
  public void setLinea(final Linea linea) {
    this.linea = linea;
  }
  
  @Pure
  public Estadistica getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final Estadistica jugador) {
    this.jugador = jugador;
  }
}
