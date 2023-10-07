import java.util.Scanner;

public class NumberThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        numberOne = scanner.nextInt();
        numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;
        int sub = numberOne - numberTwo;
        int mult = numberOne*numberTwo;
        int div = numberOne/numberTwo;
        int remainder = numberOne%numberTwo;

        System.out.println(sum+","+sub+","+mult+","+div+","+remainder);




    }
}
