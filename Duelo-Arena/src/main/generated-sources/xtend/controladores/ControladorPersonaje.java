package controladores;

import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class ControladorPersonaje {
  private List<Personaje> personajes;
  
  private Personaje unPersonaje;
  
  private String nombre;
  
  private Linea rolIdeal;
  
  private List<String> debilidades;
  
  private List<String> fortalezas;
  
  public ControladorPersonaje(final List<Personaje> personajes) {
    this.personajes = personajes;
  }
  
  public void setUnPersonaje(final Personaje p) {
    this.unPersonaje = p;
    this.actualizar();
  }
  
  public List<String> actualizar() {
    List<String> _xblockexpression = null;
    {
      String _nombre = this.unPersonaje.getNombre();
      this.nombre = _nombre;
      Linea _rolIdeal = this.unPersonaje.getRolIdeal();
      this.rolIdeal = _rolIdeal;
      List<String> _fortalezas = this.unPersonaje.getFortalezas();
      this.fortalezas = _fortalezas;
      List<String> _debilidades = this.unPersonaje.getDebilidades();
      _xblockexpression = this.debilidades = _debilidades;
    }
    return _xblockexpression;
  }
  
  @Pure
  public List<Personaje> getPersonajes() {
    return this.personajes;
  }
  
  public void setPersonajes(final List<Personaje> personajes) {
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
