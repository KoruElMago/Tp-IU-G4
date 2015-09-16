package Personaje;

import TarjetaDeDuelo.Linea;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Personaje {
  private String nombre;
  
  private Linea rolIdeal;
  
  private List<String> debilidades;
  
  private List<String> fortalezas;
  
  public Personaje(final String nombre, final Linea rolIdeal, final List<String> fortalezas, final List<String> debilidades) {
    this.nombre = nombre;
    this.rolIdeal = rolIdeal;
    this.debilidades = debilidades;
    this.fortalezas = fortalezas;
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
