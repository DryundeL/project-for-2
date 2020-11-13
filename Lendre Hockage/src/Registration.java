import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Registration {

    public static void regist(){  //Занесение в BD данных пользователя
        Scanner registr = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("C://reg/reg.txt", true)){

            System.out.println("Введите логин,пароль и роль(1.Админ       2.Покупатель      3.Поддержка) через пробел (В самом логине или пароле пробелов быть не должно");
            System.out.println("Введите логин: ");
            String log = registr.next();
            System.out.println("Введите пароль: ");
            String pass = registr.next();
            System.out.println("Введите роль: ");
            String role = registr.next();
            fw.write(log + " "+pass+" " + role +" ");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    }

