public class Vec {
    String jmeno;
    double hmotnost;
    boolean zivotnost;

    public Vec(String jmeno, double hmotnost, boolean zivotnost) {
        this.jmeno = jmeno;
        this.hmotnost = hmotnost;
        this.zivotnost = zivotnost;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public boolean isZivotnost() {
        return zivotnost;
    }

    public void setZivotnost(boolean zivotnost) {
        this.zivotnost = zivotnost;
    }
}
