import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("hp","pavillion",2000,40,2.5);
        Laptop l2 = new Laptop("hp","pavillion",2000,40,2.5);

        l1.erstelleDatei("bbbb", "bbbbbbbbbbbbbbbb");
        l1.erstelleDatei("aaaa", "aaaaaaaaaaaaaaaa");
        l1.erstelleDatei("cccc", "cccccccccccccccc");
        l1.erstelleDatei("dddd", "dddddddddddddddd");

        l2.erstelleDatei("bbbb", "bbbbbbbbbbbbbbbbb");
        l2.erstelleDatei("aaaa", "aaaaaaaaaaaaaaaa");
        l2.erstelleDatei("cccc", "cccccccccccccccc");
        l2.erstelleDatei("dddd", "dddddddddddddddd");

        l1.zeigeGespeicherteDateien();
        System.out.println("-".repeat(20));
        l2.zeigeGespeicherteDateien();
        System.out.println("-".repeat(20));
        l1.transferiereDatei(l2,"bbbb");
        System.out.println("-".repeat(20));
        l1.zeigeGespeicherteDateien();
        System.out.println("-".repeat(20));
        l2.zeigeGespeicherteDateien();

    }
}