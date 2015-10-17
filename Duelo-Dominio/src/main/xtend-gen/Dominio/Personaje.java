package Dominio;

import Dominio.Linea;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Personaje {
  private String nombre;
  
  private String debidades;
  
  private String especialidades;
  
  private Linea posicionIdeal;
  
  public Personaje(final String nombre, final String debilidades, final String especialidades, final Linea posicionIdeal) {
    this.nombre = nombre;
    this.debidades = debilidades;
    this.especialidades = especialidades;
    this.posicionIdeal = posicionIdeal;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public String getDebidades() {
    return this.debidades;
  }
  
  public void setDebidades(final String debidades) {
    this.debidades = debidades;
  }
  
  @Pure
  public String getEspecialidades() {
    return this.especialidades;
  }
  
  public void setEspecialidades(final String especialidades) {
    this.especialidades = especialidades;
  }
  
  @Pure
  public Linea getPosicionIdeal() {
    return this.posicionIdeal;
  }
  
  public void setPosicionIdeal(final Linea posicionIdeal) {
    this.posicionIdeal = posicionIdeal;
  }
}
