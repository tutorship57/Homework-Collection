package DisCreteMath_Pascal;

import java.util.Scanner;

public class PascalTriangle {
    PascalTriangle(int n){
        binomial(n);
    }
    public void binomial(int n){
        Factorial fac = new Factorial();
        StringBuilder sb = new StringBuilder();
        for (long r = 0; r <=n; r++) {
            long coef=fac.Cnr(n, r,n-r);
            if(r==0){
               sb.append(String.format("a^%d + ",n));
            }else if(r==n){
               sb.append(String.format("b^%d",r));
            }else{
               sb.append(String.format("%da^%db^%d + ", coef,n-r,r));
            }
        }
        System.out.printf("(a+b)^%d = %s",n,sb);
    }
}

