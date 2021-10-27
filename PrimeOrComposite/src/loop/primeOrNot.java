package loop;

public class primeOrNot {
    public static void isPrime(int number) {
        int count = 0;
        if (number > 1) {
            for (int i = 1; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("It is prime");
            }
            if (count > 1) {
                System.out.println("It is Composite");
            }
        } else if(number==1) {
            System.out.println("Number 1 is neither Prime Nor Composite Number");
        }else{
            System.out.println("It is Invalid Number");
        }
    }
}
