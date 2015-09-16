package Denuncia;

import Denuncia.TipoDenuncia;
import Jugador.Jugador;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;

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
  
  public boolean esValida() {
    boolean valor = true;
    int contPalabras = 0;
    char[] chars = this.descripcion.toCharArray();
    for (int i = 0; (i < ((List<Character>)Conversions.doWrapArray(chars)).size()); i++) {
      char _get = chars[i];
      boolean _equals = Objects.equal(Character.valueOf(_get), " ");
      if (_equals) {
        i++;
      } else {
        contPalabras++;
      }
    }
    boolean _and = false;
    final char[] _converted_chars = (char[])chars;
    int _size = ((List<Character>)Conversions.doWrapArray(_converted_chars)).size();
    boolean _lessThan = (_size < 20);
    if (!_lessThan) {
      _and = false;
    } else {
      _and = (contPalabras > 3);
    }
    valor = _and;
    return valor;
  }
  
  public TipoDenuncia validarse() {
    throw new Error("Unresolved compilation problems:"
      + "\nmissing \'(\' at \'this\'"
      + "\nmissing \')\' at \'{\'"
      + "\nThe method nombre is undefined for the type Denuncia"
      + "\nThe method tipo is undefined for the type Denuncia"
      + "\nAbusoSistDenuncia cannot be resolved."
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects.");
  }
}
