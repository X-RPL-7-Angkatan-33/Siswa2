//Driver Class
import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Siswa:");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa:");
        int id = input.nextInt();
        System.out.println("Inputkan IPK:");
        double ipk = input.nextDouble();

        Siswa nimas = new Siswa(id, nama, ipk);
        nimas.print();
        input.close();
        //object
        //Class object = new Constructor
        Siswa nisa = new Siswa();
        Siswa ria = new Siswa();
        Siswa adi = new Siswa();
        Siswa angga = new Siswa();
        Siswa dion = new Siswa();
        Siswa ima = new Siswa(123, "Ima", 80);

        angga.id = 5;
        nisa.nama = "Annisa";
        ria.ipk = 90;

        ima.print();
        angga.print();
        adi.print();
        dion.print();
        
    }
}
