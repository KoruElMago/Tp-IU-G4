package controladores;

import Core.DueloEntreLeyendas;
import Exepcion.UsuarioExisteException;
import Personaje.Personaje;
import TarjetaDeDuelo.TarjetaDeDuelo;
import com.google.common.base.Objects;
import controladores.ControladorUsuario;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import usuario.Usuario;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class ControladorDueloEntreLeyendas {
  private String nombreUsuario;
  
  private String contraseñaUsuario;
  
  private String mensajeLogIn;
  
  private DueloEntreLeyendas del;
  
  public ControladorDueloEntreLeyendas(final DueloEntreLeyendas del) {
    this.del = del;
    this.nombreUsuario = "";
    this.contraseñaUsuario = "";
    this.mensajeLogIn = "";
  }
  
  public List<Personaje> getPersonajes() {
    return this.del.getPersonajes();
  }
  
  public List<TarjetaDeDuelo> getBuscadores() {
    return this.del.getBuscadores();
  }
  
  public List<Usuario> getUsuarios() {
    return this.del.getUsuarios();
  }
  
  public boolean esUsuario() {
    List<Usuario> _usuarios = this.getUsuarios();
    for (final Usuario us : _usuarios) {
      String _nombre = us.getNombre();
      boolean _equals = Objects.equal(_nombre, this.nombreUsuario);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public boolean esContraseña() {
    List<Usuario> _usuarios = this.getUsuarios();
    for (final Usuario us : _usuarios) {
      String _nombre = us.getNombre();
      boolean _equals = Objects.equal(_nombre, this.nombreUsuario);
      if (_equals) {
        String _contraseña = us.getContraseña();
        return Objects.equal(_contraseña, this.contraseñaUsuario);
      }
    }
    return false;
  }
  
  public Usuario getUsuario() {
    List<Usuario> _usuarios = this.getUsuarios();
    for (final Usuario us : _usuarios) {
      String _nombre = us.getNombre();
      boolean _equals = Objects.equal(_nombre, this.nombreUsuario);
      if (_equals) {
        return us;
      }
    }
    return null;
  }
  
  public ControladorUsuario loguear() {
    Usuario _usuario = this.getUsuario();
    return new ControladorUsuario(_usuario, this.del);
  }
  
  public String registrarUsuario() {
    try {
      String _xtrycatchfinallyexpression = null;
      try {
        String _xblockexpression = null;
        {
          this.del.agregarUsuario(this.nombreUsuario, this.contraseñaUsuario);
          _xblockexpression = this.mensajeLogIn = "Usuario creado exitosamente";
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } catch (final Throwable _t) {
        if (_t instanceof UsuarioExisteException) {
          final UsuarioExisteException e = (UsuarioExisteException)_t;
          String _string = e.toString();
          _xtrycatchfinallyexpression = this.mensajeLogIn = _string;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      return _xtrycatchfinallyexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean puedoLoguear() {
    boolean _equals = Objects.equal(this.nombreUsuario, "");
    if (_equals) {
      this.mensajeLogIn = "Usuario vacio";
      return false;
    } else {
      List<Usuario> _usuarios = this.del.getUsuarios();
      for (final Usuario us : _usuarios) {
        String _nombre = us.getNombre();
        boolean _equals_1 = Objects.equal(_nombre, this.nombreUsuario);
        if (_equals_1) {
          String _contraseña = us.getContraseña();
          boolean _equals_2 = Objects.equal(_contraseña, this.contraseñaUsuario);
          if (_equals_2) {
            return true;
          } else {
            this.mensajeLogIn = "Contraseña incorrecta";
            return false;
          }
        }
      }
      this.mensajeLogIn = "Usuario no existe";
      return false;
    }
  }
  
  @Pure
  public String getNombreUsuario() {
    return this.nombreUsuario;
  }
  
  public void setNombreUsuario(final String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }
  
  @Pure
  public String getContraseñaUsuario() {
    return this.contraseñaUsuario;
  }
  
  public void setContraseñaUsuario(final String contraseñaUsuario) {
    this.contraseñaUsuario = contraseñaUsuario;
  }
  
  @Pure
  public String getMensajeLogIn() {
    return this.mensajeLogIn;
  }
  
  public void setMensajeLogIn(final String mensajeLogIn) {
    this.mensajeLogIn = mensajeLogIn;
  }
  
  @Pure
  public DueloEntreLeyendas getDel() {
    return this.del;
  }
  
  public void setDel(final DueloEntreLeyendas del) {
    this.del = del;
  }
}
