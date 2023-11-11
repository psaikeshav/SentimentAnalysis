// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        long[] primes = new long[20];
        primes[0]=2;
        long[] primes2 =primes;
        System.out.print(primes2[0]+" ");
        primes2[0]=5;
        System.out.print(primes[0]);
    }
}