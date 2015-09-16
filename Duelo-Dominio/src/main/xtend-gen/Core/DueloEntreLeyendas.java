package Core;

import Duelo.Duelo;
import Exepcion.DueloEnEspera;
import TarjetaDeDuelo.TarjetaDeDuelo;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class DueloEntreLeyendas {
  private List<TarjetaDeDuelo> buscadores;
  
  private TarjetaDeDuelo tddBoot;
  
  public DueloEntreLeyendas(final TarjetaDeDuelo tddBoot) {
    ArrayList<TarjetaDeDuelo> _arrayList = new ArrayList<TarjetaDeDuelo>();
    this.buscadores = _arrayList;
    this.tddBoot = tddBoot;
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
      boolean _esRivalDigno = duelo.esRivalDigno(posibleRival);
      if (_esRivalDigno) {
        rival = posibleRival;
      }
    }
    return rival;
  }
  
  public boolean entrarEnCola(final TarjetaDeDuelo tdd) {
    return this.buscadores.add(tdd);
  }
  
  public boolean salirDeLaCola(final TarjetaDeDuelo tdd) {
    return this.buscadores.remove(tdd);
  }
  
  public Duelo dueloConBoot(final TarjetaDeDuelo tdd) {
    return new Duelo(tdd, this.tddBoot);
  }
  
  @Pure
  public List<TarjetaDeDuelo> getBuscadores() {
    return this.buscadores;
  }
  
  public void setBuscadores(final List<TarjetaDeDuelo> buscadores) {
    this.buscadores = buscadores;
  }
  
  @Pure
  public TarjetaDeDuelo getTddBoot() {
    return this.tddBoot;
  }
  
  public void setTddBoot(final TarjetaDeDuelo tddBoot) {
    this.tddBoot = tddBoot;
  }
}