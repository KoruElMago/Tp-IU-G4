package Dominio;

import Dominio.Empatante;
import Dominio.Estadistica;
import Dominio.Ganador;
import Dominio.Linea;
import Dominio.Perdedor;
import Dominio.ResultadoDuelo;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Duelo {
  private ResultadoDuelo jugador1;
  
  private ResultadoDuelo jugador2;
  
  public Duelo(final Estadistica jugador1, final Estadistica jugador2, final Linea lineaJ1, final Linea lineaJ2) {
    this.jugar(jugador1, jugador2, lineaJ1, lineaJ2);
    this.jugador1.inicio();
  }
  
  public ResultadoDuelo jugar(final Estadistica jugador1, final Estadistica jugador2, final Linea linea1, final Linea linea2) {
    ResultadoDuelo _xblockexpression = null;
    {
      double puntajeJ1 = jugador1.calcularPoderDeAtaque();
      double puntajeJ2 = jugador2.calcularPoderDeAtaque();
      ResultadoDuelo _xifexpression = null;
      if ((puntajeJ1 < puntajeJ2)) {
        ResultadoDuelo _xblockexpression_1 = null;
        {
          Ganador _ganador = new Ganador(jugador1, linea1);
          this.jugador1 = _ganador;
          Perdedor _perdedor = new Perdedor(jugador2, linea2);
          _xblockexpression_1 = this.jugador2 = _perdedor;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        ResultadoDuelo _xifexpression_1 = null;
        if ((puntajeJ1 > puntajeJ2)) {
          ResultadoDuelo _xblockexpression_2 = null;
          {
            Ganador _ganador = new Ganador(jugador2, linea2);
            this.jugador2 = _ganador;
            Perdedor _perdedor = new Perdedor(jugador1, linea1);
            _xblockexpression_2 = this.jugador1 = _perdedor;
          }
          _xifexpression_1 = _xblockexpression_2;
        } else {
          ResultadoDuelo _xblockexpression_3 = null;
          {
            Empatante _empatante = new Empatante(jugador1, linea1);
            this.jugador1 = _empatante;
            Empatante _empatante_1 = new Empatante(jugador2, linea2);
            _xblockexpression_3 = this.jugador2 = _empatante_1;
          }
          _xifexpression_1 = _xblockexpression_3;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Pure
  public ResultadoDuelo getJugador1() {
    return this.jugador1;
  }
  
  public void setJugador1(final ResultadoDuelo jugador1) {
    this.jugador1 = jugador1;
  }
  
  @Pure
  public ResultadoDuelo getJugador2() {
    return this.jugador2;
  }
  
  public void setJugador2(final ResultadoDuelo jugador2) {
    this.jugador2 = jugador2;
  }
}
