package Denuncia;

import Denuncia.TipoDenuncia;

@SuppressWarnings("all")
public class AbusoHabilDenuncia extends TipoDenuncia {
  public AbusoHabilDenuncia() {
    this.setTipo("Abuso de habilidad");
    this.setPeso(Integer.valueOf(5));
  }
}
