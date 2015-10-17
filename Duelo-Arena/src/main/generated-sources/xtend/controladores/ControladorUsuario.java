package controladores;

import controladores.ControladorEstadisticas;
import controladores.ControladorPersonaje;
import controladores.ControladorTarjetaDuelo;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors/* 
@TransactionalAndObservable */
@SuppressWarnings("all")
public class ControladorUsuario {
  private /* DueloEntreLeyendas */Object del;
  
  private /* Usuario */Object usuario;
  
  private /* List<Personaje> */Object personajesDelJuego;
  
  private /* Personaje */Object unPersonajeDelJuego;
  
  private String nombrePersonaje;
  
  private /* Linea */Object rolIdeal;
  
  private List<String> debilidades;
  
  private List<String> fortalezas;
  
  public ControladorUsuario(final /* Usuario */Object usuario, final /* DueloEntreLeyendas */Object d) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetPersonajes cannot be resolved");
  }
  
  public void setNombrePersonaje(final String s) {
    this.nombrePersonaje = s;
    this.actualizar(s);
  }
  
  public void actualizar(final String s) {
    throw new Error("Unresolved compilation problems:"
      + "\nPersonaje cannot be resolved to a type."
      + "\ngetNombre cannot be resolved"
      + "\n== cannot be resolved"
      + "\nrolIdeal cannot be resolved"
      + "\ngetDebilidades cannot be resolved"
      + "\ngetFortalezas cannot be resolved");
  }
  
  public String toString() {
    throw new Error("Unresolved compilation problems:"
      + "\njugador cannot be resolved"
      + "\nnombreJugador cannot be resolved");
  }
  
  public ControladorEstadisticas abrirSeleccionEstadistica() {
    throw new Error("Unresolved compilation problems:"
      + "\njugador cannot be resolved");
  }
  
  public Object getRolIdeal() {
    return null;
  }
  
  public ControladorPersonaje abrirPersonajes() {
    return new ControladorPersonaje(this.personajesDelJuego);
  }
  
  public ControladorTarjetaDuelo buscarDuelo() {
    return new ControladorTarjetaDuelo(this.del, this.usuario);
  }
  
  @Pure
  public DueloEntreLeyendas getDel() {
    return this.del;
  }
  
  public void setDel(final DueloEntreLeyendas del) {
    this.del = del;
  }
  
  @Pure
  public Usuario getUsuario() {
    return this.usuario;
  }
  
  public void setUsuario(final Usuario usuario) {
    this.usuario = usuario;
  }
  
  @Pure
  public /* List<Personaje> */Object getPersonajesDelJuego() {
    return this.personajesDelJuego;
  }
  
  public void setPersonajesDelJuego(final /* List<Personaje> */Object personajesDelJuego) {
    this.personajesDelJuego = personajesDelJuego;
  }
  
  @Pure
  public Personaje getUnPersonajeDelJuego() {
    return this.unPersonajeDelJuego;
  }
  
  public void setUnPersonajeDelJuego(final Personaje unPersonajeDelJuego) {
    this.unPersonajeDelJuego = unPersonajeDelJuego;
  }
  
  @Pure
  public String getNombrePersonaje() {
    return this.nombrePersonaje;
  }
  
  public void setRolIdeal(final Linea rolIdeal) {
    this.rolIdeal = rolIdeal;
  }
  
  @Pure
  public List<String> getDebilidades() {
    return this.debilidades;
  }
  
  public void setDebilidades(final List<String> debilidades) {
    this.debilidades = debilidades;
  }
  
  @Pure
  public List<String> getFortalezas() {
    return this.fortalezas;
  }
  
  public void setFortalezas(final List<String> fortalezas) {
    this.fortalezas = fortalezas;
  }
}
