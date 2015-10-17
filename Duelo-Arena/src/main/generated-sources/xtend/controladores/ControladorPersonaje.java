package controladores;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors/* 
@TransactionalAndObservable */
@SuppressWarnings("all")
public class ControladorPersonaje {
  private /* List<Personaje> */Object personajes;
  
  private /* Personaje */Object unPersonaje;
  
  private String nombre;
  
  private /* Linea */Object rolIdeal;
  
  private List<String> debilidades;
  
  private List<String> fortalezas;
  
  public ControladorPersonaje(final /* List<Personaje> */Object personajes) {
    this.personajes = personajes;
  }
  
  public void setUnPersonaje(final /* Personaje */Object p) {
    this.unPersonaje = p;
    this.actualizar();
  }
  
  public List<String> actualizar() {
    throw new Error("Unresolved compilation problems:"
      + "\nnombre cannot be resolved"
      + "\nrolIdeal cannot be resolved"
      + "\nfortalezas cannot be resolved"
      + "\ndebilidades cannot be resolved");
  }
  
  @Pure
  public /* List<Personaje> */Object getPersonajes() {
    return this.personajes;
  }
  
  public void setPersonajes(final /* List<Personaje> */Object personajes) {
    this.personajes = personajes;
  }
  
  @Pure
  public Personaje getUnPersonaje() {
    return this.unPersonaje;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public Linea getRolIdeal() {
    return this.rolIdeal;
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
