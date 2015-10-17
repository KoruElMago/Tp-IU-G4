package Dominio;

import Dominio.Estadistica;
import Dominio.Linea;
import Dominio.ResultadoDuelo;

@SuppressWarnings("all")
public class Ganador extends ResultadoDuelo {
  public Ganador(final Estadistica estadistica, final Linea linea) {
    super(estadistica, linea);
  }
  
  public void actualizarDatos() {
    Estadistica _jugador = this.getJugador();
    Linea _linea = this.getLinea();
    _jugador.gano(_linea);
  }
}
