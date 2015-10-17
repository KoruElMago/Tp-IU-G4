package Dominio;

import Dominio.Denuncia;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Jugador {
  private List<Denuncia> denuncias;
  
  private Integer duelosGanados;
  
  public Jugador() {
    ArrayList<Denuncia> _arrayList = new ArrayList<Denuncia>();
    this.denuncias = _arrayList;
    this.duelosGanados = Integer.valueOf(0);
  }
  
  public Object calcularRaiting() {
    return null;
  }
  
  @Pure
  public List<Denuncia> getDenuncias() {
    return this.denuncias;
  }
  
  public void setDenuncias(final List<Denuncia> denuncias) {
    this.denuncias = denuncias;
  }
  
  @Pure
  public Integer getDuelosGanados() {
    return this.duelosGanados;
  }
  
  public void setDuelosGanados(final Integer duelosGanados) {
    this.duelosGanados = duelosGanados;
  }
}
