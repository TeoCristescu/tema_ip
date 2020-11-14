public class Sucursala {
    int id;
    String locatie;
    int nr_angajati;
    public Sucursala(int _id, String _locatie,int _nr_angajati) {
    this.id=_id; this.locatie=_locatie; this.nr_angajati=_nr_angajati;
    }

    public int getId() {
        return id;
    }

    public String getLocatie() {
        return locatie;
    }

    public int getNr_angajati() {
        return nr_angajati;
    }
}
