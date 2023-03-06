// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

import java.util.Scanner;
public class Additional_task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.println("Введите выражение по типу 2? + 4? = 45. Пробелы после значений обязательны!");
    String text = in.nextLine();
    String [] expr = text.split(" ");
    String first = expr[0];
    String second = expr[2];
    int res = Integer.parseInt(expr[4]);
    in.close();
    Boolean Flag = false;
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            Character one = Integer.toString(i).charAt(0);
            Character two = Integer.toString(j).charAt(0);
            int a = Integer.parseInt(first.replace('?', one));
            int b = Integer.parseInt(second.replace('?', two));
            int total = a+b;
            if (total == res){
                System.out.printf("%d + %d = %d", a,b,res);
                System.out.println(); 
                Flag = true;
            };
               
                
            }
            }
    if (Flag == false){
        System.out.println("Решений нет!");

    }        
    }
}
