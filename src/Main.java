import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Krystian kr = new Krystian();
        Roch r = new Roch();

        ArrayList<Uczen> uczniowie = new ArrayList<>();

        uczniowie.add(kr);
        uczniowie.add(r);

        Collections.sort(uczniowie);

        for(Uczen u: uczniowie){
            System.out.println(u.getClass().getName());
            u.uczSie();
        }

        KomputerMac m = new KomputerMac("M1", 16);
        KomputerWindows w = new KomputerWindows("i9-9060k", 32);

        ArrayList<Komputer> komputers = new ArrayList<>();

        komputers.add(w);
        komputers.add(m);

        Collections.sort(komputers);

        for(Komputer k: komputers){
            System.out.println(k.getClass().getName());

        }
    }
}