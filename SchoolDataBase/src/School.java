import java.util.ArrayList;

public class School {               //Create a class for "School". This class represents a school with teachers and students.

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    private String schoolName;                  //3 additional fields for school.
    private String  location;
    private String  officeHours;

   School(String schoolName,String location,String officeHours){         //Declare a constructor of the School class with parameters to construct school.

        this.schoolName=schoolName;                     //Use the keyword "this" to refer to the current instance itself.
        this.location=location;
        this.officeHours=officeHours;
    }
/*
    public String toString(){                                               //Use toString method to override the original memory.
        return this.schoolName+"\n"+this.location+"\n"+this.officeHours;    //Return the values: school name, address and office hours.
    }
*/
    static void teacherList() {
        ArrayList<Teacher> teachers = new ArrayList<>();                    //Create an arraylist for the teachers.

        teachers.add(new Teacher("Thomas", "Lee", "Biology"));     //Using add() method add the teachers to the teachers arraylist.
        teachers.add(new Teacher("Julie", "Brown", "Math"));    //The constructor in Teacher class puts all the variables so that I only need to enter the values.
        teachers.add(new Teacher("Bruce", "Clarke", "Science"));

        System.out.println("\nTeachers List:");
        for (Teacher t : teachers) {                    //Print the teacher list before removing one teacher from the list.
            System.out.println(t);
        }
        teachers.remove(1);                         //Use array.remove method to remove the teacher at the index position "1".

        System.out.println("\nAfter removing a teacher, the new Teachers List is:");       //Print the new teacher list after removing one teacher from the list.
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }

    static void studentList() {
        ArrayList<Student> students = new ArrayList<>();                                    //Create an arraylist for the students.

        students.add(new Student("Alex", "Norman", 10));             //Using add() method to add the new objects, students, to the students arraylist.
        students.add(new Student("John", "Williams", 9));
        students.add(new Student("Mark", "Davies", 11));
        students.add(new Student("Lilian", "Nowell", 11));
        students.add(new Student("Miko", "Damon", 9));
        students.add(new Student("Addie", "Barlow", 9));
        students.add(new Student("Olivia", "Brown", 12));
        students.add(new Student("Christy", "Hill", 10));
        students.add(new Student("Sean", "Dewan", 12));
        students.add(new Student("Bailey", "Chow", 10));

        System.out.println("\nStudents List:");          //Print the student list before removing the students from the list.
        for (Student s : students) {
            System.out.println(s);
        }

        students.remove(1);                      //use array.remove method to remove two students from the original list.
        students.remove(5);

        System.out.println("\nAfter removing two students, the new Students List is:");      //Print the student list after removing two students from the list.
        for (Student s : students) {
            System.out.println(s);
        }
    }

}






