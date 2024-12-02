Feature: Realizar login

  @Login @HappyPath
  Scenario Outline: Login exitoso con credenciales válidas
    Given el usuario está en la página de inicio
    And el usuario selecciona el boton de login
    And ingresa un nombre de usuario "<username>" y contraseña "<password>"
    When el usuario selecciona el boton de logearse
    Then se realiza el logeo de manera correcta

    Examples:
      | username    | password |
      | Jose13      | 123456  |
