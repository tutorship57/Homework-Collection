import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab9_660460 {
    public static void main(String[] args) {
        
    }
    static void q8(){
        List<Employee> list1 = new ArrayList<>(Arrays.asList(new Employee("yindee"),new Employee("pramote")));
        List<Employee> list2 = new ArrayList<>(Arrays.asList(new Employee("pramote"),new Employee("preeda")));
        HashSet<Employee> empSet = new HashSet<>();
        List<Employee> a = new ArrayList<>(list1);
        a.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);
        for (Employee employee : a) {
            empSet.add(employee);
        }
        List<Employee> q8_ans = new ArrayList<>(empSet);
        System.out.println(q8_ans);
        }
    static void q9() {
        Set<Employee> empSet1 = new HashSet<>(
            Arrays.asList(new Employee("yindee"),new Employee("pramote"),new Employee("preeda")));
        Set<Employee> empSet2 = new HashSet<>(
            Arrays.asList(new Employee("yindee"),new Employee("pramote")));
        /* your task */
        empSet1.retainAll(empSet2);
        System.out.println(empSet1);
    }
    static void q9_1() {
        Set<Employee> empSet1 = new HashSet<>(
            Arrays.asList(new Employee("yindee"),new Employee("pramote"),new Employee("preeda")));
        Set<Employee> empSet2 = new HashSet<>(
            Arrays.asList(new Employee("yindee"),new Employee("pramote")));
        /* your task */
        empSet1.removeAll(empSet2);
        System.out.println(empSet1);
        }
    static void q10() {
        q9_1();
    }
    static void q11() {
        Set<Employee> empSet = new HashSet<>(Arrays.asList(new Employee("yindee"),new Employee("pramote"),new Employee("preeda"),new Employee("preeda")));
        Employee[] q11_ans = new Employee[empSet.size()];
        empSet.toArray(q11_ans); 
        for (Employee e : q11_ans)
        System.out.print(e + " ");
        System.out.println();
    }

}
