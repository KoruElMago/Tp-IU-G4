package controladores;

import Core.DueloEntreLeyendas;
import Duelo.Duelo;
import TarjetaDeDuelo.TarjetaDeDuelo;
import controladores.ControladorDuelo;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class ControladorBuscadorDuelo {
  private DueloEntreLeyendas del;
  
  private TarjetaDeDuelo tarjetaUsuario;
  
  private TarjetaDeDuelo tarjetaRetador;
  
  private String textoAMostrar;
  
  public ControladorBuscadorDuelo(final DueloEntreLeyendas del, final TarjetaDeDuelo us, final TarjetaDeDuelo retador, final String text) {
    this.del = del;
    this.tarjetaUsuario = us;
    this.textoAMostrar = text;
    this.tarjetaRetador = retador;
  }
  
  public ControladorDuelo aceptarDuelo() {
    Duelo duelo = new Duelo(this.tarjetaUsuario, this.tarjetaRetador);
    return new ControladorDuelo(duelo, this.del);
  }
  
  @Pure
  public DueloEntreLeyendas getDel() {
    return this.del;
  }
  
  public void setDel(final DueloEntreLeyendas del) {
    this.del = del;
  }
  
  @Pure
  public TarjetaDeDuelo getTarjetaUsuario() {
    return this.tarjetaUsuario;
  }
  
  public void setTarjetaUsuario(final TarjetaDeDuelo tarjetaUsuario) {
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
