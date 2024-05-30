public class Teacher {                                     //Create a class named Teacher for the object "teachers".
    public String getFirstName() {                        //When the fields are set as private, these values cannot be accessed. Use getters and setters to make them accessible.
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String firstName;                   //Initialize the properties of the object "teacher": first name, last name and subject.
    private String  lastName;                   //Set the fields as private to protect the variables so the other parts of the class or other parts of the program are ble to access and change them.
    private String  subject;

    Teacher(String firstName,String lastName,String subject){      //Declare a constructor of the Teacher class with parameters to construct teachers. These values come from where the objects are created.
        this.firstName=firstName;                           //Use the keyword "this" to refer to the current instance itself.
        this.lastName=lastName;
        this.subject=subject;

    }
    public String toString(){                           //Use toString method to override the original memory.
        return "Name: "+this.firstName+" "+this.lastName+"\t\tSubject: "+this.subject;         //Return the values that I want: teacher's name and subject.
    }
}
