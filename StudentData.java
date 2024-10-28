import java.util.*;
public class StudentData {
    static ArrayList<stuInfo> listStudent = new ArrayList<>();
    public static void main(String[] args) {
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to The Student Managemet ");
        System.out.println();
        System.out.println("1. Add new Student ");
        System.out.println("2. View Student ");
        System.out.println("3. Remove Student ");
        System.out.println("4. Logout !");
        System.out.println();
        System.out.println("Enter the option ");
        int op = sc.nextInt();

        switch (op) {
            case 1 : addStudent(); break;
            case 2 : viewStudent(); break;
            case 3 : removeStudent(); break;
            case 4 : System.exit(0); break;
            default : System.out.println("You enter wrong option ");
        
            
        }

        }
              
        
    }
    public static void addStudent(){

        Scanner sc = new Scanner(System.in);
       
        
       
            System.out.println("          **   Enter the Student Details    ***        ");
        System.out.print("Enter Student Name :");
        String name = sc.nextLine();
        System.out.print("Enter Student Id :");
        int id = sc.nextInt();
        System.out.print("Enter Student Contact :");
        long cont = sc.nextLong();
        System.out.print("Enter Student Address :");
        sc.nextLine();
        String add = sc.nextLine();
        System.out.println();

        System.out.println("Enter higher Education Details ");
        System.out.print("Enter Education :");
        String higherEdu = sc.next();
        System.out.print("Enter year of passout :");
        int yop = sc.nextInt();
        System.out.print("Enter Stream :");
        String stream = sc.next();
        System.out.print("Enter CGAP :");
        double cgap = sc.nextDouble();

        Education edu = new Education(higherEdu, yop, stream, cgap);
        System.out.println();
        System.out.println("Enter Mock Detals ");
        System.out.print("Enter the subject :");
        String subject = sc.next();
        System.out.print("Communication :");
        String comm = sc.next();
        System.out.print("Technical :");
        String technical = sc.next();
        
        Mock mok = new Mock(subject, comm, technical);
        stuInfo stud = new stuInfo(name, id, cont, add, edu, mok);
        listStudent.add(stud);

        System.out.println("Student infromation added successfully !");       

    }
    
     public static void removeStudent(){
        System.out.println("We will do it later !");
     }

     public static void viewStudent(){
        System.out.println();
        System.out.println("All the Student Infromation ");
        System.out.println();
        for(stuInfo stud : listStudent){
            stud.displayStd();
            System.out.println();
        }

     }
}

class stuInfo{
    String name;
    int id ;
    long cont;
    String add ;
    Education edu;
    Mock mok;
    

    stuInfo(String name, int id, long cont, String add, Education edu, Mock mok){
        this.name = name;
        this.id = id;
        this.cont = cont;
        this.add = add;
        this.edu = edu;
        this.mok = mok;
    }
    public void displayStd(){
        System.out.println("Student Infromation ----->>>>");
        System.out.println();
        System.out.println("name ;"+ name );
        System.out.println("Id :"+ id);
        System.out.println("Contact :"+ cont);
        System.out.println("Address :"+ add);
        edu.displayEducation();
        mok.displayMock();
    
    }

}

class Education{
    String higherEdu ;
    int yop;
    String stream;
    double cgpa;

    Education(String higherEdu, int yop, String stream, double cgpa){
        this.higherEdu = higherEdu;
        this.yop = yop;
        this.stream = stream;
        this.cgpa = cgpa;
    }

    public void displayEducation(){
        System.out.println("Higher Education :"+ higherEdu);
        System.out.println("year of passout :"+ yop);
        System.out.println("Stream  :"+ stream);
        System.out.println("CGPA :"+ cgpa);
    }
}

class Mock{
    String subject ;
    String comm;
    String technical;

    Mock(String subject, String comm, String technical){
        this.subject = subject;
        this.comm =comm;
        this.technical = technical;
    }

    public void displayMock(){
        System.out.println("Subject :"+ subject);
        System.out.println("Communication skill :"+ comm);
        System.out.println("Technical Skill :"+ technical);
    }

}
