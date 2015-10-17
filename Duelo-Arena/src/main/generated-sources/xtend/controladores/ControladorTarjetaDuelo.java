package controladores;

import controladores.ControladorBuscadorDuelo;
import java.util.List;
import java.util.Random;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors/* 
@TransactionalAndObservable */
@SuppressWarnings("all")
public class ControladorTarjetaDuelo {
  private /* Usuario */Object usuario;
  
  private /* DueloEntreLeyendas */Object del;
  
  private /* List<Linea> */Object lineas;
  
  private /* List<Personaje> */Object personajes;
  
  private /* Personaje */Object personajeElegido;
  
  private /* Linea */Object lineaElegida;
  
  public ControladorTarjetaDuelo(final /* DueloEntreLeyendas */Object del, final /* Usuario */Object us) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Linea is undefined for the type ControladorTarjetaDuelo"
      + "\nThe method or field Linea is undefined for the type ControladorTarjetaDuelo"
      + "\nThe method or field Linea is undefined for the type ControladorTarjetaDuelo"
      + "\nThe method or field Linea is undefined for the type ControladorTarjetaDuelo"
      + "\npersonajes cannot be resolved"
      + "\nBottom cannot be resolved"
      + "\nTop cannot be resolved"
      + "\nMid cannot be resolved"
      + "\nJungle cannot be resolved");
  }
  
  public ControladorBuscadorDuelo buscarDuelo() {
    throw new Error("Unresolved compilation problems:"
      + "\nTarjetaDeDuelo cannot be resolved."
      + "\njugador cannot be resolved"
      + "\nbuscarRivalDigno cannot be resolved"
      + "\nequals cannot be resolved");
  }
  
  public ControladorBuscadorDuelo crearDueloNormal(final /* DueloEntreLeyendas */Object del, final /* TarjetaDeDuelo */Object usuario, final /* TarjetaDeDuelo */Object retador) {
    String text = "Se ha encontrado Rival";
    return new ControladorBuscadorDuelo(del, usuario, retador, text);
  }
  
  public ControladorBuscadorDuelo crearDueloConBot(final /* DueloEntreLeyendas */Object del, final /* TarjetaDeDuelo */Object usuario) {
    throw new Error("Unresolved compilation problems:"
      + "\nTarjetaDeDuelo cannot be resolved."
      + "\npersonajes cannot be resolved"
      + "\nbot cannot be resolved"
      + "\njugador cannot be resolved"
      + "\nlinea cannot be resolved");
  }
  
  public Personaje personajeAlAzar(final /* List<Personaje> */Object personajes) {
    Random _random = new Random();
    int _length = ((Object[])Conversions.unwrapArray(personajes, Object.class)).length;
    int seleccion = _random.nextInt(_length);
    return personajes.get(seleccion);
  }
  
  @Pure
  public Usuario getUsuario() {
    return this.usuario;
  }
  
  public void setUsuario(final Usuario usuario) {
    this.usuario = usuario;
  }
  
  @Pure
  public DueloEntreLeyendas getDel() {
    return this.del;
  }
  
  public void setDel(final DueloEntreLeyendas del) {
    this.del = del;
  }
  
  @Pure
  public /* List<Linea> */Object getLineas() {
    return this.lineas;
  }
  
  public void setLineas(final /* List<Linea> */Object lineas) {
    this.lineas = lineas;
  }
  
  @Pure
  public /* List<Personaje> */Object getPersonajes() {
    return this.personajes;
  }
  
  public void setPersonajes(final /* List<Personaje> */Object personajes) {
    this.personajes = personajes;
  }
  
  @Pure
  public Personaje getPersonajeElegido() {
    return this.personajeElegido;
  }
  
  public void setPersonajeElegido(final Personaje personajeElegido) {
    this.personajeElegido = personajeElegido;
  }
  
  @Pure
  public Linea getLineaElegida() {
    return this.lineaElegida;
  }
  
  public void setLineaElegida(final Linea lineaElegida) {
    this.lineaElegida = lineaElegida;
  }
}
