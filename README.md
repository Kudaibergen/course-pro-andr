# ДЗшки

### HW-7

1) Заполнить экран вьюшками и вширь и вниз.
Чтобы была возможность скролить экран по вертикали.
И если необходимо по горизонтали

2) Дополнительно <br/>
Сверстать [экран](https://riggaroo.co.za/wp-content/uploads/2017/09/constraintlayout_android_example.png) с помощью ConstraintLayout`а


### HW-8

Приложение "Светофор". <br/>
Интерфейс программы будет выглядеть следующим образом. <br/>
На экране расположены три кнопки и одна текстовая надпись. <br/>
 * При нажатии кнопок фон программы будет меняться на соответствующий цвет,
который закреплён за определённой кнопкой, а так же меняется текст в TextView`шке


### HW-9

Приложение "Счетчик". <br/>
Интерфейс программы будет выглядеть следующим образом. <br/>
На экране расположены две кнопки и одна текстовая надпись. <br/>
 * При нажатии на кнопку "Щёлк" счетчик увеличивается на одну единицу в TextView`шке. <br/>
 * При нажатии на кнопку "Сброс" счетчик обнуляется. <br/>
Приложение должно уметь менять ориентацию экрана и сохранять значение счетчика. <br/>


### HW-10

Приложение "Калькулятор". <br/>
Обрабатывать все ошибки, деление на 0.
Библиотека objecthunter

    implementation 'net.objecthunter:exp4j:0.4.8'

Интерфейс программы [тут](https://ibb.co/6JSpYFb)


### HW-11

Отправляем почту через стороннее приложение. <br/>
Интерфейс программы будет выглядеть следующим образом. <br/>
На экране расположены три EditText`а и одна кнопка. <br/>
 * При нажатии на кнопку "Отправить" открывается приложение почты
и подставляются данные введеные пользователем. email(кому), subject(тема), text(текст письма). <br/>
 * Показать Toast, если у пользователя не предустановлено ни одного приложение почты.


### HW-12

Стилизовать приложение "Калькулятор" из HW-10 используя приобретенные навыки с урока.


### HW-13

Интерфейс программы будет выглядеть следующим образом. <br/>
На экране расположены два фрагмента. <br/>
  * Первый фрагмент с красным фоном, с тремя кнопками и одной текстовой надписью. <br/>
  * Второй фрагмент с зеленым фоном и одной текстовой надписью. <br/>
  * В [портретной](https://ibb.co/C1DZ7Sy) ориентации фрагменты лежат вертикально, первый сверху, второй снизу. <br/>
  * В [альбомной](https://ibb.co/RvgTHwV) ориентации фрагменты лежат горизонтально, первый слева, второй справа. <br/>
  * При смене ориентации фрагменты должны менять свое расположение. <br/>


### HW-14

Отсутствует.


### HW-15

Фрагменты. <br/>
Интерфейс программы будет выглядеть следующим образом. <br/>
На [экране](https://ibb.co/5jwMzDq) расположены два фрагмента. <br/>
  * Первый фрагмент с красным фоном, с тремя кнопками и одной текстовой надписью. <br/>
  * Второй фрагмент с зеленым фоном, одной текстовой надписью и одной ImageView`шкой. <br/>
  * При нажатии кнопок менять картинку во втором фрагменте. <br/>


### HW-16

Фрагменты. <br/>
Доделать пример с классного урока. <br/>
Интерфейс программы будет выглядеть следующим образом. <br/>
На [экране](https://ibb.co/NrDrzKY) расположены два фрагмента. <br/>
  * В обоих фрагментах расположены TextView, EditText и Button. <br/>
  * По клику на кнопку в первом фрагменте отправлять содержимое EditText`а
    в TextView второго фрагмента <br/>
  * По клику на кнопку во втором фрагменте отправлять содержимое EditText`а
    в TextView первого фрагмента <br/>


### HW-17

Фрагменты. <br/>
Приложение с "Авторизацией" <br/>
Приложение будет состоять из 2х экранов. <br/>
1й [экран](https://ibb.co/BccpTNN) - Экран авторизации. 2й [экран](https://ibb.co/gg2FPzN) - Главный экран <br/>
  * На первом экране расположены поля ввода почты и пароля <br/>
  * Зашить данные юзера (почта и пароль) в приложение <br/>
  * Если данные введены не верно, показывать сплывающее сообщение об ошибке <br/>
  * Если данные введены верно, открывать второй экран <br/>
  * Клавиатура для ввода почты должна быть оптимизирована под ввод почты <br/>
  * Клавиатура для ввода почты должна иметь кнопку перехода на ввод пароля <br/>
  * Клавиатура для ввода пароля должна быть оптимизирована под ввод пароля <br/>
  * Клавиатура для ввода пароля должна иметь кнопку скрытия клавиатуры <br/>
  * Оба поля ввода не должны позволять вводить юзеру больше одной строки <br/>
  * Оба поля ввода должны уметь сохранять состояние при перевороте экрана <br/>
  * Кнопка "Войти" должна быть не активна, если хоть одно из полей пустое <br/>
  * На главном экране не должно быть перехода назад на экран авторизации <br/>

\* Использовать single activity архитектуру <br/>


### HW-18

Фрагменты + меню. <br/>
Приложение с "Меню" <br/>
Приложение будет состоять из 3х экранов. В продолжение к предыдущему заданию <br/>
  * На главном экране добавьте пункт меню "О себе" [экране](https://ibb.co/V2kx7gX) <br/>
  * По клику на пункт "О себе" открывать соответствующий [экран](https://ibb.co/MPgW9FG) <br/>
  * На всех экранах в заголовке в тулбаре отображать название экрана <br/>
  * На экране "О себе" в тулбаре отображать стрелку "Назад", по клику на нее возвращаться на главный экран <br/>

\* Использовать single activity архитектуру <br/>


### HW-19

View Binding <br/>

Перенесите приложение "Калькулятор" из HW-10 на вьюБиндинг


### HW-20

RecyclerView <br/>

asdklkasd