package Dominio;

import Dominio.Estadistica;
import Dominio.Linea;
import Dominio.ResultadoDuelo;

@SuppressWarnings("all")
public class Empatante extends ResultadoDuelo {
  public Empatante(final Estadistica estadistica, final Linea linea) {
    super(estadistica, linea);
  }
  
  public void actualizarDatos() {
    Estadistica _jugador = this.getJugador();
    Linea _linea = this.getLinea();
    _jugador.empato(_linea);
  }
}
