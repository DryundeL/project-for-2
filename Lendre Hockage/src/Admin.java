import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
public class Admin {
    static ArrayList arr = new ArrayList();

    public static void Dob(ArrayList arr) {

        String tov;
        int i = 3;
        Scanner gvn = new Scanner(System.in);
        while (i >= 0) {
            arr.add(tov = gvn.nextLine());
            i--;

        }
    }

    public static void out(ArrayList arr) {
        Stream stream;
        arr.stream()
                .forEach(s -> System.out.println(s));

    }


    public static void Menu1() throws FileNotFoundException {

            System.out.println("Вы вошли как администратор!");
            boolean flag = false;
            while (flag == false) {
                System.out.println("Что бы вы хотели сделать: \n1.Добавить товар на продажу   2.Очистить список     3.Просмотреть отзывы   4.Выйти из аккаунта   5.Выйти из программы");
                Scanner scan = new Scanner(System.in);
                String Act = scan.next();
                switch (Act) {
                    case "1":
                        Dob(arr);
                        out(arr);
                        break;
                    case "2":
                        System.out.println("Список очищен");
                        break;
                    case "3":
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
                    case "4":
                        flag = true;
                        Authorization .author();
                        break;
                    case "5": flag = true; System.out.println("Не помрите!");break;
                    default:
                        System.out.println("Ну ты издеваешся? Нет?");
                }
            }
        }
    }

