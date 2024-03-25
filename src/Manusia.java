public class Manusia{
    String jenisKelamin, warnaRambut;
    int usia=27;
    int nilai1, nilai2;

    public Manusia(int x, int y){

    nilai1 = x;
    nilai2 = y;
    
    }

    public int getHasilKali(){
     return(nilai1*nilai2);   
    }

    void getCetak(){
        System.out.print("Kelas 12.2B.01");
        System.out.println("Belajar Konsep OOP with Java Programming");
        System.out.println("Hasil Kali : " + getHasilKali());
    }
}