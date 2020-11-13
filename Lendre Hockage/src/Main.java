import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
            System.out.println("Вас приветвует интернет магазин ");
            System.out.println("Вы зарегистрированный пользователь?\n1.Да   2.Нет");
            String S = scan.next();
            if (S.equals("1")) Authorization.author(); // Переход на форму авторизации
            else Registration.regist(); //Переход на форму регистрации

    }
}
