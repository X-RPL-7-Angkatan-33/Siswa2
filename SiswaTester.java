//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
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
