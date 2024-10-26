import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a;
        int b;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение чисел");
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        a = Integer.parseInt(splitInput[0]);
        b = Integer.parseInt(splitInput[2]);
        String operation = splitInput[1];

        switch(operation){
            case "+" : result = a + b;
                break;
            case "-" : result = a - b;
                break;
            case "*" : result = a * b;
                break;
            case "/" : result = a / b;
                break;
            default:
                System.out.println("Введен неверный оператор");
                return;
        }
        System.out.println(result);
    }
}
