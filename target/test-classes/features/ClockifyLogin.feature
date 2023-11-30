
Feature: realizar un login exitoso en Clockify
  Background:
    Given El usuario se encuentra en la pagina de login
  @Clock
  Scenario Outline: Login exitoso
    When El usuario se loguea en la aplicacion con: <email>, <password>
    Then Se verifica que se haya logueado correctamente
    And Hace click en "+"
    And Se agregan las horas "<hour>" y minutos "<minute>"
    And Se guardan las horas y minutos
    Then Se verifica que vuelve a la pagina de inicio
#    And Hace click en "+"
#    And Hace click en "fecha"
#    And Se agrega la fecha deseada con: "<month>", "<day>", "<year>"
#    And Se guarda la fecha deseada
#    Then Se verifica que vuelve a la pagina de inicio
    And Hace click en "+"
    And Se agregan las horas "<hour>" y minutos "<minute>"
    And Se descartan los cambios de las horas y minutos
    Then Se verifica que vuelve a la pagina de inicio
    And Se dirije a configuraciones
    And Habilita el modo oscuro
    And el usuario cierra la sesion
    Then Se verifica que vuelve a la pagina de login

    Examples:
      | email                   | password   | hour | minute | month | day | year |
      | brianazcona25@gmail.com | Chubut2528 | 02   | 01     |       |     |      |