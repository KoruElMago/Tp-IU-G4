package controladores;

import Denuncia.AbusoSistDenuncia;
import Denuncia.TipoDenuncia;
import controladores.ControladorJugador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@TransactionalAndObservable
@Accessors
@SuppressWarnings("all")
public class ControladorDenuncia {
  private ControladorJugador denunciante;
  
  private ControladorJugador denunciado;
  
  private String motivo;
  
  private List<String> motivos = new ArrayList<String>();
  
  private Map<String, TipoDenuncia> map = new HashMap<String, TipoDenuncia>();
  
  private String detalles;
  
  public ControladorDenuncia(final ControladorJugador denunciante, final ControladorJugador denunciado) {
    this.denunciado = denunciado;
    this.denunciante = denunciante;
    this.motivos.add("Feed Intencional");
    this.motivos.add("Abuso del Sistema de Denuncia");
    AbusoSistDenuncia _abusoSistDenuncia = new AbusoSistDenuncia();
    this.map.put("Abuso del Sistema de Denuncia", _abusoSistDenuncia);
  }
  
  public Object realizarDenuncia(final String motivo, final String detalles) {
    return null;
  }
  
  @Pure
  public ControladorJugador getDenunciante() {
    return this.denunciante;
  }
  
  public void setDenunciante(final ControladorJugador denunciante) {
    this.denunciante = denunciante;
  }
  
  @Pure
  public ControladorJugador getDenunciado() {
    return this.denunciado;
  }
  
  public void setDenunciado(final ControladorJugador denunciado) {
    this.denunciado = denunciado;
  }
  
  @Pure
  public String getMotivo() {
    return this.motivo;
  }
  
  public void setMotivo(final String motivo) {
    this.motivo = motivo;
  }
  
  @Pure
  public List<String> getMotivos() {
    return this.motivos;
  }
  
  public void setMotivos(final List<String> motivos) {
    this.motivos = motivos;
  }
  
  @Pure
  public Map<String, TipoDenuncia> getMap() {
    return this.map;
  }
  
  public void setMap(final Map<String, TipoDenuncia> map) {
    this.map = map;
  }
  
  @Pure
  public String getDetalles() {
    return this.detalles;
  }
  
  public void setDetalles(final String detalles) {
    this.detalles = detalles;
  }
}
