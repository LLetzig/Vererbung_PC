import java.util.ArrayList;
import java.util.Iterator;

public class Computer {
    protected String hersteller;
    protected String modell;
    protected int baujahr;
    protected ArrayList<Datei> daten = new ArrayList<>();

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public ArrayList<Datei> getDaten() {
        return daten;
    }

    public void setDaten(ArrayList<Datei> daten) {
        this.daten = daten;
    }

    public Computer(String hersteller, String modell, int baujahr) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public void starten() throws InterruptedException {
        System.out.println("System startet...");
        wait(200);
        System.out.println("System einsatzbereit!");
    }

    public void erstelleDatei(String name, String text) {
        this.daten.add(new Datei(name, text));
    }

    public void transferiereDatei(Computer zielComputer, String dateiname) {

        Iterator<Datei> iterator = this.daten.iterator();
        while (iterator.hasNext()) {
            Datei obj = iterator.next();
            if (obj.getName().equals(dateiname)) {
                zielComputer.daten.add(obj);
                iterator.remove();
            }
        }
    }
    public void zeigeGespeicherteDateien(){
        this.daten.forEach(System.out::println);
    }
}