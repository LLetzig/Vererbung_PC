public class Datei {
    private String name;
    private String text;
    private double size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getSize() {
        return size;
    }

    public Datei(String name, String text) {
        this.name = name;
        this.text = text;
        calcSize();
    }

    public void calcSize(){
        size = this.text.length()*1.2;
    }

    @Override
    public String toString() {
        return "Datei{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", size=" + size +
                '}';
    }
}
