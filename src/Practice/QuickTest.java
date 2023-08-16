package Practice;

import imp.Employee;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;

public class QuickTest {

    private static List<Employee> getEmployees(){
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("tom",25));
        empList.add(new Employee("Hi",29));
        empList.add(new Employee("Hope",36));
        empList.add(new Employee("mike",32));
        empList.add(new Employee("Joy",29));
        empList.add(new Employee("Happy",26));
        empList.add(new Employee("Meave",40));
        empList.add(new Employee("Yes",25));

        return empList;
    }


    public static void main(String[] args) {
        String str= "abcde ghij klmn xyz";
        char[] charArray =  str.toCharArray();

        char[] reverseChar = new char[charArray.length];

        for(int i= reverseChar.length-1,j=0; i>0; j++)
        {
            reverseChar[j]=charArray[i];
        }
        System.out.println(new String(reverseChar));
    }

}
