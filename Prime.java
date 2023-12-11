import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
        int N = 2;
        while (N<100) {
            if (checkPrime(N)) {
                System.out.print(N+" ");
            }
            N++;
        }
    }
    public static boolean checkPrime(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }

        }
        return check;
    }



}
