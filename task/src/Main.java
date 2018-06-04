import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        String s1 = scanner.next();

        System.out.println("Введіть друге число:");
        String s2 = scanner.next();

        char[] chars = s2.toCharArray();
        BigInteger a =new BigInteger(s1);
        BigInteger b =new BigInteger(s1);

        BigInteger x;
        BigInteger y;
        BigInteger d = BigInteger.valueOf(1);
        BigInteger result = BigInteger.valueOf(0);

        System.out.println("Проміжні результати:");

        for (int i = 0; i < chars.length; i++) {

            x = b.remainder(BigInteger.valueOf(10));
            y = x.multiply(d).multiply(a);
            d = d.multiply(BigInteger.valueOf(10));
            System.out.println(y);
            b = b.divide(BigInteger.valueOf(10));
            result = result.add(y);
        }

        System.out.println("Результат:");

        System.out.println(result);
    }
}
