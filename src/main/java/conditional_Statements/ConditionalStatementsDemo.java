package conditional_Statements;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        ConditionalStatementsDemo d1=new ConditionalStatementsDemo();
        String res=d1.getAgeCategory(60);
        System.out.println(res);
    }
    public String getAgeCategory(int age){
        String category = null;
        if((age>0) && (age<18)){
            category="child";
        }else if((age>=18) && (age<60)){
            category="adult";
        }else if (age>=60){
            category="senior citizen";
        }else {
            category="Enter valid Age";
        }
        return category;
    }



}
