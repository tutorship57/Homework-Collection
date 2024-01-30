import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lab8 {
    static List<Singer> SingerList = new ArrayList<>();
    static{
    SingerList.add(new Singer("aba",Style.POP));
    SingerList.add(new Singer("abi",Style.ROCK));
    SingerList.add(new Singer("abo",Style.POP));
    SingerList.add(new Singer("abe",Style.ROCK));
    }
    public static void main(String[] args) {
        q4();
    }
    /**
     * 
     */
    public static void q1(){
        List<Integer > nums = Arrays.asList(100,105);
        System.out.println("----q1");
        HalfValueInterface q0 = new HalfValueInterface(){
            public void printhalf(int n){
                System.out.println(n/2);
            }
        };
        for(int n:nums){
            q0.printhalf(n);
        }
        System.out.println("----q2");
        HalfValueInterface halVal = number -> System.out.println(number/2);
        for(int n : nums ){
            halVal.printhalf(n);
        }
        System.out.println("----q3");
        Consumer<Integer> consumer = number -> System.out.println(number/2); 
        nums.forEach(consumer);
        System.out.println("----q4");
        nums.forEach(number->System.out.println(number/2));
        System.out.println("----q5");
        NumberProcessor np = new NumberProcessor();
        nums.forEach(np::printHalf);
    }
    public interface HalfValueInterface {
        public abstract void printhalf(int num); 
    }
    
    public static void q2(){
        SingerList.stream().map(Singer->Singer.getName()).forEach(System.out::println);
        SingerList.stream().map(Singer::getName).forEach(System.out::println);
    }
    public static void q3(){
        Comparator<Singer> byStyle1 = new Comparator<Singer>() {
            @Override
            public int compare(Singer o1, Singer o2) {
                return o1.getStyle().compareTo(o2.getStyle());
            }
            
        }; 
        Collections.sort(SingerList,byStyle1);
        SingerList.forEach(System.out::println);
        Comparator<Singer> byStyle2 = (o1,o2) -> o1.getStyle().compareTo(o2.getStyle());
        Collections.sort(SingerList,byStyle2);
        SingerList.forEach(System.out::println);
    }
    public static void q4(){
        Comparator<Singer> byName = Comparator.comparing(Singer::getName);
        Collections.sort(SingerList,byName);
        SingerList.forEach(System.out::println);
        System.out.println("-------------------");
        SingerList.sort(Singer::compareByName);
        SingerList.forEach(System.out::println);

    //    SingerList.sort(Comparator.comparing(Singer::getStyle));
    //    SingerList.forEach(System.out::println);
    }
}
class NumberProcessor {
    void printHalf(int n){
        System.out.println(n/2);
    }
}

