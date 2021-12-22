import java.io.*;
import java.util.Locale;
import java.text.DecimalFormat;


class Ala {
    public static void main(String[] args) {
        double sade;
        double ala;
        new DecimalFormat("#.###");
        DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(Locale.GERMAN);

        

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Anna ympyrän säde:");
            sade = Float.parseFloat(in.readLine());

            ala = 3.142*(sade*sade);
           


            System.out.printf("Ympyrän ala annetulla säteellä: "+df.format(ala));
        }
        catch(Exception e) {
			System.out.println("Antamasi syöte oli virheellinen...");
		}
    }

}
