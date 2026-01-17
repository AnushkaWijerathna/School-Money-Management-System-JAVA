package model;

//Class representing a student keeping track of student fees,name, grade & fees paid
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //constractor used to create and initialize an object of student.
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    //not going to alter student's name, ID so no setters here
    public int getId() {
            return id;
        }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //Keep adding the fees to feesPaid field and school will receive the funds
    public void payFees(int fees) {
        feesPaid =+ fees;
        School.updateTotalMoneyEarned(fees);
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name "+name+
        " Total fees paid so far "+feesPaid;
    }
}