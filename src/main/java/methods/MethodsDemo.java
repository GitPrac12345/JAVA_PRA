package methods;

public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo mdemo=new MethodsDemo();
        mdemo.squareOfNumber(5,5);
        int sd=mdemo.squareOfNumber2(10,10);
        System.out.println(sd);
    }
//Method with Non returnType
    public void squareOfNumber(int a,int b){
        int square=(a*b)+(b*b)+(2*a*b);
        System.out.println(square);
    }
    //Method with returnType
    public int squareOfNumber2(int a,int b){
        int square=(a*b)+(b*b)+(2*a*b);
          return square;
    }

}
