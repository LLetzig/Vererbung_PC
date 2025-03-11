public class Tower extends Computer{
    private Boolean hatGrafikkarte;

    public Boolean getHatGrafikkarte() {
        return hatGrafikkarte;
    }

    public Tower(String hersteller, String modell, int baujahr, Boolean hatGrafikkarte) {
        super(hersteller, modell, baujahr);
        this.hatGrafikkarte = hatGrafikkarte;
    }

    public void setHatGrafikkarte(Boolean hatGrafikkarte) {
        this.hatGrafikkarte = hatGrafikkarte;
    }

    public void starten() throws InterruptedException {
        System.out.println(" BIOS-Passwort eingeben:");
        wait(100);
        System.out.println("Spaß :)");
        wait(100);
        System.out.println("System hochgefahren");

    }

    @Override
    public String toString() {
        return "Tower{" +
                "hatGrafikkarte=" + hatGrafikkarte +
                ", modell='" + modell + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
