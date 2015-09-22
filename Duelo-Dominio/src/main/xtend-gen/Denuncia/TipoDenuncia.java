package Denuncia;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public abstract class TipoDenuncia {
  private String tipo;
  
  private Integer peso;
  
  public TipoDenuncia() {
  }
  
  @Pure
  public String getTipo() {
    return this.tipo;
  }
  
  public void setTipo(final String tipo) {
    this.tipo = tipo;
  }
  
  @Pure
  public Integer getPeso() {
    return this.peso;
  }
  
  public void setPeso(final Integer peso) {
    this.peso = peso;
  }
}
