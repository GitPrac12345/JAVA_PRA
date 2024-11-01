package conditional_Statements;

public class Assignments {
    public static void main(String[] args) {
        Assignments a=new Assignments();
        String val=a.getAgeCategory("FeMale",27);
        System.out.println(val);
    }
   public String getAgeCategory(String gender, int age) {

           String ageCategory = null;
       if (age <= 0) {
           return "Enter valid age";
       }
           if (gender.equalsIgnoreCase("male")) {
               if ((age > 0) && (age < 18)) {
                   ageCategory = "boy";
               } else if ((age >= 18) && (age < 60)) {
                   ageCategory = "men";
               } else  {
                   ageCategory = "sc";

               }
           } else if (gender.equalsIgnoreCase("Female")) {
               if ((age > 0) && (age < 18)) {
                   ageCategory = "Girl";
               } else if ((age >= 18) && (age < 60)) {
                   ageCategory = "Women";
               } else  {
                   ageCategory = "sc";

               }
           } else {
               return "Select valid gender";
           }

           return ageCategory;

   }
}
