package pl.sda.arp4.object.java;

public class MainMis {
    public static void main(String[] args) {
        Mis mismaly = new Mis("Adaś", 7);
        System.out.println(mismaly);
        System.out.println("Był sobie miś co miał na imie " + mismaly.getImie());

    }
}
