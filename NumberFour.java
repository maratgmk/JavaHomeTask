public class NumberFour {
    public static void main(String[] args) {
        double x;
        double y;
        x = Math.random();
        y = Math.random();
        System.out.println(x+"," +y);
        double mod = Math.abs(x-y);
        System.out.println(mod);
        double min = Math.min(x,y);
        System.out.println(min);
        double max = Math.max(x,y);
        System.out.println(max);
        double power = Math.pow(x,y*10);
        System.out.println(power);
        double e1 = Math.exp(x);
        double e2 = Math.exp(y);
        System.out.println(e1 + "," + e2);
        double p = Math.exp(Math.PI);
        double q = Math.pow(Math.E,Math.PI);
        System.out.println(Math.abs(p-q));
        System.out.println(Math.cos(x)*Math.cos(x) + Math.sin(x)*Math.sin(x));


    }
}
