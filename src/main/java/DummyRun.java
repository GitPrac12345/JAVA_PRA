public class DummyRun {
    public static void main(String[] args) {

    ClassRoom cr = new ClassRoom();
    cr.floorNo=7;
    cr.seatingCapacity=1000;
    cr.clean();
        School sc = new School();
        sc.name = "cbse";
        sc.address = "delhi";
        sc.principal = "fac";
        sc.teacherCount = 100;
        sc.studentCount = 100000;
        sc.displayResult();
        Student st = new Student();
        st.name="sai";
        st.food="bri";
        st.play(st.name);
        st.eat( st.food);
        st.talk();

        Teacher tr = new Teacher();
        tr.name = "t1";
        tr.subject = "DSA";
        tr.teach();



}





}
