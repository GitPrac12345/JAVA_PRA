package inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
       /* Browser b1=new Browser();
        Object b2=new Browser();

        Chromium ch1=new Chromium();
        Browser ch2=new Chromium();
        Object ch3=new Chromium();

        Chrome cr1=new Chrome();
        Chromium cr2=new Chrome();
        Browser cr3=new Chrome();
        Object cr4=new Chrome();

        NonChromium nc1=new NonChromium();
        Browser nc2=new NonChromium();
        Object nc3=new NonChromium();

        Edge e=new Edge();
        */

        //Upcasting---Converting child to parent
        Browser b1=new Chrome();
        b1.openURL();

        //Downcasting---Converting Parent to child
        //Chrome ch=new Browser();
       /* Chrome ch1=(Chrome) new Browser();
          ch1.devTools();
          ch1.cliInspect();
          ch1.openURL();
*/
         Chrome ch1=(Chrome)b1;
          ch1.devTools();
          ch1.cliInspect();
          ch1.openURL();

     /*   ((Chrome)b1).openURL();
        ((Chrome)b1).cliInspect();
        ((Chrome)b1).devTools();
*/
       /* new Chrome().devTools();
        new Chrome().openURL();
        new Chrome().cliInspect();
*/

    }
}
