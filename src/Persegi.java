import java.util.Scanner;

public class Persegi {

    public String namaOrg;
    public double Panjang;
    public double Lebar;
    public double Luas;
    Scanner input = new Scanner(System.in);

    public void InputPersegi(){
        System.out.print("Hitung Persegi, Nama Anda : ");
        namaOrg = input.nextLine();
        System.out.print("Masukkan Panjang : ");
        Panjang = input.nextDouble();
        System.out.print("Masukkan Nilai Lebar : ");
        Lebar = input.nextDouble();
        // System.out.print("Masukkan Luas : ");
        // Luas = input.nextDouble();
    }

    public double HitungPersegi()
    {
        return (Panjang + Lebar);
    }

    public String getNames(){
        return namaOrg;
    }


    
}
