public class Laptop extends Computer{
    private int akku;
    private double gewicht;


    public int getAkku() {
        return akku;
    }

    public void setAkku(int akku) {
        this.akku = akku;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public Laptop(String hersteller, String modell, int baujahr, int akku, double gewicht) {
        super(hersteller, modell, baujahr);
        this.akku = akku;
        this.gewicht = gewicht;
    }

    @Override
    public void starten() throws InterruptedException {
        System.out.println("Laptop startet im Akkubetrieb");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "akku=" + akku +
                ", gewicht=" + gewicht +
                ", hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
