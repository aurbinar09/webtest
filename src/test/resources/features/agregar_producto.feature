Feature: Seleccionar un producto y agregarlo al carrito

  @AgregarProducto @HappyPath
  Scenario Outline: Seleccionar un producto y agregarlo al carrito
    Given el usuario está en la página de inicio producto
    When selecciona el producto "<producto>"
    Then el producto se agrego al carrito

    Examples:
      | producto            |
      | Samsung galaxy s6   |