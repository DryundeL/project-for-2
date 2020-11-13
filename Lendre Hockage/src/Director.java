import java.util.Scanner;

public class Director {
    public static void dir() {
        System.out.println("Вы вошли как Поддержка!");
        boolean flag = false;
        while (flag == false) {
            System.out.println("Что бы вы хотели сделать: 1.Посмотреть комментарии     2.Открыть почту     3.Выйти ");
            Scanner scan = new Scanner(System.in);
            String ch = scan.next();
            switch (ch) {
                case "1":
                    int a = 0, b = 10;
                    for (int i = 0; i < 3; i++) {
                        int random_number = a + (int) (Math.random() * b);
                        switch (random_number) {
                            case 0:
                                System.out.println("Всё понравилось! Очень вкусно!");
                                break;
                            case 1:
                                System.out.println("Фу! Я помню как мы мидии жарили когда-то! Они так воняли, я до сих пор помню...");
                                break;
                            case 2:
                                System.out.println("Мне не понравилось...");
                                break;
                            case 3:
                                System.out.println("Отлично! Всё супер!");
                                break;
                            case 4:
                                System.out.println("Мне по нраву");
                                break;
                            case 5:
                                System.out.println("Ну я думаю что воспользуюсь в следующий раз");
                                break;
                            case 6:
                                System.out.println("Неплохой магазин, цены приемлемые");
                                break;
                            case 7:
                                System.out.println("Да это жоско");
                                break;
                            case 8:
                                System.out.println("Ееееее боййййййй");
                                break;
                            case 9:
                                System.out.println("Да, магазин хороший, меня всё устроило");
                                break;
                            case 10:
                                System.out.println("Никому бы не порекомендовал");
                                break;
                        }
                    }

                    break;
                case "2":
                    int c = 0, d = 10;
                    for (int i = 0; i < 5; i++) {
                        int random_number = c + (int) (Math.random() * d);
                        switch (random_number) {
                            case 0:
                                System.out.println("Помогите пожалуйста, не работает регистрация");
                                break;
                            case 1:
                                System.out.println("Как тут что работает?");
                                break;
                            case 2:
                                System.out.println("Непонятно ничего");
                                break;
                            case 3:
                                System.out.println("Как опалатить покупки?");
                                break;
                            case 4:
                                System.out.println("Как добавить в корзину?");
                                break;
                            case 5:
                                System.out.println("Что делать если недоволен качеством товара?");
                                break;
                            case 6:
                                System.out.println("Зачем тут так много букв?");
                                break;
                            case 7:
                                System.out.println("Помогите вернуть товар");
                                break;
                            case 8:
                                System.out.println("Я ничего не понял, работает как то криво");
                                break;
                            case 9:
                                System.out.println("Верните деньги, мошенники");
                                break;
                            case 10:
                                System.out.println("У вас немного нет товара");
                                break;
                        }
                    }

                    break;
                case "3": flag=true;break;
            }
        }
    }
}


