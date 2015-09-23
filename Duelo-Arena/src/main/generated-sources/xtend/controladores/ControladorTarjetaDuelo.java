package controladores;

import Core.DueloEntreLeyendas;
import Jugador.Jugador;
import Personaje.Personaje;
import TarjetaDeDuelo.Linea;
import TarjetaDeDuelo.TarjetaDeDuelo;
import controladores.ControladorBuscadorDuelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import usuario.Usuario;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class ControladorTarjetaDuelo {
  private Usuario usuario;
  
  private DueloEntreLeyendas del;
  
  private List<Linea> lineas;
  
  private List<Personaje> personajes;
  
  private Personaje personajeElegido;
  
  private Linea lineaElegida;
  
  public ControladorTarjetaDuelo(final DueloEntreLeyendas del, final Usuario us) {
    this.del = del;
    this.usuario = us;
    List<Personaje> _personajes = del.getPersonajes();
    this.personajes = _personajes;
    ArrayList<Linea> _arrayList = new ArrayList<Linea>();
    this.lineas = _arrayList;
    this.lineas.add(Linea.Bottom);
    this.lineas.add(Linea.Top);
    this.lineas.add(Linea.Mid);
    this.lineas.add(Linea.Jungle);
  }
  
  public ControladorBuscadorDuelo buscarDuelo() {
    Jugador _jugador = this.usuario.getJugador();
    TarjetaDeDuelo tarjeta = new TarjetaDeDuelo(this.personajeElegido, _jugador, this.lineaElegida);
    TarjetaDeDuelo rival = this.del.buscarRivalDigno(tarjeta);
    boolean _equals = rival.equals(null);
    if (_equals) {
      return this.crearDueloConBot(this.del, tarjeta);
    } else {
      return this.crearDueloNormal(this.del, tarjeta, rival);
    }
  }
  
  public ControladorBuscadorDuelo crearDueloNormal(final DueloEntreLeyendas del, final TarjetaDeDuelo usuario, final TarjetaDeDuelo retador) {
    String text = "Se ha encontrado Rival";
    return new ControladorBuscadorDuelo(del, usuario, retador, text);
  }
  
  public ControladorBuscadorDuelo crearDueloConBot(final DueloEntreLeyendas del, final TarjetaDeDuelo usuario) {
    String text = "No se ha encontrado rival que te haga frente.\n\t\t\t\t\t¿Deseas jugar contra bot MR-X de todas maneras?";
    List<Personaje> _personajes = del.getPersonajes();
    Personaje _personajeAlAzar = this.personajeAlAzar(_personajes);
    Usuario _bot = del.getBot();
    Jugador _jugador = _bot.getJugador();
    Linea _linea = usuario.getLinea();
    TarjetaDeDuelo bot = new TarjetaDeDuelo(_personajeAlAzar, _jugador, _linea);
    return new ControladorBuscadorDuelo(del, usuario, bot, text);
  }
  
  public Personaje personajeAlAzar(final List<Personaje> personajes) {
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
  public List<Linea> getLineas() {
    return this.lineas;
  }
  
  public void setLineas(final List<Linea> lineas) {
    this.lineas = lineas;
  }
  
  @Pure
  public List<Personaje> getPersonajes() {
    return this.personajes;
  }
  
  public void setPersonajes(final List<Personaje> personajes) {
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
