import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a, toplm = 0;
        out.println("Mükemmel sayıyı bulma programı." +
                "\nMükemmel sayı nedir ?" +
                "\nBir sayının kendisi hariç pozitif tam " +
                "sayı çarpanları (kalansız bölen sayıların) toplamı" +
                " kendisine eşit olan sayıya mükemmel sayı denir.");
        out.print("Bir sayı giriniz : ");
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                toplm += i;
            }
        }
        if ((toplm-a) == a) {
            out.print(a + " sayıyı Mükemmek sayıdır.");
        } else out.print(a + " sayıyı Mükemmek sayıdeğildir.");

    }

}

