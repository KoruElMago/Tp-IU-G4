package Denuncia;

import Denuncia.TipoDenuncia;

@SuppressWarnings("all")
public class AbusoSistDenuncia extends TipoDenuncia {
  public AbusoSistDenuncia() {
    this.setTipo("Abuso del Sistema de Denuncia");
    this.setPeso(Integer.valueOf(25));
  }
}
