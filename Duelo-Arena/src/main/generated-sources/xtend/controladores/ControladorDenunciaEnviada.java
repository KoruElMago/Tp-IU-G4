package controladores;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

/* @TransactionalAndObservable */@Accessors
@SuppressWarnings("all")
public class ControladorDenunciaEnviada {
  private /* DueloEntreLeyendas */Object del;
  
  private /* Denuncia */Object denuncia;
  
  private String detalles;
  
  private String tituloParaDenuncia;
  
  public ControladorDenunciaEnviada(final /* DueloEntreLeyendas */Object del, final /* Denuncia */Object denuncia) {
    throw new Error("Unresolved compilation problems:"
      + "\nesValida cannot be resolved"
      + "\ndenunciado cannot be resolved"
      + "\nnombreJugador cannot be resolved"
      + "\ndenunciado cannot be resolved"
      + "\nagregarDenuncia cannot be resolved"
      + "\ndenunciante cannot be resolved"
      + "\nagregarDenuncia cannot be resolved");
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
