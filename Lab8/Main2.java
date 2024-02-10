package Lab8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args) {
        demo1();
    }
    static void demo1(){
        List<String> names = Arrays.asList("aba","abi","abo");
        Consumer<String> print = name -> System.out.println(name);
        Consumer<String> print2 = new Consumer<String>() {
            public void accept(String n){
                System.out.println(n);
            }
        };
        names.forEach(name -> System.out.println(name));
        print.accept("kuy");
        print2.accept("hee");
    }
    static void demo2(){
        Predicate<Integer> isEven = num -> num%2==0 ;  
        boolean test1 = isEven.test(4);
        boolean test2 = isEven.test(7);
        System.out.println(test1);
        System.out.println(test2);
    }
    static void demo3(){
        HashMap<String,Integer > a = new HashMap<>();
        Function<String,Integer > length = string -> string.length();
        System.out.println(length.apply("kuy"));
    }
    static void demo4(){
        Supplier<Integer> random = ()-> (int)(Math.random()*1000);
        int a = random.get();
        System.out.println(a);
    }
}
