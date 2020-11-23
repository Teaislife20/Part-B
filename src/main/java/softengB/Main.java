package softengB;

import org.joda.time.DateTime;
import SoftwareEng.*;
import SoftwareEng.Module;


public class Main {
	
	public static void main(String[] args) {
        
        DateTime Date1 = new DateTime(1996,06,23,00,00);
        DateTime Date2 = new DateTime(1994,7,21,00,00);
        DateTime Date3 = new DateTime(1999,02,11,00,00);
        DateTime Date4 = new DateTime(1991,11,30,00,00);
        DateTime Date5 = new DateTime(1992,3,17,00,00);

       
        Student student1 = new Student("John", 15219872, Date1);
        Student student2 = new Student("Conor", 13995439, Date2);
        Student student3 = new Student("Martin", 17893642, Date3);
        Student student4 = new Student("Thomas", 10874321, Date4);
        Student student5 = new Student("Paddy", 11534259, Date5);

      
        Module module1 = new Module("Information Retrieval", "CT4100");
        Module module2 = new Module("Machine Learning", "CT4101");
        Module module3 = new Module("Advanced Professional Skills", "CT436");
        Module module4 = new Module("Vertebrate Zoology", "ZO209");
        Module module5 = new Module("Linear Algebra", "MA283");

       
        DateTime startDate = new DateTime(2017, 8, 28, 0, 0);
        DateTime endDate = new DateTime(2021, 6, 30, 0, 0);

      
        Course course1 = new Course("CS & IT", startDate, endDate);
        Course course2 = new Course("General Science", startDate, endDate);

       
        module1.addStudent(student1);
        module1.addStudent(student2);
        module2.addStudent(student1);
        module2.addStudent(student2);
        module3.addStudent(student2);
        module3.addStudent(student3);
        module4.addStudent(student4);
        module4.addStudent(student5);
        module5.addStudent(student4);
        module5.addStudent(student5);
        
     
        course1.addModule(module1);
        course1.addModule(module2);
        course1.addModule(module3);
        course2.addModule(module4);
        course2.addModule(module5);
        
        System.out.println("Printing Course Details: \n");
        System.out.println("Course Name: " + course1.getCourseName() + "\nAvailable Modules:");
        course1.printModuleList();
        System.out.println("------------------");
        course1.printStudentDetails();
        System.out.println("Course Name: " + course2.getCourseName() + "\nAvailable Modules:");
        course2.printModuleList();
        System.out.println("------------------");
        course2.printStudentDetails();
    }
}


