package ProvaKata8;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        String book = "\"1000.00\n"
                + "125 Market 125.45\n"
                + "126 Hardware 34.95\n"
                + "127 Video 7.45\n"
                + "128 Book 14.32\n"
                + "129 Gasoline 16.10\"";
        System.out.println(balance(book));
    }//end main

    public static String balance(String book) {
        String ris = "";
        String str = "";
        String[] oline = book.split("\n");
        String[] line = new String[oline.length];
        Double[] num = new Double[oline.length];
        Double balance = Double.parseDouble(oline[0].replaceAll("\"", "").trim());

        ris = ris + "\"Original Balance: " + balance + "\n";
        for (int i = 1; i < oline.length; i++) {
            line[i] = oline[i].replaceAll("[a-zA-Z]", "");
            str = line[i].substring(4, line[i].length());
            num[i] = Double.parseDouble(str.replaceAll("\"", "").trim());
            balance = balance - num[i];
            balance = (double) ((int) (balance * 100)) / (100);
            ris += oline[i].replaceAll("\"", "") + " Balance " + balance + "\n";

        }

        ris += "Total expense  " + balancesum(num) + "\n";
        ris += "Average expense  " + balanceaverage(num) + "\"";
        ris = ris.replace(" ", "_");

        return ris;
    }//end balance

    public static Double balancesum(Double[] num) {
        Double ris = 0.0;
        for (int i = 1; i < num.length; i++) {
            ris += num[i];
            ris = (double) ((int) (ris * 100)) / (100);
        }
        return ris;
    }//end balancesum

    public static Double balanceaverage(Double[] num) {
        Double ris = 0.0;
        ris = balancesum(num) / (num.length - 1);
        ris = (double) ((int) (ris * 100)) / (100);
        return ris;
    }//end balanceaverage
    }

