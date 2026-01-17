package model;

import java.util.List;

public class School {
    
    //School can have many teachers and students so we will use arrayList to store them
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    //Getters and setters
    public List<Teacher> getTeachers(){
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    //Making this void function static, you can call it without creating an object of the class
    public static void updateTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned += moneyEarned;
    }

   
    public static void updateTotalMoneySpent(int moneySpent){
        totalMoneyEarned -= moneySpent;
        totalMoneySpent += moneySpent;
    }
    
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }
 
    public int getBalance() {
    return totalMoneyEarned;
}


}