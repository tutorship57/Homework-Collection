package DisCreteMath_Pascal;

public class Factorial {
    public int factorial(int n ){
        if(n==1){
            return 1; 
        }
        return n*factorial(n-1);
    }
    public long Cnr(long n,long r,long stop){
        if(r>stop){
            return Cnr(n,stop,r);
        }
        if(n==stop){
            return 1;
        }
        return n*Cnr(n-1,r-1,stop)/r;
    }
}
    // public int Cnr(int n,int r,int stop){
    //     if(r>stop){
    //         return Cnr(n,stop,r);
    //     }
    //     if(n==stop){
    //         return 1;
    //     }
    //     return n*Cnr(n-1,r-1,stop)/r;
    // }
        // public int combination(int n, int r) {//Original 
    //     return factorial(n) / (factorial(r) * factorial(n - r));
    // }