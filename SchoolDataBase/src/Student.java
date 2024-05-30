public class Student {                                              //Create a class named Student for the object students.
    public String getFirstName() {      //When the fields are set as private, these values cannot be accessed. Use getters and setters to make them accessible.
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    private String  firstName;      //Initialize the properties of the object "student": first name, last name, grade and student number.
    private String  lastName;
    private int grade;
    static int registrationNum=1;           //use int method to create a variable registrationNum which can be shared by all objects of the class "Student".

    private int studentNum;

    Student(String firstName,String lastName,int grade){    //Declare a constructor of the Student class with parameters to construct students. These values come from where the objects are created.
        this.firstName=firstName;                   //Use the keyword "this" to invoke the current class constructor. "this" is a reference to the current object.
        this.lastName=lastName;
        this.grade=grade;
        this.studentNum=registrationNum;        //set studentNum equal to registrationNum to generate unique student numbers.
        registrationNum++;
    }

    public String toString(){                   //Use toString method to override the original memory.
        return "Name: "+this.firstName+" "+this.lastName+"\t\tGrade: "+this.grade+"\t\tStudent Number: "+this.studentNum;     //Return the values that I want: Student's name, grade and student number.
    }
    }


