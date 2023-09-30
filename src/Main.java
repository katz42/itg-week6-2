import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = num%2;
        String result = num==0 ? "Вы ввели чётное число" : "Вы ввели нечётное число";
        System.out.println(result);
    }
}