public class Mahasiswa {
    // buat 3 property untuk class Mahasiwa
    String nama;
    int nim;
    String kelas;

    // buat 2 method untuk class Mahasiswa
    String Kampus1() {
        return "UAD";
    }

    String Kampus2() {
        return "UNIVERSITAS AHMAD DAHLAN";
    }
};

class Main {

    public static void main(String args[]){

        // buat object dari class Mahasiwa (instansiasi)
        Mahasiswa ahlan = new Mahasiswa();

        // set nilai property
        ahlan.nama = "ahlan marjan ";
        ahlan.nim = 474;
        ahlan.kelas = " J";

        // tampilkan property object Laptop
        System.out.print(ahlan.nama);
        System.out.print(ahlan.nim);
        System.out.println(ahlan.kelas);

        // tampilkan hasil method object Laptop
        System.out.println(ahlan.Kampus1());
        System.out.println(ahlan.Kampus2());
    }
}
