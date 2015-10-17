package Dominio;

import Dominio.Estadistica;
import Dominio.Linea;
import Dominio.ResultadoDuelo;

@SuppressWarnings("all")
public class Perdedor extends ResultadoDuelo {
  public Perdedor(final Estadistica estadistica, final Linea linea) {
    super(estadistica, linea);
  }
  
  public void actualizarDatos() {
    Estadistica _jugador = this.getJugador();
    Linea _linea = this.getLinea();
    _jugador.perdio(_linea);
  }
}
