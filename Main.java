import java.util.Random;

public class Main {
    public static void main(String[] args) {

        boolean isIt;
        byte a;
        short b;
        int c;
        long d;
        float e;
        double g;
        char char1;
        char char2;
        String string;
        Random random = new Random();
         isIt = random.nextBoolean();
         a = (byte) random.nextInt(1001);
         b = (short) random.nextInt(1000001);
         c = random.nextInt(10000001);
         d = random.nextLong();
         e = random.nextFloat();
         g = random.nextDouble();
         string = String.valueOf(d);
         char1 = (char) random.nextInt();
         char2 = (char) c;

        System.out.println(char1+","+char2);

        System.out.println( isIt+","+a+","+b+","+c+","+d+","+e+","+g+"," +string + "," + char1 + "," + char2);
    }
}