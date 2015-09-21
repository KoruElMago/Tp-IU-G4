package Denuncia;

import Denuncia.AbusoSistDenuncia;
import Denuncia.TipoDenuncia;
import Jugador.Jugador;
import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
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
    TipoDenuncia _xifexpression = null;
    boolean _esValida = this.esValida();
    if (_esValida) {
      TipoDenuncia _xblockexpression = null;
      {
        String _nombreJugador = this.denunciado.getNombreJugador();
        String _plus = ("El jugador intenta denunciar a:" + _nombreJugador);
        String _plus_1 = (_plus + "por:");
        String _name = this.tipo.getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + "sin tener una justificación suficiente:");
        String _plus_4 = (_plus_3 + this.descripcion);
        this.descripcion = _plus_4;
        this.denunciado = this.denunciante;
        AbusoSistDenuncia _abusoSistDenuncia = new AbusoSistDenuncia();
        _xblockexpression = this.tipo = _abusoSistDenuncia;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public boolean esValida() {
    char ant = ' ';
    int cantPal = 0;
    char[] _charArray = this.descripcion.toCharArray();
    for (final char c : _charArray) {
      {
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(Character.valueOf(c), " "));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _equals = Objects.equal(Character.valueOf(ant), " ");
          _and = _equals;
        }
        if (_and) {
          cantPal++;
        }
        ant = c;
      }
    }
    return (cantPal > 3);
  }
  
  @Pure
  public String getDescripcion() {
    return this.descripcion;
  }
  
  public void setDescripcion(final String descripcion) {
    this.descripcion = descripcion;
  }
  
  @Pure
  public TipoDenuncia getTipo() {
    return this.tipo;
  }
  
  public void setTipo(final TipoDenuncia tipo) {
    this.tipo = tipo;
  }
  
  @Pure
  public Jugador getDenunciante() {
    return this.denunciante;
  }
  
  public void setDenunciante(final Jugador denunciante) {
    this.denunciante = denunciante;
  }
  
  @Pure
  public Jugador getDenunciado() {
    return this.denunciado;
  }
  
  public void setDenunciado(final Jugador denunciado) {
    this.denunciado = denunciado;
  }
}
