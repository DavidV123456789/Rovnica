package rovnica.map;
//názov súboru a názov hlavnej triedy musia byť rovnaké(Main.java , public class Main)
public class Main {

    public static void main(String[] args) {
	    //System.out.println("Toto je naša prvá veta vypísaná v Jave");
        RovnicaLN Prva= new RovnicaLN(2,3);
        System.out.println(Prva.getA());
        System.out.println(Prva.getB());
        System.out.println(Prva);
        RovnicaKv KV= new RovnicaKv(5,2);
        System.out.println(KV);
    }
}
