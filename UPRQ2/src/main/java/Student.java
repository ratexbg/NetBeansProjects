
public class Student {

    private String firstName;
    private String lastName;
    private int fNumber;
    private double score;

    public Student(String firstName,String lastName,int fNumber,double score) { 
        this.firstName=firstName;
        this.lastName=lastName;
        this.fNumber=fNumber;
        this.score=score;
    }

    public void setFirtName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setfNumber(int fNumber) {
        this.fNumber = fNumber;
    }

    public int getfNumber() {
        return this.fNumber;
    }

    public void setscore(double score) {
        this.score = score;
    }

    public double getscore() {
        return this.score;
    }
 
}
