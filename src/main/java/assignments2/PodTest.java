package assignments2;

public class PodTest {
int NoOfEmployees;

Employee emp1=new Employee("Shiv",23,10000.12f,10001,true);
Employee emp2=new Employee("Avin",25,50000.100f,10002,true);
Employee emp3=new Employee("John",26,70000f,10003,true);
Employee emp4=new Employee("Vaas",27,60000f,10004,true);
Employee emp5=new Employee("Anak",28,45000f,10005,true);
Employee[]employees=new Employee[]{emp1,emp2,emp3,emp4,emp5};



public  void printEmployeeDetailsAll(){
for (Employee a:employees){
    a.getDetails();
}
}


}
