interface Area{
    double perimeter();
    double area();
}
class Circle implements Area{
    private int radius;
    Circle(int r){
        radius=r;
    }
   public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public  double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle implements Area{
    private int length;
    private int bredth;
    Rectangle(int l,int b){
        length=l;
        bredth=b;
    }
   public double perimeter(){
        return 2 * (length + bredth);
    }
    public  double area(){
        return length * bredth;
    }
}
class Triangle implements Area{
    private int a;
    private int b;
    private int c;
    Triangle(int x,int y,int z){
       a=x;
       b=y;
       c=z;
    }
   public double perimeter(){
        return (a+b+c);
    }
    public  double area(){
        double s=(a+b+c)/2;
        return Math.sqrt(s *(s-a)*(s-b)*(s-c));
    }
}
public class Shapes{
public static void main(String[] args){
    Circle c=new Circle(7);
    double res1p=c.perimeter();
    System.out.println("perimeter of Circle is :" + res1p);
    double res1a=c.area();
    System.out.println("area of Circle is :" + res1a);

    Rectangle r=new Rectangle(10,15);
    double res2p=r.perimeter();
    System.out.println("perimeter of Rectangle is :" + res2p);
    double res2a=r.area();
    System.out.println("area of Rectangle is :" + res2a);

    Triangle t=new Triangle(10, 20, 15);
    double res3p=t.perimeter();
    System.out.println("perimeter of Triangle is :" + res3p);
    double res3a=t.area();
    System.out.println("area of Triangle is :" + res3a);
}

}
