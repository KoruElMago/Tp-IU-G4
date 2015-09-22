package Denuncia;

import Denuncia.TipoDenuncia;

@SuppressWarnings("all")
public class FeedIntencionalDenuncia extends TipoDenuncia {
  public FeedIntencionalDenuncia() {
    this.setTipo("Feed intencional");
    this.setPeso(Integer.valueOf(10));
  }
}
