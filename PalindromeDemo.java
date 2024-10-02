import java.util.Scanner;
class IsPalindrome{
    private int n;
    private int x;
    private int top=-1;
    int a[]=new int[20];
    IsPalindrome(int n){
        this.n=n;
        x=n;
    }
    void pushToStack(){
        int rem;
        while ((n!=0)) {
            rem=n%10;
            a[++top]=rem;
            n=n/10;
        }
    }
    int checkpalindrome(){
        int rem;
        while(x!=0){
            rem=x%10;
            if(rem!=a[top--]){
                return 0;
            }
            x=x/10;
        }
        return 1;
    }
} 
public class PalindromeDemo{
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number for which you want to check palindrome");
        n=s.nextInt();
        IsPalindrome p=new IsPalindrome(n);
        p.pushToStack();
        int res;
        res=p.checkpalindrome();
        if(res==1){
            System.out.println("given number is palindrome");
        }
        else{
            System.out.println("given number is not palindrome");
        }
    }
}