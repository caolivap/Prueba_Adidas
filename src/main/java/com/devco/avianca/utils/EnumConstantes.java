package com.devco.avianca.utils;

public enum EnumConstantes {
  FORMATO_FECHA_YYYY_MM__DD("yyyy-MM-dd");

  private String valor;

  private EnumConstantes(String valor) {
    this.valor = valor;
  }

  public String getValor() {
    return valor;
  }
}
