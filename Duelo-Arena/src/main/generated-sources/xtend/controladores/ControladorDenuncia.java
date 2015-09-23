package controladores;

import Core.DueloEntreLeyendas;
import Denuncia.AbusoHabilDenuncia;
import Denuncia.ComAbusivaDenuncia;
import Denuncia.FeedIntencionalDenuncia;
import Denuncia.TipoDenuncia;
import Jugador.Jugador;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@TransactionalAndObservable
@Accessors
@SuppressWarnings("all")
public class ControladorDenuncia {
  private DueloEntreLeyendas del;
  
  private Jugador denunciante;
  
  private Jugador denunciado;
  
  private TipoDenuncia motivo;
  
  private List<TipoDenuncia> motivos = new ArrayList<TipoDenuncia>();
  
  private String detalles;
  
  public ControladorDenuncia(final DueloEntreLeyendas del, final Jugador denunciante, final Jugador denunciado) {
    this.del = del;
    this.denunciado = denunciado;
    this.denunciante = denunciante;
    AbusoHabilDenuncia _abusoHabilDenuncia = new AbusoHabilDenuncia();
    this.motivos.add(_abusoHabilDenuncia);
    ComAbusivaDenuncia _comAbusivaDenuncia = new ComAbusivaDenuncia();
    this.motivos.add(_comAbusivaDenuncia);
    FeedIntencionalDenuncia _feedIntencionalDenuncia = new FeedIntencionalDenuncia();
    this.motivos.add(_feedIntencionalDenuncia);
  }
  
  public Object realizarDenuncia() {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \')\'"
      + "\nno viable alternative at input \'}\'");
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
  public List<TipoDenuncia> getMotivos() {
    return this.motivos;
  }
  
  public void setMotivos(final List<TipoDenuncia> motivos) {
    this.motivos = motivos;
  }
  
  @Pure
  public String getDetalles() {
    return this.detalles;
  }
  
  public void setDetalles(final String detalles) {
    this.detalles = detalles;
  }
}
