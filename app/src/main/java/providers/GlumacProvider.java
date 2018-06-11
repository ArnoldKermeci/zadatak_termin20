package providers;

import com.example.androiddevelopment.zadatak_termin20.model.Filmovi;
import com.example.androiddevelopment.zadatak_termin20.model.Glumac;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.String;

public class GlumacProvider {

    public static List<Glumac> getGlumac() {

        List<String> filmovi = new ArrayList<>();
        filmovi.add("Dobar film");

        List<Glumac> glumacs = new ArrayList<>();
        glumacs.add(new Glumac(0, "ClintEastwood","biography", "cl.jpg", 5, new Date(1,1,1960), null, filmovi));
        glumacs.add(new Glumac(0, "ClintEastwood","biography", "cl.jpg", 5, new Date(1,1,1960), null, filmovi));
        glumacs.add(new Glumac(0, "ClintEastwood","biography", "cl.jpg", 5, new Date(1,1,1960), null, filmovi));
        return glumacs;
    }

    public static List<String> getGlumacNames() {

        List<String> names = new ArrayList<>();
        names.add("ClintEastwood");
        names.add("ClintEastwood");
        names.add("ClintEastwood");
        return names;
    }

    public static Glumac getGlumacById(int id) {

        Filmovi film0 = new Filmovi(0, "Dobar film");
        Filmovi film1 = new Filmovi(1, "Dobar film");
        Filmovi film2 = new Filmovi(2, "Dobar film");
        switch (id) {
            case 0:
                return new Glumac(0, "ClintEastwood","biography", "cl.jpg", 5, new Date(1,1,1960), null, (List<String>) film0);
            case 1:
                return new Glumac(1, "ClintEastwood","biography", "cl.jpg", 5, new Date(1,1,1960), null, (List<String>) film1);
            case 2:
                return new Glumac(2, "ClintEastwood","biography", "cl.jpg", 5, new Date(1,1,1960), null, (List<String>) film2);
            default:
                return null;
        }
    }
}
