package Personaje;

import TarjetaDeDuelo.Linea;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Personaje {
  @Accessors
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
}
