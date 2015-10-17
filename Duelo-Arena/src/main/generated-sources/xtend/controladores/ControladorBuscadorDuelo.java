package controladores;

import controladores.ControladorDuelo;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors/* 
@TransactionalAndObservable */
@SuppressWarnings("all")
public class ControladorBuscadorDuelo {
  private /* DueloEntreLeyendas */Object del;
  
  private /* //Usuario usuario
  	//List<Linea> lineas
  	//List<Personaje> personajes
  	//Personaje personajeElegido
  	//Linea lineaElegida
  	TarjetaDeDuelo */Object tarjetaUsuario;
  
  private /* TarjetaDeDuelo */Object tarjetaRetador;
  
  private String textoAMostrar;
  
  public ControladorBuscadorDuelo(final /* DueloEntreLeyendas */Object del, final /* TarjetaDeDuelo */Object us, final /* TarjetaDeDuelo */Object retador, final String text) {
    this.del = del;
    this.tarjetaUsuario = us;
    this.textoAMostrar = text;
    this.tarjetaRetador = retador;
  }
  
  public ControladorDuelo aceptarDuelo() {
    throw new Error("Unresolved compilation problems:"
      + "\nDuelo cannot be resolved to a type."
      + "\nDuelo cannot be resolved.");
  }
  
  @Pure
  public DueloEntreLeyendas getDel() {
    return this.del;
  }
  
  public void setDel(final DueloEntreLeyendas del) {
    this.del = del;
  }
  
  @Pure
  public //Usuario usuario
  	//List<Linea> lineas
  	//List<Personaje> personajes
  	//Personaje personajeElegido
  	//Linea lineaElegida
  	TarjetaDeDuelo getTarjetaUsuario() {
    return this.tarjetaUsuario;
  }
  
  public void setTarjetaUsuario(final //Usuario usuario
  	//List<Linea> lineas
  	//List<Personaje> personajes
  	//Personaje personajeElegido
  	//Linea lineaElegida
  	TarjetaDeDuelo tarjetaUsuario) {
    this.tarjetaUsuario = tarjetaUsuario;
  }
  
  @Pure
  public TarjetaDeDuelo getTarjetaRetador() {
    return this.tarjetaRetador;
  }
  
  public void setTarjetaRetador(final TarjetaDeDuelo tarjetaRetador) {
    this.tarjetaRetador = tarjetaRetador;
  }
  
  @Pure
  public String getTextoAMostrar() {
    return this.textoAMostrar;
  }
  
  public void setTextoAMostrar(final String textoAMostrar) {
    this.textoAMostrar = textoAMostrar;
  }
}
