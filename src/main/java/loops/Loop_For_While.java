package loops;

public class Loop_For_While {

    public static void main(String[] args) {
        forLoopDemo();
        innerForLoop();
        whileLoopDemo();
    }

   public static void forLoopDemo(){
        for(int i=0;i<10;i++){
            System.out.println("Java statement:"+i);
        }
   }
    public static void innerForLoop() {
        /*
        print the below pattern
        *****
        ****
        ***
        **
        *
      */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
        public static void whileLoopDemo(){
            int i=0;
            while(i<5){
                System.out.println("while Loop");
                i++;
            }
}


}
