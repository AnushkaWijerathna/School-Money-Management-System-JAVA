package app;

import java.util.ArrayList;
import java.util.List;

import model.School;
import model.Student;
import model.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        
        Teacher saman = new Teacher(1, "Saman", 32000);
        Teacher ramya = new Teacher(2, "Ramya", 20000);
        Teacher edwin = new Teacher(3, "Edwin", 16000);
        
        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(saman);
        teacherList.add(ramya);
        teacherList.add(edwin);

        Student a = new Student(1, "Anushka", 3);
        Student b = new Student(2, "Saduni", 1);
        Student c = new Student(3, "Kasun", 2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(a);
        studentList.add(b); 
        studentList.add(c);

        School uov = new School(teacherList, studentList);

        Teacher wijith = new Teacher(5, "Wijitha", 12000);
        uov.addTeacher(wijith);

        //Students paying school fees
        a.payFees(18000);
        b.payFees(16000);
        c.payFees(23000);

         System.out.println("------------------UoV EARNINGS SO FAR------------------");
        System.out.println(" ");
        System.out.println("UoV has earned LKR :" + uov.getTotalMoneyEarned());
        System.out.println(" ");

        System.out.println("------------------PAYING TEACHER SALARY------------------");
        System.out.println(" ");
        saman.receiveSalary(saman.getSalary());
        System.out.println("UoV has paid salaray to Lecturer "+saman.getName()+" and now has LKR "+uov.getBalance());
        System.out.println(" ");
        ramya.receiveSalary(ramya.getSalary());
        System.out.println("UoV has paid salaray to Lecturer "+ramya.getName()+" and now has LKR "+uov.getBalance());
        System.out.println(" ");

        System.out.println("------------------STUDENTS DETAILS------------------");
        System.out.println(" ");

        System.out.println(a);
        System.out.println(" ");

        System.out.println(b);
        System.out.println(" ");

         System.out.println(c);
        System.out.println(" ");

        System.out.println("------------------TEACHERS SALARY DETAILS------------------");
        System.out.println(" ");
        System.out.println(saman);
        System.out.println(" ");
        System.out.println(ramya);
        System.out.println(" ");
        System.out.println(edwin);
        System.out.println(" ");
    }
}
