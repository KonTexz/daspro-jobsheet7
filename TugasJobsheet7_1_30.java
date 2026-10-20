import java.util.Scanner;

public class TugasJobsheet7_1_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket, totalHarga, jumlahTiket = 0, jumlahTotalPendapatan = 0, hargaTiket = 50000;
        double diskon;
        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: (0 untuk keluar apabila selesai) ");
            tiket = sc.nextInt();
            totalHarga = tiket * hargaTiket;
            diskon = 0;

            if (tiket <0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah tiket yang benar.");
                continue;
            }
            if (tiket > 4 && tiket <= 10) {

                diskon = totalHarga * 0.1;
                totalHarga = totalHarga - (int)diskon;
                System.out.println("Total yang harus dibayar: Rp" + totalHarga + " dengan diskon 10%");
                jumlahTiket += tiket;
                jumlahTotalPendapatan += totalHarga;
            } else if (tiket > 10) {
                totalHarga = tiket * hargaTiket;
                diskon = totalHarga * 0.15;
                totalHarga = totalHarga - (int)diskon;
                System.out.println("Total yang harus dibayar: Rp" + totalHarga + " dengan diskon 15%");
                jumlahTiket += tiket;
                jumlahTotalPendapatan += totalHarga;
            } else {
                diskon = 0;
                totalHarga = tiket * hargaTiket;
                System.out.println("Total yang harus dibayar: Rp" + totalHarga);
                jumlahTiket += tiket;
                jumlahTotalPendapatan += totalHarga;
            }
        } while (tiket != 0);
        System.out.println("Jumlah tiket terjual: " + jumlahTiket);
        System.out.println("Jumlah total pendapatan: Rp" + jumlahTotalPendapatan);
    }
}
