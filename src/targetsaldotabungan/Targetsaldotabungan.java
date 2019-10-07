/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan perhitungan
 * saldo tabungan dengan ketentuan :
 * saldo awal = Rp.3.500.000
 * Bunga/Bulan(%) = 8
 * Target Saldo = Rp.6.000.000
 */
public class Targetsaldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        double target = 6000000;
        double tambah;
        double saldoawal = 3500000;
        double bunga = 0.08;
        double saldo;
    
      /* mengkonversi ke format IDR , terdapat perbedaan di akhir bilangan
       tetapi saya coba jika tidak memakai formatting jumlah nilainya itu sama
        tetapi karena di soal bapak menggunakan formatting IDR maka saya mendapatkan
        hasil seperti ini*/    
        
    DecimalFormat Idr = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols RP = new DecimalFormatSymbols();
    RP.setCurrencySymbol("Rp. ");
    RP.setMonetaryDecimalSeparator(',');
    RP.setGroupingSeparator('.');
    Idr.setDecimalFormatSymbols(RP);
        
       while ( saldoawal <= target) {      
        saldo = bunga * saldoawal;
        saldoawal = saldoawal + saldo;       
        System.out.printf("Saldo di bulan ke-%d Rp.  %s\n", i, Idr.format((int) saldoawal).replaceAll(",00", ""));
        i++; 
        
        
    }
         System.out.println ("\nDevelop by : Fiqri Akbar Pratama");
    
}
}
