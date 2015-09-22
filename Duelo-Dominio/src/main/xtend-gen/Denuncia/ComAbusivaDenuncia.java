package Denuncia;

import Denuncia.TipoDenuncia;

@SuppressWarnings("all")
public class ComAbusivaDenuncia extends TipoDenuncia {
  public ComAbusivaDenuncia() {
    this.setTipo("Comunicacion Abusiva");
    this.setPeso(Integer.valueOf(7));
  }
}
