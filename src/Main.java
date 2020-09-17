import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        double average=0;

        //Student student=new Student();
        Student student1=new Student("Omnia","saeed",25);
        Student student2=new Student("Rodyna","ismail",20);
        Student student3=new Student("Bothyna","ismail",24);
        Student student4=new Student("Ismail","saeed",26);
        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for(Student s:students){
            System.out.println("the Student "+s.getFirstName()+" "+s.getLastName()+" "+"has enrolled and is "+s.getAge()+" "+"years old");
            sum+=s.getAge();
            average=sum/4;
        }
        System.out.println("Average age of your students: "+average);

    }
}
