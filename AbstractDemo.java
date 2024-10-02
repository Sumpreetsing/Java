abstract class Person1{
    String name;
    String mobile;
   Person1(String name,String mobile){
       this.name=name;
       this.mobile=mobile;
   }
  abstract void display();
}
class Student1 extends Person1{
   private String usn;
   private String branch;
   Student1(String name,String mobile,String usn,String branch){
       super(name,mobile);
       this.usn=usn;
       this.branch=branch;
   }
   void display(){
       System.out.println("NAME :" +name);
       System.out.println("MOBILE :"+mobile);
       System.out.println("USN :"+usn);
       System.out.println("BRANCH :"+branch);
   }
}
   class Employe1 extends Person1{
       private String eid;
       private String department;
       Employe1(String name,String mobile,String eid,String department){
           super(name,mobile);
           this.eid=eid;
           this.department=department;
       }
       void display(){
           System.out.println("NAME :" +name);
           System.out.println("MOBILE :"+mobile);
           System.out.println("EID :"+eid);
           System.out.println("DEPARTMENT :"+department);
       }
   }

public class AbstractDemo{
   public static void main(String[] args){
       Person1 p;
       Student1 s=new Student1("sumpreetsing","1234","2SD22CS112","CSE");
       Employe1 e=new Employe1("sumpreetsing","1234","2SD22C","CSE");
       p=s;
       p.display();
       System.out.println();
       p=e;
       p.display();
   }
}
