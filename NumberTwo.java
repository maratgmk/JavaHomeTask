import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double weight;
        System.out.println("Введите своё имя: ");
        name = scanner.next();
        System.out.println("Сколько Вам лет?");
        age = scanner.nextInt();
        System.out.println("Какой Ваш вес?");
        weight = scanner.nextDouble();

       System.out.println("Уважаемый, "+name+"!"+"В свои "+age+" лет Вы для на дороги, как "
            + weight +" килограмм золота ");
        System.out.printf("Уважаемый, %s! В свои %d лет Вы для нас дороги, как %.2f килограмм золота" ,name, age, weight);





    }
}
