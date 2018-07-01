import java.util.Scanner;


public class MyIntegerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        MyInteger myInteger = new MyInteger(13);

        System.out.println(myInteger.isEven(3));
        System.out.println(myInteger.isPrime(13));
        System.out.println(myInteger.isOdd(3));

        System.out.println(myInteger.parseInt('2'));
        System.out.println(myInteger.parseInt("200"));

        System.out.println(myInteger.toString());
    }
}


