package staticDemo;

public class StaticMain {
    public static void main(String[] args) {
       // StaticDemo2.m1();
        StaticDemo2 m= new StaticDemo2();
        StaticDemo2 n= new StaticDemo2();
        m.name="lion";
        n.name="tiger";
        System.out.println(m.name);
        System.out.println(n.name);



    }
}
