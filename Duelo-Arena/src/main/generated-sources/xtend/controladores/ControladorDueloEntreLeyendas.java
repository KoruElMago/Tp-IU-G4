package controladores;

import controladores.ControladorUsuario;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors/* 
@TransactionalAndObservable */
@SuppressWarnings("all")
public class ControladorDueloEntreLeyendas {
  private String nombreUsuario;
  
  private String contraseñaUsuario;
  
  private String mensajeLogIn;
  
  private /* DueloEntreLeyendas */Object del;
  
  public ControladorDueloEntreLeyendas(final /* DueloEntreLeyendas */Object del) {
    this.del = del;
    this.nombreUsuario = "";
    this.contraseñaUsuario = "";
    this.mensajeLogIn = "";
  }
  
  public Object getPersonajes() {
    throw new Error("Unresolved compilation problems:"
      + "\npersonajes cannot be resolved");
  }
  
  public Object getBuscadores() {
    throw new Error("Unresolved compilation problems:"
      + "\nbuscadores cannot be resolved");
  }
  
  public Object getUsuarios() {
    throw new Error("Unresolved compilation problems:"
      + "\nusuarios cannot be resolved");
  }
  
  public boolean esUsuario() {
    throw new Error("Unresolved compilation problems:"
      + "\nUsuario cannot be resolved to a type."
      + "\nnombre cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public Object esContraseña() {
    throw new Error("Unresolved compilation problems:"
      + "\nUsuario cannot be resolved to a type."
      + "\nnombre cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncontraseña cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public Usuario getUsuario() {
    throw new Error("Unresolved compilation problems:"
      + "\nUsuario cannot be resolved to a type."
      + "\nnombre cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public ControladorUsuario loguear() {
    Usuario _usuario = this.getUsuario();
    return new ControladorUsuario(_usuario, this.del);
  }
  
  public String registrarUsuario() {
    throw new Error("Unresolved compilation problems:"
      + "\nUsuarioExisteException cannot be resolved to a type."
      + "\nagregarUsuario cannot be resolved"
      + "\ntoString cannot be resolved");
  }
  
  public boolean puedoLoguear() {
    throw new Error("Unresolved compilation problems:"
      + "\nUsuario cannot be resolved to a type."
      + "\nusuarios cannot be resolved"
      + "\nnombre cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncontraseña cannot be resolved"
      + "\n== cannot be resolved");
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
