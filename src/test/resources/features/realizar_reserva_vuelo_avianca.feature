#language: es

Característica: Realizar una reserva de vuelo en Avianca
  Yo como usuario de Avianca
  Quiero buscar el vuelo más económico entre dos ciudades dadas
  Para reservar con anticipación mi vuelo

  @Escenario1
  Esquema del escenario: Reserva exitosa de vuelo
    Dado que Carlos se encuentra en la página inicial de la aerolínea Avianca
    Cuando busca vuelos de ida desde <CiudadOrigen> hacia <CiudadDestino>
    Y reserva el vuelo más económico
    Entonces se genera un número de reserva exitosamente

    Ejemplos:
      | CiudadOrigen | CiudadDestino |
      | Medellín     | Bogotá        |