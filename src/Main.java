import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Andrea", 22);
        Student student2 = new Student("Francesco", 18);
        Student student3 = new Student ("Giuseppe", 20);
        Student student4 = new Student ("Francesca", 23);
        Student student5 = new Student ("Paola", 25);
        Student student6 = new Student ("Alberto", 26);

        List<Student> list1 = Arrays.asList(student1,student2);
        System.out.println("List is: " + list1);

        List<Student> list2 = new ArrayList<>();
        list2.add(student1);
        list2.add(student2);
        list2.add(student3);
        list2.add(student4);
        list2.add(student5);
        list2.add(student6);
        System.out.println("list updated is: " + list2);


    }
}