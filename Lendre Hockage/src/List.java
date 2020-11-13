import java.io.FileReader;
import java.util.Scanner;
import java.io.*;
import java.util.stream.Stream;
import java.util.ArrayList;
public class List {
    public static void items() {
       //Динамический массив
Admin.out(Admin.arr);

            System.out.println();
            Scanner scan = new Scanner(System.in);
            String S;
        String R;
        String Li = "";
        boolean flag = false;
            while (flag == false) {
                System.out.println("Вы хотите добавить что-нибудь в Вашу корзину?\n1.Да    2.Нет");
                S = scan.next();

                switch (S) {
                    case "1":

                        R = scan.next();
                        int y = Integer.parseInt(R);
                                Li = Li + Admin.arr.get(y-1) + "\n";break;

                    case "2":
                        flag = true;
                        break;
                    default:
                        System.out.println("Вы ввели несуществующее действие!");
                }
            }


            System.out.println("Ваш список продуктов:\n" + Li + "\n1.Оплатить покупки    2.Очистить корзину    3.Выйти");
            String T;
            T = scan.next();
            switch (T) {
                case "1":
                    System.out.println("Покупка оплачена! Деньги списаны с Вашего счета");
                    break;
                case "2":
                    Li = "";

                    System.out.println("Корзина очищена!");
                    break;
                case "3":
                    System.out.println("Всего доброго, путник!");
                    break;
                default:
                    System.out.println("Такого действия нет.");
            }


    }
}
