package controladores;

import Core.DueloEntreLeyendas;
import Personaje.Personaje;
import TarjetaDeDuelo.TarjetaDeDuelo;
import com.google.common.base.Objects;
import controladores.ControladorUsuario;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
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
    return new ControladorUsuario(_usuario);
  }
  
  public String registrarUsuario() {
    String _xifexpression = null;
    boolean _esUsuario = this.esUsuario();
    if (_esUsuario) {
      String _xblockexpression = null;
      {
        this.mensajeLogIn = "Usuario Existente";
        this.nombreUsuario = "";
        _xblockexpression = this.contraseñaUsuario = "";
      }
      _xifexpression = _xblockexpression;
    } else {
      String _xifexpression_1 = null;
      boolean _equals = Objects.equal(this.contraseñaUsuario, "");
      if (_equals) {
        _xifexpression_1 = this.mensajeLogIn = "Escribe una contraseña";
      } else {
        String _xblockexpression_1 = null;
        {
          final Usuario us = new Usuario(this.nombreUsuario, this.contraseñaUsuario);
          List<Usuario> _usuarios = this.del.getUsuarios();
          _usuarios.add(us);
          _xblockexpression_1 = this.mensajeLogIn = "Usuario creado exitosamente";
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
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
