package Core;

import Duelo.Duelo;
import Exepcion.DueloEnEspera;
import Exepcion.UsuarioExisteException;
import Jugador.Estadisticas;
import Jugador.Jugador;
import Personaje.Personaje;
import TarjetaDeDuelo.TarjetaDeDuelo;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import usuario.Usuario;

@Accessors
@SuppressWarnings("all")
public class DueloEntreLeyendas {
  private List<Personaje> personajes;
  
  private List<TarjetaDeDuelo> buscadores;
  
  private Usuario bot;
  
  private List<Usuario> usuarios;
  
  public DueloEntreLeyendas(final TarjetaDeDuelo tddBoot) {
    ArrayList<TarjetaDeDuelo> _arrayList = new ArrayList<TarjetaDeDuelo>();
    this.buscadores = _arrayList;
    ArrayList<Personaje> _arrayList_1 = new ArrayList<Personaje>();
    this.personajes = _arrayList_1;
    ArrayList<Usuario> _arrayList_2 = new ArrayList<Usuario>();
    this.usuarios = _arrayList_2;
    Usuario Jugadorbot = new Usuario("TX-M", "");
  }
  
  public DueloEntreLeyendas() {
    ArrayList<TarjetaDeDuelo> _arrayList = new ArrayList<TarjetaDeDuelo>();
    this.buscadores = _arrayList;
    ArrayList<Personaje> _arrayList_1 = new ArrayList<Personaje>();
    this.personajes = _arrayList_1;
    ArrayList<Usuario> _arrayList_2 = new ArrayList<Usuario>();
    this.usuarios = _arrayList_2;
  }
  
  public Duelo buscarDuelo(final TarjetaDeDuelo tdd) {
    try {
      TarjetaDeDuelo rival = this.buscarRivalDigno(tdd);
      boolean _equals = Objects.equal(rival, tdd);
      if (_equals) {
        throw new DueloEnEspera();
      } else {
        return new Duelo(tdd, rival);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public TarjetaDeDuelo buscarRivalDigno(final TarjetaDeDuelo duelo) {
    TarjetaDeDuelo rival = duelo;
    for (final TarjetaDeDuelo posibleRival : this.buscadores) {
      boolean _and = false;
      boolean _esRivalDigno = duelo.esRivalDigno(posibleRival);
      if (!_esRivalDigno) {
        _and = false;
      } else {
        boolean _notEquals = (!Objects.equal(duelo, posibleRival));
        _and = _notEquals;
      }
      if (_and) {
        return posibleRival;
      }
    }
    return this.tarjetaTDDBoot(duelo);
  }
  
  public TarjetaDeDuelo tarjetaTDDBoot(final TarjetaDeDuelo duelo) {
    return duelo;
  }
  
  public boolean entrarEnCola(final TarjetaDeDuelo tdd) {
    return this.buscadores.add(tdd);
  }
  
  public boolean salirDeLaCola(final TarjetaDeDuelo tdd) {
    return this.buscadores.remove(tdd);
  }
  
  public boolean agregarUsuario(final String nombre, final String contraseña) throws Exception {
    boolean _xblockexpression = false;
    {
      for (final Usuario us : this.usuarios) {
        boolean _or = false;
        boolean _or_1 = false;
        String _nombre = us.getNombre();
        boolean _equals = Objects.equal(_nombre, nombre);
        if (_equals) {
          _or_1 = true;
        } else {
          boolean _equals_1 = nombre.equals("");
          _or_1 = _equals_1;
        }
        if (_or_1) {
          _or = true;
        } else {
          boolean _equals_2 = contraseña.equals("");
          _or = _equals_2;
        }
        if (_or) {
          throw new UsuarioExisteException();
        }
      }
      Usuario user = new Usuario(nombre, contraseña);
      this.inicializarEtadisticas(user);
      _xblockexpression = this.usuarios.add(user);
    }
    return _xblockexpression;
  }
  
  public void inicializarEtadisticas(final Usuario usuario) {
    for (final Personaje p : this.personajes) {
      Jugador _jugador = usuario.getJugador();
      List<Estadisticas> _estadisticas = _jugador.getEstadisticas();
      Estadisticas _estadisticas_1 = new Estadisticas(p);
      _estadisticas.add(_estadisticas_1);
    }
  }
  
  @Pure
  public List<Personaje> getPersonajes() {
    return this.personajes;
  }
  
  public void setPersonajes(final List<Personaje> personajes) {
    this.personajes = personajes;
  }
  
  @Pure
  public List<TarjetaDeDuelo> getBuscadores() {
    return this.buscadores;
  }
  
  public void setBuscadores(final List<TarjetaDeDuelo> buscadores) {
    this.buscadores = buscadores;
  }
  
  @Pure
  public Usuario getBot() {
    return this.bot;
  }
  
  public void setBot(final Usuario bot) {
    this.bot = bot;
  }
  
  @Pure
  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }
  
  public void setUsuarios(final List<Usuario> usuarios) {
    this.usuarios = usuarios;
  }
}
