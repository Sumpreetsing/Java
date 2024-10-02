interface Person2{
   void display();
}
class Student2 implements Person2{
    private String name;
    private String mobile;
    private String usn;
    private String branch;

    Student2(String name,String mobile,String usn,String branch){
        this.name=name;
        this.mobile=mobile;
        this.usn=usn;
        this.branch=branch;
    }
    public void display(){
        System.out.println("NAME :"+name);
        System.out.println("MOBILE :"+mobile);
        System.out.println("USN :"+usn);
        System.out.println("BRANCH :"+branch);
    }
}
    class Employe2 implements Person2{
        private String name;
        private String mobile;
        private String eid;
        private String department;
        Employe2(String name,String mobile,String eid,String department){
            this.name=name;
            this.mobile=mobile;
            this.eid=eid;
            this.department=department;
        }
        public void display(){
            System.out.println("NAME :"+name);
            System.out.println("MOBILE :"+mobile);
            System.out.println("EID :"+eid);
            System.out.println("DEPARTMENT :"+department);
        }
    }

public class StudentDemoIntrface{
    public static void main(String[] args) {
        Person2 p;
        p=new Student2("Sumpreetsing", "6360058919", "2SD22CS112", "CSE");
        p.display();
        
        System.out.println();
        p=new Employe2("Sumpreetsing", "6360058919", "2SD22CS", "CSE");
        p.display();
        

    }
}