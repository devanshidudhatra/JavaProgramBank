import java.util.*;

class Prime{
    static int i=2;
    public static boolean isPrime(int n){
        if (n == 0 || n == 1){
            return false;
        }
        if (n == i)
            return true;

        if (n % i == 0){
            return false;
        }
        i++;
        return isPrime(n);
    }

    public static void main(String[] args){
        System.out.println("Enter any number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (isPrime(n)){
            System.out.println("It is a prime number...");
        }
        else{
            System.out.println("It is not a prime number...");
        }
    }
}

