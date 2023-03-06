// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = in.nextInt();
        System.out.println("Введите операцию: +,-,*,/");
        char oper = in.next().charAt(0);
        System.out.println("Введите второе число: ");
        int numberTwo = in.nextInt();
        if (oper == '+'){
            summ(numberOne,numberTwo);
        }
        if (oper == '-'){
            sub(numberOne,numberTwo);
        }
        if (oper == '*'){
            mult(numberOne, numberTwo);
        }
        if (oper == '/'){
            dev(numberOne, numberTwo);
        }
        in.close();
    }
        static void summ(int a, int b) {
            System.out.printf("%d + %d = %d",a,b,a+b);
    }
        static void sub(int a, int b) {
            System.out.printf("%d - %d = %d",a,b,a-b);
    }
        static void mult(int a, int b) {
            System.out.printf("%d * %d = %d",a,b,a*b);
    }
        static void dev(int a, int b) {
            System.out.printf("%d / %d = %d",a,b,a/b);
        }
}
