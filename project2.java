public class project2 {
    public static void main() {
        double leblebibuy = 3.5;
        double findukbuy = 15.7;
        double badembuy = 22;

        double totalleblebi = leblebibuy * 12;
        double totalfinduk = findukbuy * 25;
        double totalbadem = leblebibuy * 40;

        double newleblebi = ((leblebibuy / 2) + leblebibuy) * 12;
        double newfinduk = (((findukbuy * 2) / 3) + findukbuy) * 25;
        double newbadem = (((badembuy * 3) / 5) + badembuy) * 40;

        double totalgider = totalleblebi + totalfinduk + totalbadem;

        double gelir = newleblebi + newfinduk + newbadem;

        double sonDurum = gelir - totalgider;

        double kira = 500;

        if (sonDurum >= kira) {
            System.out.println("Bakiyeniz yeterlidir kiranızı ödeyebilirsiniz");
            System.out.print("Yeni bakiye " + sonDurum);
        } else {
            System.out.println("Bakiyeniz yetersizdir");
        }

    }
}