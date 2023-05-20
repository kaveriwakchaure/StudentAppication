package Application2;

import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static BLClass bl = new BLClass();


    public static void main(String[] args) {
        boolean status = true;

        do {
            System.out.println("-------------");
            System.out.println("1.Add Student");
            System.out.println("2.Remove Student");
            System.out.println("3.Display Student");
            System.out.println("4.Update Student's subject");
            System.out.println("5.Search  Student by id");
            System.out.println("6.Display Student by Subject");
            System.out.println("7 exit");
            int ch = sc.nextInt();
            switch (ch) {

                case 1:
                    //addStudent
                    addStudent();

                    break;
                case 2:
                    //removeStudent
                    removeStudent();

                    break;
                case 3:
                    //DisplayStudent
                    DisplayStudent();

                    break;
                case 4:

                    //Update Student
                    UpdateStudent();
                    break;
                case 5:

//Search Student
                    SearchStudent();
                case 7:
                    status = false;
                    break;
                default:
                    System.out.println("invalid choice");


            }
        } while (status);


    }

    private static void SearchStudent() {
        System.out.println("Enter id");
        int id= sc.nextInt();
        bl.Search(id);
        System.out.println("Search Student Successfully");
    }

    private static void UpdateStudent() {
        System.out.println("Enter Student roll no");
        int rollno=sc.nextInt();
        System.out.println("Enter Student name");
        String name=sc.next();
        System.out.println("Enter mark");
        double marks=sc.nextDouble();
        System.out.println("Enter sub");
        String  Sub= sc.next();
        Student s1=new Student(rollno,name,marks);
        bl.update(rollno,name,marks);
        System.out.println("Update");
        Subject s=UpdateSub();
    }

    private static Subject UpdateSub() {
        System.out.println("Enter sid");
        int sid=sc.nextInt();
        System.out.println("Enter sname");
        String sname=sc.next();
        return UpdateSub();
    }

    private static void DisplayStudent() {
        System.out.println("Enter id");
        int id=sc.nextInt();
        System.out.println("Enter subject");
        String subject=sc.next();
        System.out.println("enter fees");
        Double fees=sc.nextDouble();
        bl.displayStudent(id,subject,fees);
        System.out.println("Display student by subject");
    }


    private static void removeStudent() {
        System.out.println("Enter  id");
        int id= sc.nextInt();
        bl.removeStudent(id);
        System.out.println("Remove student Successfully");
    }

    private static void addStudent() {
        System.out.println("Enter  Id");
        int id = sc.nextInt();
        System.out.println("Enter   Name");
        String name = sc.next();
        System.out.println("Enter marks");
        double marks = sc.nextDouble();
        Subject sub = addSubject();

        Student s1 = new Student(id, name, marks);
        bl.addData(s1);

    }

    private static Subject addSubject() {
        System.out.println("Enter Subject Id");
        int sid = sc.nextInt();
        System.out.println("Enter  Subject Name");
        String sname = sc.next();
        System.out.println("Enter Fees");
        double sfees = sc.nextDouble();
        return new Subject(sid, sname, sfees);

    }



}


