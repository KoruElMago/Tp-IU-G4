package Denuncia;

import Denuncia.TipoDenuncia;
import Jugador.Jugador;

@SuppressWarnings("all")
public class Denuncia {
  private String descripcion;
  
  private TipoDenuncia tipo;
  
  private Jugador denunciante;
  
  private Jugador denunciado;
  
  public Denuncia(final String descripcion, final TipoDenuncia tipo, final Jugador denunciante, final Jugador denunciado) {
    this.descripcion = descripcion;
    this.tipo = tipo;
    this.denunciante = denunciante;
    this.denunciado = denunciado;
    this.validarse();
  }
  
  public TipoDenuncia validarse() {
    throw new Error("Unresolved compilation problems:"
      + "\nmissing \'(\' at \'this\'"
      + "\nmissing \')\' at \'{\'"
      + "\nThe method nombre is undefined for the type Denuncia"
      + "\nThe method tipo is undefined for the type Denuncia"
      + "\nAbusoSistDenuncia cannot be resolved."
      + "\nType mismatch: cannot convert from Object to boolean"
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects.");
  }
  
  public Object esValida() {
    return null;
  }
}
