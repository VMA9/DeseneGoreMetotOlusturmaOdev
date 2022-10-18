import java.util.Scanner;

public class Main {
    static void f(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            f(n - 5);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = input.nextInt();
        System.out.print("Çıktısı : ");
        f(n);
    }
}