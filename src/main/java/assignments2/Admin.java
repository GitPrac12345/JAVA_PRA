package assignments2;

public class Admin extends PodTest{

    String role;

    public void getTotalReqdBudgeted(){
        float sum = 0.0f;
        for (Employee a:employees){
            sum=sum+ a.salaryMonthly;
        }
        System.out.println("Sum is:"+sum);

    }
   public void getTotalTaxCalculated(){

    }

    public void printTaxAmountPerEmployees(){

    }

}
