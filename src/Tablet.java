public class Tablet extends Computer{
    private boolean hatStift;
    private double screensize;

    public boolean isHatStift() {
        return hatStift;
    }

    public void setHatStift(boolean hatStift) {
        this.hatStift = hatStift;
    }

    public double getScreensize() {
        return screensize;
    }

    public void setScreensize(double screensize) {
        this.screensize = screensize;
    }

    public Tablet(String hersteller, String modell, int baujahr, boolean hatStift, double screensize) {
        super(hersteller, modell, baujahr);
        this.hatStift = hatStift;
        this.screensize = screensize;
    }

    public void starten() throws InterruptedException {
        System.out.println("zack! an.");

    }
}
