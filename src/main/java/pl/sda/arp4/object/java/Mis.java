package pl.sda.arp4.object.java;

public class Mis {
     private String imie;
     private int wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Mis(String imie1, int wiek1){
        imie=imie1;
        wiek=wiek1;

    }
    @Override
    public String toString() {
        return "Mis{" +
                "imie='" + imie + '\'' +
                ", wiek='" + wiek + '\'' +
                '}';
    }



}
