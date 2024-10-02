import java.util.Scanner;
class Bus{
    String name;
    String password;
    int key;
    int total_tickets=50;
    void read(String name,String password){
        this.name=name;
        this.password=password;
    }
    void menu(){
            System.out.println("enter\n1:To Login\n2:to exit");
            Scanner s=new Scanner(System.in);
            key=s.nextInt();
            switch(key){
                case 1:System.out.println("enter your name");
                        String str1=s.next();
                        System.out.println("enter your password");
                        String str2=s.next();
                        if((name.equals(str1))&&(password.equals(str2))){
                            System.out.println("Login successfull");
                        System.out.println("enter\n1:to book the ticket\n2:to cancel ticket\n3:to logout");
                        int key2=s.nextInt();
                        switch (key2){
                            case 1:System.out.println("enter no of tickets");
                                   int n=s.nextInt();
                                   if(n<=total_tickets){
                                    System.out.println("Ticket booking successfull");
                                    total_tickets=total_tickets-n;
                                   }
                                   else{
                                    System.out.println("required tickets are not available");
                                   }
                                   break;
                            case 2:System.out.println("your tickets are cancelled");
                                   break;
                            case 3:return;
                            default:System.out.println("invalid input");
                                    break;
                        }
                        }
                        else{
                            System.out.println("login unsuccesfull");
                        }
                case 2:return; 
                default:System.out.println("invalid input"); 
            }
        }
        }
       

public class BusManagement {

    public static void main(String[] args) {
        Bus b=new Bus();
        b.read("Sumpreetsing","1234");
        b.menu();
    }
}