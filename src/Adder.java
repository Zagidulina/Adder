import java.util.*;

public class Adder {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(
                System.in
        );
        System.out.println("Введите пожалуйста,первое слагаемое");
        int value1 = myScanner.nextInt();
        System.out.println("Введите пожалуйста,второе слагаемое");
        int value2 = myScanner.nextInt();
        int sumOfTwoValues = sum(value1, value2);
        System.out.println("Результат сложения: " + sumOfTwoValues);

    }public
    static int sum(int value1, int value2){
        int result = value1 + value2;
        return result;
    }
}

