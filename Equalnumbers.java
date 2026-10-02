import java.util.*;

public class Equalnumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;

        if (a == b || b == c || a == c) {
            System.out.println(sum);
        } else {
            System.out.println(sum);
        }
    }
}