public class Workstation extends Computer{
    private String prozessor;

    public Workstation(String hersteller, String modell, int baujahr, String prozessor) {
        super(hersteller, modell, baujahr);
        this.prozessor = prozessor;
    }

    public String getProzessor() {
        return prozessor;
    }

    public void setProzessor(String prozessor) {
        this.prozessor = prozessor;
    }


    @Override
    public void starten() throws InterruptedException {
        System.out.println("Workstation fährt hoch");
        wait(100);
        System.out.println("50%");
        wait(100);
        System.out.println("Workstation bereit zum arbeiten");
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "prozessor='" + prozessor + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
