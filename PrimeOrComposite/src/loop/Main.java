
package loop;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Put Any Number to check is it a Prime number or Composite Number");
        System.out.println("It should be great then Zero(0)");
        int a= sc.nextInt();
        primeOrNot.isPrime(a);
    }
}
