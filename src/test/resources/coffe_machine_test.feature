# language:ru
Функция: Проверка функционала кофе-машины

  @e2e_success
  Структура сценария: Пользователь получает кружку кофе
    Пусть Пользователь добавляет в кофемашину
      | coffee | <putCoffee> |
      | water  | <putWater>  |
    Когда Пользователь делает кружку с кофе
    То В кофемашине осталось
      | coffee | <actualCoffee> |
      | water  | <actualWater>  |

    Примеры:
      | putCoffee | putWater | actualCoffee | actualWater |
      | 100       | 700      | 90           | 500         |
      | 100       | 800      | 90           | 600         |
      | 300       | 3000     | 190          | 1800        |
