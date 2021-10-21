import org.joda.time.DateTime;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Part 1: Creating mock data
        Student student1 = new Student("Jimmy", 21, DateTime.parse("1995-10-23"), 12345, new ArrayList<CourseProgramme>(), new ArrayList<Module>());
        Student student2 = new Student("Tony", 21, DateTime.parse("2004-02-29"), 67890, new ArrayList<CourseProgramme>(), new ArrayList<Module>());
        Student student3 = new Student("Tadhg", 21, DateTime.parse("1999-08-18"), 12345, new ArrayList<CourseProgramme>(), new ArrayList<Module>());

        CourseProgramme course1 = new CourseProgramme("Computer Science", new ArrayList<Module>(), new ArrayList<Student>(), DateTime.parse("1900-01-23"), DateTime.parse("2000-12-25"));
        CourseProgramme course2 = new CourseProgramme("Data Science", new ArrayList<Module>(), new ArrayList<Student>(), DateTime.parse("1800-01-23"), DateTime.parse("1900-12-25"));
        CourseProgramme course3 = new CourseProgramme("Information Technology", new ArrayList<Module>(), new ArrayList<Student>(), DateTime.parse("1700-01-23"), DateTime.parse("1800-12-25"));

        Module module1 = new Module("Software Engineering", 123, new ArrayList<Student>(), new ArrayList<CourseProgramme>());
        Module module2 = new Module("Information Retrieval", 456, new ArrayList<Student>(), new ArrayList<CourseProgramme>());
        Module module3 = new Module("Machine Learning", 789, new ArrayList<Student>(), new ArrayList<CourseProgramme>());

        //Part 2: Adding each class to their respective counterparts
        student1.addCourse(course1);
        student1.addModule(module1);
        student1.addModule(module3);

        student2.addCourse(course3);
        student2.addModule(module2);
        student2.addModule(module1);

        student3.addCourse(course2);
        student3.addModule(module3);
        student3.addModule(module2);

        course1.addModule(module1);
        course2.addModule(module3);
        course3.addModule(module3);

        module1.addCourse(course3);
        module2.addCourse(course3);
        module3.addCourse(course1);

        //Part 3: Print data
        System.out.print(student1);
        System.out.print(student2);
        System.out.print(student3);

        System.out.print(course1);
        System.out.print(course2);
        System.out.print(course3);

        System.out.print(module1);
        System.out.print(module2);
        System.out.print(module3);
    }
}
