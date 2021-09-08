Feature: Prueba automatización

  Background: El usuario ingresa a la web
    Given ingreso a la plataforma demoqa

  @webTable @agregarRegistro
  Scenario: Como usuario quiero agregar registros en la tabla web
    Given Ingreso al submodulo web tables
    When  Ingreso los datos "datos.xls" para el registro
    Then Agrego el registro en la tabla

  @webTable @eliminarRegistro
  Scenario: Como usuario quiero eliminar un registro de la tabla web
    Given Ingreso al submodulo web tables
    When Selecciono la opcion eliminar registro
    Then Elimino el registro de la tabla




