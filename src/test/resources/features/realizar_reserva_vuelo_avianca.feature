#language: es

Característica: Realizar búsqueda de vuelos en Avianca
  Yo como usuario de Avianca
  Quiero buscar vuelos entre dos ciudades dadas
  Para conocer la disponibilidad de vuelos en una fecha establecida

  @Escenario1
  Esquema del escenario: Reserva exitosa de vuelo
    Dado que Carlos se encuentra en la página inicial de la aerolínea Avianca
    Cuando busca vuelos solo de ida desde <Ciudad Origen> hacia <Ciudad Destino> para dentro de <Número Días> días
    Entonces se obtienen los vuelos disponibles para esa fecha

    Ejemplos:
      | Ciudad Origen | Ciudad Destino | Número Días |
      | Medellín      | Bogotá         | 40          |