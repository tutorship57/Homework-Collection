package DisCreteMath_Pascal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial fac = new Factorial();
        PascalTriangle equation = new PascalTriangle(n);
    }
}
