#language: es
  Característica: Registrar un usuario en Haceb y agregar un producto al carrito
    Yo como usuario quiero registrarme en la pagina Haceb exitosamente
    y agregar un producto al carrito de compras


  Escenario: Registro de usuario exitoso
    Dado que el usuario abre la pagina de Haceb
    Cuando de click en registrarse e ingresar a Haceb
    Y diligencie el formulario de registro y de click en registrarme
    Y diligencie el formulario de mas detalles y de click en enviar
    Entonces podra visualizar su perfil

    Escenario: Agregar producto al carrito
      Cuando seleccione una categoria de productos
      Y seleccione una subcategoria aleatoriamente
      Y agregue un producto al carrito
      Entonces el usuario podra ver el nombre del producto en el carrito