package pl.sda.arp4.object.java;

public class Main {
    public static void main(String[] args) {
        Pies pies1 = new Pies();
        pies1.imie = "Burek";
        System.out.println(pies1);

        Pies pies2 = new Pies();
        pies2.imie = "Wacław";
        System.out.println(pies2);

        Student student1 = new Student("Grzegorz");
        student1.imie = "Grzegorz";
        student1.nazwisko ="Puławski";
        System.out.println(student1);
        System.out.println("Ten student ma na imie " + student1.getImie());



    }
}
