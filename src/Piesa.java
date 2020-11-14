public class Piesa {
     String nume;
     int pret;

    public Piesa(String _nume, int _pret) {
        this.pret = _pret; this.nume=_nume;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
