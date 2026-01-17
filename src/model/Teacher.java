package model;

//Class representing a teacher keeping track of teacher id, name, and salary
public class Teacher {
    
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned = 0;
    }

    //We don't want to alter/set again teacher's name or id once set...so no setters here
    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    //Need to update salary
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    //When teacher earns their salary, it should be deducted from the school total earnings
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Teacher's name "+name+
        " ... Salary earned LKR "+salaryEarned;
    }
}
