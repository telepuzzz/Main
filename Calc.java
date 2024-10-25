import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a;
        int b;
        int result;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа от 1 до 10");
        a = scanner.nextInt();
        b = scanner.nextInt();
        if((a <= 0) |(a > 10) | (b <= 0) | (b > 10)){
            System.out.println("Вы ввели неподходящее число");
        }
        System.out.println("Введите знак операции");
        operation = scanner.next().charAt(0);
        switch(operation){
            case '+' : result = a + b;
            break;
            case '-' : result = a - b;
            break;
            case '*' : result = a * b;
            break;
            case '/' : result = a / b;
            break;
            default:
                System.out.println("Введен неверный оператор");
                return;
        }
        System.out.println(a + " " + operation + " " + b + " " + "=" + " " + result);
    }
}
