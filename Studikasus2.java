import java.util.Scanner;

public class Studikasus2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa          : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan          : ");
        String jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen (0-4)    : ");
        int jumlahDokumen = input.nextInt();

        System.out.print("Peringkat juara (0-3)   : ");
        int peringkatJuara = input.nextInt();

        System.out.print("Status pemenang PKM (1/0): ");
        int statusPKM = input.nextInt();

        jenisKegiatan = jenisKegiatan.toUpperCase();

        System.out.println("\n======================================");
        System.out.println("       HASIL VALIDASI MAHASISWA");
        System.out.println("======================================");
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("Jenis kegiatan : " + jenisKegiatan);

        if (jumlahDokumen < 4) {

            int dokumenKurang = 4 - jumlahDokumen;

            System.out.println("Status dokumen : TIDAK LENGKAP");
            System.out.println("Dokumen kurang : " + dokumenKurang);
            System.out.println("Status dana    : TIDAK DIBERIKAN");
            System.out.println("Alasan         : Dokumen yang diupload kurang dari 4.");

        } else {

            System.out.println("Status dokumen : LENGKAP");

            if (jenisKegiatan.equals("BELMAWA")
                    || jenisKegiatan.equals("BAKORMA")
                    || jenisKegiatan.equals("MANDIRI")) {

                if (peringkatJuara >= 1 && peringkatJuara <= 3) {

                    System.out.println("Peringkat      : Juara " + peringkatJuara);
                    System.out.println("Status dana    : DIBERIKAN");
                    System.out.println("Alasan         : Juara 1, 2, atau 3 pada kegiatan yang diperbolehkan.");

                } else {

                    System.out.println("Peringkat      : Bukan juara 1-3");
                    System.out.println("Status dana    : TIDAK DIBERIKAN");
                    System.out.println("Alasan         : Peringkat bukan Juara 1, 2, atau 3.");
                }

            } else if (jenisKegiatan.equals("PKM")) {

                if (statusPKM == 1) {

                    System.out.println("Status PKM     : Pemenang");
                    System.out.println("Status dana    : DIBERIKAN");
                    System.out.println("Alasan         : Tim PKM merupakan tim yang lolos pendanaan.");

                } else {

                    System.out.println("Status PKM     : Tidak menang");
                    System.out.println("Status dana    : TIDAK DIBERIKAN");
                    System.out.println("Alasan         : Tim PKM bukan tim yang lolos pendanaan.");
                }

            } else {

                System.out.println("Status dana    : TIDAK DIBERIKAN");
                System.out.println("Alasan         : Kegiatan termasuk kategori Lainnya.");
            }
        }

        System.out.println("======================================");

        input.close();
    }
}
