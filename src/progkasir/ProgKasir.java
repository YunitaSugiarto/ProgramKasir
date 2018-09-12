package progkasir;

import java.util.Scanner;

public class ProgKasir {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        String barang, kode;
        int banyak;
        double harga, totalBayar1 = 0, totalBayar2 = 0, diskon = 0;

        System.out.println("TOKO BUKU KEJORA");
        System.out.println("===============");

        System.out.print("Nama Barang   : ");
        barang = masuk.nextLine();

        System.out.print("Kode Barang   : ");
        kode = masuk.nextLine();

        System.out.print("Harga satuan  : ");
        harga = masuk.nextDouble();

        System.out.print("Banyak barang : ");
        banyak = masuk.nextInt();

        totalBayar1 = harga * banyak;

        if (totalBayar1 > 100000) {
            diskon = 0.1 * totalBayar1;
        }
        if (totalBayar1 > 200000) {
            diskon = 0.2 * totalBayar1;
        }
        if (totalBayar1 > 500000) {
            diskon = 0.5 * totalBayar1;
        }

        totalBayar2 = totalBayar1 - diskon;

        System.out.println("===============");
        System.out.println("Total Harga : Rp " + totalBayar1);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total Bayar : Rp " + totalBayar2);
        
        System.out.println("THANK YOU");
    }

}
