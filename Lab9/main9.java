

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class main9 {
    public static void main(String[] args) {
       
    }
    static void ex1(){
        Employee emp1 =new Employee("yindee");
        Employee emp2 =new Employee("yindee");
        int id1 = emp1.hashCode();
        int id2 = emp2.hashCode();
        String s1 = Integer.toHexString(id1);
        String s2 = Integer.toHexString(id2);
        System.out.println(s1);
        System.out.println(s2 + " "+s1.compareTo(s2));
    }
    static void ex2() {
        // java creates a copy of the reference when
         // an obj is passed to a method.
        // changes to an obj will be effected.
        Employee emp1 = new Employee("preeda");
        System.out.println(emp1);
        ex2_1(emp1);
        System.out.println(emp1);
    }
    private static void ex2_1(Employee e) {
        e.setName("aba abi abo abe");
    }
    static void ex3() {
        // changes to an obj will be effected when
        // passing as a parameter but not a collection
        ArrayList<Employee> singers =
        new ArrayList<>();
        singers.add(new Employee("aba"));
        singers.add(new Employee("abi"));
        singers.add(new Employee("abo"));
        singers.add(new Employee("abe"));
        ex3_1(singers);
        System.out.println(singers.get(0));
        // cha cha cha
        System.out.println(singers);
        // not empty because it's list who changes
        }
        private static void ex3_1(List<Employee> list) {
        list.get(0).setName("cha cha cha");
        // changes takes effect
        list = new ArrayList<>();
        // changes takes "no" effect on collection
        }
        static void ex4() {
            // what if we do need to change the referenced
             // object to another
            ArrayList<Employee> singers = new ArrayList<>();
            singers = ex4_1();
            System.out.println(singers);
            }
            private static ArrayList<Employee> ex4_1( /*
             List<Employee> list */ ) {
            ArrayList<Employee> list = new ArrayList<>();
            // whether list is passed in or newly allocated,
             // it's a local reference.
            list.add(new Employee("aba"));
            list.add(new Employee("abi"));
            return (ArrayList<Employee>) list;
            }
            static void ex5() {
                // collection clone is shallow copy
                ArrayList<Employee> singers = new ArrayList<>();
                singers.add(new Employee("aba"));
                singers.add(new Employee("abi"));
                singers.add(new Employee("abo"));
                singers.add(new Employee("abe"));
                @SuppressWarnings("unchecked") // by clone()
                List<Employee> tmp =
                 (ArrayList<Employee>) singers.clone();
                tmp.get(0).setName("cha");
                System.out.println(singers);
                // by new ArrayList<>();
                tmp = new ArrayList<>(singers);
                tmp.get(1).setName("cha cha");
                System.out.println(singers);
                // by subList()
                tmp = singers.subList(0, singers.size() - 1);
                tmp.get(2).setName("cha cha cha");
                System.out.println(tmp);
                System.out.println(singers);
                }
            static void q6() {
                List<Employee> singers1 = new ArrayList<Employee>(
                Arrays.asList(new Employee("aba"),
                new Employee("abi")));
                // Arrays.asList() returns fixed sized ...but
                // ArrayList is not fixed, hence can call addAll()
                List<Employee> singers2 = new ArrayList<>();
                singers2.add(new Employee("abo"));
                singers2.add(new Employee("abe"));
                List<Employee> join = q6_1(singers1, singers2);
                System.out.println(singers1);
                System.out.println(singers2);
                System.out.println(join);
                singers1.addAll(singers2);
                System.out.println(singers1);
            }
            private static List<Employee> q6_1(List<Employee> l1, List<Employee> l2) {
                List<Employee> list = new ArrayList<>(l1);
                list.add(l2.get(0));
                list.add(l2.get(1));
                return list ;
            }
            static void q7() {
                List<Employee> singers = Arrays.asList(
                 new Employee("aba"), new Employee("abi"));
                System.out.println(singers);
                singers = q7_1(singers);
                System.out.println(singers);
                }
                private static List<Employee> q7_1(List<Employee> list) { 
                    List<Employee> a = list.subList(0, list.size()-1);
                    return a ;
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
