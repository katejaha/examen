@Demo-auto
Feature: Examen Automatizacion

  Scenario Outline: Examen de automatizacion
    And Ingresamos la url de la <pagina>
    And Ingresamos lugar <datos>
    And Ingresamos fecha inicio <mes_entrada><dia_entrada>
    And Ingresamos fecha fin <checkout>
    And Seleccionamos personas <cantidad>




    Examples:
      | pagina  | datos | mes_entrada | dia_entrada | cantidad |  |  |
      | Booking | cusco | 7-2024      | 14          |          |  |  |