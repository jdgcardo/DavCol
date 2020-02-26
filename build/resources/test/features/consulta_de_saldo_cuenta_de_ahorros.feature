#language: es

  Característica: Consulta de saldo cuenta de ahorros en la app Davivienda Col
    Yo como usuario de la app Davivienda
    Quiero consultar el saldo de mi cuenta de ahorros y descargar el extracto
    Para conocer el dinero disponible en la cuenta y los movimientos.
@test1
  Esquema del escenario: Consulta de saldo cuenta de ahorros
    Dado que Juan esta logueado en la app davivienda con los datos
      | tipoDocumento   | numDocumento   | contrasena   |
      | <tipoDocumento> | <numDocumento> | <contrasena> |
    Cuando el consulta el saldo de la cuenta
    |numCuenta|
    |<numCuenta>|
    Entonces el saldo se muestra en la app
    |saldo|
    |<saldo>|
    Ejemplos:
      | tipoDocumento        | numDocumento | contrasena | numCuenta | saldo|
      | Cédula de Ciudadanía |57000000       |2587       |****8024   |173,551,025.86|

    Esquema del escenario: Consulta de saldo cuenta bloqueada
      Dado que Juan esta logueado en la app davivienda con los datos
        | tipoDocumento   | numDocumento   | contrasena   |
        | <tipoDocumento> | <numDocumento> | <contrasena> |
      Cuando el consulta el saldo de la cuenta
        |numCuenta|
        |<numCuenta>|
      Entonces se muestra mensaje CUENTA BLOQUEADA
      Ejemplos:
        | tipoDocumento        | numDocumento  | contrasena| numCuenta |
        | Cédula de Ciudadanía |1018487375       |2587       |****0313   |


    Esquema del escenario: Descarga extracto de cuenta de ahorros
      Dado que Juan esta logueado en la app davivienda con los datos
        | tipoDocumento   | numDocumento   | contrasena   |
        | <tipoDocumento> | <numDocumento> | <contrasena> |
      Cuando el descarga el extracto del mes
        |numCuenta|saldo|mesExtracto|
        |<numCuenta>|<saldo>|<mesExtracto>|
      Entonces el valida el extracto
        |mesExtracto|
        |<mesExtracto>|

      Ejemplos:
        | tipoDocumento        | numDocumento | contrasena | numCuenta | saldo        |mesExtracto |
        | Cédula de Ciudadanía |57000000       |2587       |****8024   |173,562,973.46|Octubre 2018|