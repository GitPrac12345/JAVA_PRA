package conditional_Statements;

public class SwitchDemo {

    public static void main(String[] args) {
        SwitchDemo s_demo = new SwitchDemo();
        s_demo.switchdemo1(60);
    }

    public void switchdemo1(int age) {
        switch (age) {
            case 18:
                System.out.println("adult");
                break;
            case 60:
                System.out.println("SC");
                break;
            default:
                System.out.println("You are young");
                break;
        }
    }
}