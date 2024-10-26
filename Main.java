import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение чисел");
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input){
        String[] splitInput = input.split(" ");
        int a = Integer.parseInt(splitInput[0]);
        int b = Integer.parseInt(splitInput[2]);
        String operation = splitInput[1];
        int i = 0;
        switch(operation){
            case "+" : i = a + b;
              break;
            case "-" : i = a - b;
              break;
            case "*" : i = a * b;
              break;
            case "/" : i = a / b;
              break;
            default:
                System.out.println("Неверный оператор");
        }
        return String.valueOf(i);
    }
}


