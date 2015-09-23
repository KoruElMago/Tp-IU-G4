package controladores;

import Core.DueloEntreLeyendas;
import Denuncia.Denuncia;
import Jugador.Jugador;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@TransactionalAndObservable
@Accessors
@SuppressWarnings("all")
public class ControladorDenunciaEnviada {
  private DueloEntreLeyendas del;
  
  private Denuncia denuncia;
  
  private String detalles;
  
  private String tituloParaDenuncia;
  
  public ControladorDenunciaEnviada(final DueloEntreLeyendas del, final Denuncia denuncia) {
    this.del = del;
    this.denuncia = denuncia;
    boolean _esValida = denuncia.esValida();
    if (_esValida) {
      Jugador _denunciado = denuncia.getDenunciado();
      String _nombreJugador = _denunciado.getNombreJugador();
      String _plus = ("EL rival" + _nombreJugador);
      String _plus_1 = (_plus + " ha sido denunciado");
      this.detalles = _plus_1;
      this.tituloParaDenuncia = "Denuncia Aceptada";
      Jugador _denunciado_1 = denuncia.getDenunciado();
      _denunciado_1.agregarDenuncia(denuncia);
    } else {
      this.tituloParaDenuncia = "Me estas jodiendo?";
      this.detalles = "Tu denuncia no es valida ";
      Jugador _denunciante = denuncia.getDenunciante();
      _denunciante.agregarDenuncia(denuncia);
    }
  }
  
  @Pure
  public DueloEntreLeyendas getDel() {
    return this.del;
  }
  
  public void setDel(final DueloEntreLeyendas del) {
    this.del = del;
  }
  
  @Pure
  public Denuncia getDenuncia() {
    return this.denuncia;
  }
  
  public void setDenuncia(final Denuncia denuncia) {
    this.denuncia = denuncia;
  }
  
  @Pure
  public String getDetalles() {
    return this.detalles;
  }
  
  public void setDetalles(final String detalles) {
    this.detalles = detalles;
  }
  
  @Pure
  public String getTituloParaDenuncia() {
    return this.tituloParaDenuncia;
  }
  
  public void setTituloParaDenuncia(final String tituloParaDenuncia) {
    this.tituloParaDenuncia = tituloParaDenuncia;
  }
}
