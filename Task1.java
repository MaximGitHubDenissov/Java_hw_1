
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! 
// (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
import java.util.Scanner;;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число N:");
        int N = in.nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= N; i++) {
            sum += i;
            mult *= i;
        }
        System.out.println(sum);
        System.out.println(mult);
        in.close();
    }
}