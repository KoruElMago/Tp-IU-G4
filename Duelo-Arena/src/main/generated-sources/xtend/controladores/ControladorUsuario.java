package controladores;

import Core.DueloEntreLeyendas;
import Jugador.Jugador;
import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
import com.google.common.base.Objects;
import controladores.ControladorEstadisticas;
import controladores.ControladorPersonaje;
import controladores.ControladorTarjetaDuelo;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import usuario.Usuario;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class ControladorUsuario {
  private DueloEntreLeyendas del;
  
  private Usuario usuario;
  
  private List<Personaje> personajesDelJuego;
  
  private Personaje unPersonajeDelJuego;
  
  private String nombrePersonaje;
  
  private Linea rolIdeal;
  
  private List<String> debilidades;
  
  private List<String> fortalezas;
  
  public ControladorUsuario(final Usuario usuario, final DueloEntreLeyendas d) {
    this.del = d;
    this.usuario = usuario;
    List<Personaje> _personajes = d.getPersonajes();
    this.personajesDelJuego = _personajes;
  }
  
  public void setNombrePersonaje(final String s) {
    this.nombrePersonaje = s;
    this.actualizar(s);
  }
  
  public void actualizar(final String s) {
    for (final Personaje p : this.personajesDelJuego) {
      String _nombre = p.getNombre();
      boolean _equals = Objects.equal(_nombre, s);
      if (_equals) {
        this.unPersonajeDelJuego = p;
        Linea _rolIdeal = p.getRolIdeal();
        this.rolIdeal = _rolIdeal;
        List<String> _debilidades = p.getDebilidades();
        this.debilidades = _debilidades;
        List<String> _fortalezas = p.getFortalezas();
        this.fortalezas = _fortalezas;
      }
    }
  }
  
  public String toString() {
    Jugador _jugador = this.usuario.getJugador();
    return _jugador.getNombreJugador();
  }
  
  public ControladorEstadisticas abrirSeleccionEstadistica() {
    Jugador _jugador = this.usuario.getJugador();
    return new ControladorEstadisticas(_jugador);
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
  public List<Personaje> getPersonajesDelJuego() {
    return this.personajesDelJuego;
  }
  
  public void setPersonajesDelJuego(final List<Personaje> personajesDelJuego) {
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
