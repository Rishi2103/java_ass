import java.util.Scanner;

public class P2_5 {

    void student(String t){
        System.out.println(t);
    }
    void student(String Sname , char Sgrade){
        System.out.println("Student Name is : " + Sname);
        System.out.println("Grade obtained is : " + Sgrade);
    }
    void student(int id, String Sname, char Sgrade){
        System.out.println("Student ID : " + id);
        System.out.println("Student name is : " + Sname);
        System.out.println("Grade obtained is : " + Sgrade);
    }
    public static void main(String[] args) {
        P2_5 p = new P2_5();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the details of Student : ");
        String name = in.next();
        String a = in.next();
        int ID = in.nextInt();
        char gd = in.next().charAt(0);
        System.out.println("String is : ");
        p.student(a);
        System.out.println("Enter Student's name and Grade :  ");
        p.student(name, gd);
        System.out.println("Enter Student's id , name and Grade : " );
        p.student(ID, name, gd);
    }
}
