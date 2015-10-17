package controladores;

import controladores.ControladorDenunciaEnviada;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

/* @TransactionalAndObservable */@Accessors
@SuppressWarnings("all")
public class ControladorDenuncia {
  private /* DueloEntreLeyendas */Object del;
  
  private /* Jugador */Object denunciante;
  
  private /* Jugador */Object denunciado;
  
  private /* TipoDenuncia */Object motivo;
  
  private /* List<TipoDenuncia> */Object motivos = new ArrayList<TipoDenuncia>();
  
  private String detalles;
  
  private String nombreDenunciado;
  
  public ControladorDenuncia(final /* DueloEntreLeyendas */Object del, final /* Jugador */Object denunciante, final /* Jugador */Object denunciado) {
    throw new Error("Unresolved compilation problems:"
      + "\nAbusoHabilDenuncia cannot be resolved."
      + "\nComAbusivaDenuncia cannot be resolved."
      + "\nFeedIntencionalDenuncia cannot be resolved."
      + "\nnombreJugador cannot be resolved");
  }
  
  public ControladorDenunciaEnviada crearDenuncia() {
    throw new Error("Unresolved compilation problems:"
      + "\nDenuncia cannot be resolved.");
  }
  
  @Pure
  public DueloEntreLeyendas getDel() {
    return this.del;
  }
  
  public void setDel(final DueloEntreLeyendas del) {
    this.del = del;
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
  
  @Pure
  public TipoDenuncia getMotivo() {
    return this.motivo;
  }
  
  public void setMotivo(final TipoDenuncia motivo) {
    this.motivo = motivo;
  }
  
  @Pure
  public /* List<TipoDenuncia> */Object getMotivos() {
    return this.motivos;
  }
  
  public void setMotivos(final /* List<TipoDenuncia> */Object motivos) {
    this.motivos = motivos;
  }
  
  @Pure
  public String getDetalles() {
    return this.detalles;
  }
  
  public void setDetalles(final String detalles) {
    this.detalles = detalles;
  }
  
  @Pure
  public String getNombreDenunciado() {
    return this.nombreDenunciado;
  }
  
  public void setNombreDenunciado(final String nombreDenunciado) {
    this.nombreDenunciado = nombreDenunciado;
  }
}
