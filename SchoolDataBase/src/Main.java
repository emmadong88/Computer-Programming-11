import java.util.ArrayList;

public class Main {
    public static void main(String[]args){

        School mySchool=new School("ABC Academy","1111 Albert Street, Franklin, BC V0Z 2B8","Office Hours: 8:00 am - 4:00 pm \n\t\t\t  Monday - Friday");
        //Create a mySchool object.
        System.out.println("\nSchool Name:  "+mySchool.getSchoolName());         //Call the getSchoolName method in School class and print it.
        System.out.println("Address:\t  "+mySchool.getLocation());              //Call the getLocation method in School class and print it.
        System.out.println(mySchool.getOfficeHours());                          //Call the getOfficeHours method in School class and print it.

        School.teacherList();           //Call the teachList method in the School class to print out the teacher lists.
        School.studentList();           //Call the studentList method in the School class to print out the student lists.
    }
}
