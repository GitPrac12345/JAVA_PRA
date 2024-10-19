package methods;

public class Calculator {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        int s1=cal.sum(100,20);
        System.out.println(s1);
        int s2=cal.subtract(100,20);
        System.out.println(s2);
       float s3=cal.division(100,20);
        System.out.println(s3);
        int s4=cal.multiple(100,20);
        System.out.println(s4);
    }
   public int sum(int a, int b){
       int sum=a+b;
       return sum;
   }
    public int subtract(int a, int b){
        int minus=a-b;
        return minus;
    }
    public float division(int a, int b){
        float divide=a/b;
        return divide;
    }
    public int multiple(int a, int b){
        int multi=a*b;
        return multi;
    }



}
