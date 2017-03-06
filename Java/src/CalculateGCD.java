/**
 * Created by krutarthjoshi on 2/26/17.
 */
public class CalculateGCD {

    private int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        CalculateGCD gcd = new CalculateGCD();
        System.out.println(gcd.gcd(18, 4));
        System.out.println(gcd.lcm(4, 18));
    }
}
