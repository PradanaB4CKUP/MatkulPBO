import java.io.IOException;
import java.util.Scanner;

public class NewMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Persegi scan = new Persegi();

        scan.InputPersegi();
        System.out.println("Nama Anda : " + scan.getNames());
        System.out.print("Hasil Perhitungan : " + scan.HitungPersegi());
        

    }
    
}
