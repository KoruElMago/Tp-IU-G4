package Dominio;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public abstract class Denuncia {
  private Integer peso;
  
  private String descripcion;
  
  private int palabrasMinimas;
  
  private int caracteresMinimos;
  
  public Denuncia(final String descripcion) {
    this.descripcion = descripcion;
    this.validar();
    this.palabrasMinimas = 3;
    this.caracteresMinimos = 20;
  }
  
  public Object validar() {
    Object _xblockexpression = null;
    {
      String ant = " ";
      int cont = 0;
      char[] l = this.descripcion.toCharArray();
      final char[] _converted_l = (char[])l;
      int _size = ((List<Character>)Conversions.doWrapArray(_converted_l)).size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        boolean _and = false;
        char _get = l[(i).intValue()];
        boolean _notEquals = (!Objects.equal(Character.valueOf(_get), " "));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _equals = Objects.equal(ant, " ");
          _and = _equals;
        }
        if (_and) {
          cont++;
        }
      }
      Object _xifexpression = null;
      boolean _and_1 = false;
      if (!(cont > this.caracteresMinimos)) {
        _and_1 = false;
      } else {
        int _length = this.descripcion.length();
        boolean _lessThan = (_length < this.palabrasMinimas);
        _and_1 = _lessThan;
      }
      if (_and_1) {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Pure
  public Integer getPeso() {
    return this.peso;
  }
  
  public void setPeso(final Integer peso) {
    this.peso = peso;
  }
  
  @Pure
  public String getDescripcion() {
    return this.descripcion;
  }
  
  public void setDescripcion(final String descripcion) {
    this.descripcion = descripcion;
  }
  
  @Pure
  public int getPalabrasMinimas() {
    return this.palabrasMinimas;
  }
  
  public void setPalabrasMinimas(final int palabrasMinimas) {
    this.palabrasMinimas = palabrasMinimas;
  }
  
  @Pure
  public int getCaracteresMinimos() {
    return this.caracteresMinimos;
  }
  
  public void setCaracteresMinimos(final int caracteresMinimos) {
    this.caracteresMinimos = caracteresMinimos;
  }
}
