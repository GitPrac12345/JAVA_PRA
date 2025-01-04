package assignments2;

public class Employee {
    String name;
    int age;
    float salaryMonthly;
    int empID;
    boolean isActive;
   public Employee (String name,int age,float salaryMonthly,int empID,boolean isActive){
       this.name=name;
       this.age=age;
       this.salaryMonthly=salaryMonthly;
       this.empID=empID;
       this.isActive=isActive;
   }



   public void getDetails(){
       System.out.println(name+" "+age+" "+salaryMonthly+" "+empID+" "+isActive);
   }

   public void getTaxAmountToBePaid(){
if(salaryMonthly>100000){
    System.out.println("Tax is 20%");
       }else{
    System.out.println("Tax is 0%");

}
   }
}
