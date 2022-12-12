public class Test {
    public static void main(String[] args) {
        Fighter a1=new Fighter("A",20,100,100,100);
        Fighter a2=new Fighter("B",40,0,90,90);


        Match ring=new Match(60,100,a1,a2);
        ring.run();
    }

}
