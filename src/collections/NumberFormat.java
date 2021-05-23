package collections;

import java.util.Locale;
import java.util.Scanner;
import java.text.*;

public class NumberFormat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indiana=new Locale("en", "IN");
        // Write your code here.
        NumberFormat us =NumberFormat.(Locale.US);
        NumberFormat china =NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat india =NumberFormat.getCurrencyInstance(Locale.indiana);
        NumberFormat france =NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}