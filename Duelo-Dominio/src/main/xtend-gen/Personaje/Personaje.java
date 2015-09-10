package Personaje;

import TarjetaDeDuelo.Linea;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Personaje {
  @Accessors
  private String nombre;
  
  private Linea rolIdea;
  
  private List<String> debilidades;
  
  private List<String> fortalezas;
  
  public Personaje(final String nombre, final Linea rolIdeal, final List<String> fortalezas, final List<String> debilidades) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field rolIdeal is undefined for the type Personaje");
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
}
