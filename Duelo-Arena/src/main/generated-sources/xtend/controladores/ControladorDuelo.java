package controladores;

import Duelo.Duelo;
import Jugador.Jugador;
import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
import TarjetaDeDuelo.TarjetaDeDuelo;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class ControladorDuelo {
  private TarjetaDeDuelo t1;
  
  private TarjetaDeDuelo t2;
  
  private String personaje1;
  
  private String personaje2;
  
  private Linea linea1;
  
  private Linea linea2;
  
  private String nombre1;
  
  private String nombre2;
  
  public ControladorDuelo(final Duelo duelo) {
    TarjetaDeDuelo _tarjetaJugador1 = duelo.getTarjetaJugador1();
    this.t1 = _tarjetaJugador1;
    TarjetaDeDuelo _tarjetaJugador2 = duelo.getTarjetaJugador2();
    this.t2 = _tarjetaJugador2;
    Personaje _personaje = this.t1.getPersonaje();
    String _nombre = _personaje.getNombre();
    this.personaje1 = _nombre;
    Personaje _personaje_1 = this.t2.getPersonaje();
    String _nombre_1 = _personaje_1.getNombre();
    this.personaje2 = _nombre_1;
    Linea _linea = this.t1.getLinea();
    this.linea1 = _linea;
    Linea _linea_1 = this.t2.getLinea();
    this.linea2 = _linea_1;
    Jugador _jugador = this.t1.getJugador();
    String _nombreJugador = _jugador.getNombreJugador();
    this.nombre1 = _nombreJugador;
    Jugador _jugador_1 = this.t2.getJugador();
    String _nombreJugador_1 = _jugador_1.getNombreJugador();
    this.nombre2 = _nombreJugador_1;
  }
  
  @Pure
  public TarjetaDeDuelo getT1() {
    return this.t1;
  }
  
  public void setT1(final TarjetaDeDuelo t1) {
    this.t1 = t1;
  }
  
  @Pure
  public TarjetaDeDuelo getT2() {
    return this.t2;
  }
  
  public void setT2(final TarjetaDeDuelo t2) {
    this.t2 = t2;
  }
  
  @Pure
  public String getPersonaje1() {
    return this.personaje1;
  }
  
  public void setPersonaje1(final String personaje1) {
    this.personaje1 = personaje1;
  }
  
  @Pure
  public String getPersonaje2() {
    return this.personaje2;
  }
  
  public void setPersonaje2(final String personaje2) {
    this.personaje2 = personaje2;
  }
  
  @Pure
  public Linea getLinea1() {
    return this.linea1;
  }
  
  public void setLinea1(final Linea linea1) {
    this.linea1 = linea1;
  }
  
  @Pure
  public Linea getLinea2() {
    return this.linea2;
  }
  
  public void setLinea2(final Linea linea2) {
    this.linea2 = linea2;
  }
  
  @Pure
  public String getNombre1() {
    return this.nombre1;
  }
  
  public void setNombre1(final String nombre1) {
    this.nombre1 = nombre1;
  }
  
  @Pure
  public String getNombre2() {
    return this.nombre2;
  }
  
  public void setNombre2(final String nombre2) {
    this.nombre2 = nombre2;
  }
}
