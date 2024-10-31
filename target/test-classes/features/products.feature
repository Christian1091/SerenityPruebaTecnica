@Suite @Products
Feature: Flujo de compras

  Background: Realizar la compra de 2 productos, visualizar en el carrito y finalizar la compra

    Given el usuario navega al sitio web

    Scenario: Agregar productos al carrito
      And agregamos productos al carrito de compras
      And dar click en el icono del carrito
      And visualizar los productos agregados en el carrito de compras
      And dar click en el boton checkout
      When completa el registro de la compra
