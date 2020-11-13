import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Authorization {


    public static void author() throws FileNotFoundException {
        boolean FLAG = false;
        String L,P;
        Scanner scan = new Scanner(System.in);
        boolean gvn=false;
        int i =0;
        while (FLAG == false) {
            Scanner in = new Scanner(new File("C://reg/reg.txt"));
            System.out.println("Введите логин");
            L = scan.next();
            System.out.println("Введите пароль");
            P = scan.next();
            String s;
            try {
                while (in.hasNextLine()) {

                    s = in.nextLine();
                    String words[] = s.split(" ");
                    while (gvn == false) {
                        if (words[i].equals(L) && words[i + 1].equals(P)) {
                            gvn = true;
                            switch (words[i + 2]) {
                                case "1":
                                    Admin.Menu1();
                                    break;
                                case "2":
                                    Pokupatel.Menu2();
                                    break;
                                case "3":
                                    Director.dir();
                                    break;
                            }
                        } else i = i + 3;
                        if (gvn == true) FLAG = true;
                    }
                }

                in.close();


            }
            catch (Exception ex){
                System.out.print(ex.getMessage());

            }
        }
    }
}