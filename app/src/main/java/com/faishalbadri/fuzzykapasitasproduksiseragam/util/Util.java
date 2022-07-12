package com.faishalbadri.fuzzykapasitasproduksiseragam.util;

public class Util {

    public static int data(int hasil, int persediaan, int permintaan, int minProduksi, int maxProduksi) {

        int jumlah = permintaan - persediaan;

        if (jumlah <= minProduksi) {
            hasil = minProduksi;
        } else if (jumlah > minProduksi && jumlah < maxProduksi){

            int a = jumlah * 1 / 100;
            int jumlahPlus = jumlah + a;
            int jumlahMin = jumlah - a;

            if (hasil > jumlahPlus || hasil < jumlahMin) {
                if (jumlahPlus >= maxProduksi) {
                    hasil = maxProduksi;
                } else {
                    hasil = jumlahPlus;
                }
            }
        } else if (jumlah >= maxProduksi) {
            hasil = maxProduksi;
        }
        return hasil;
    }
}
