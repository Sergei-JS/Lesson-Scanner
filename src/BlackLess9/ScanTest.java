package BlackLess9;

import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int i = scanner.nextInt();
        System.out.print("Введите второе число:");
        int s = scanner.nextInt();

        System.out.println("Результат деления: " + i / s);
        System.out.print("Остаток от деления: " + i % s);
    }
}

