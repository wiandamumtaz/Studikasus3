package Tugas;

import java.util.Scanner;

public class Percobaan3 {
        public static void main(String [] args){
  Scanner scan = new Scanner (System.in);
  
  //Masukan tipe Data
  String Laptop,Nama_Barang;
  int jml_barang, harga_satuan, total_harga, diskon, total_bayar;
  
  //Input
  System.out.println("\nPEMBELIAN ");
  System.out.print("Nama Barang  : ");
  Nama_Barang = scan.nextLine();
  System.out.print("Jumlah Barang  : ");
  jml_barang = scan.nextInt();
  System.out.print("Harga Satuan  : ");
  harga_satuan = scan.nextInt();
  
  //Proses
  total_harga = harga_satuan * jml_barang;
  diskon = total_harga*5/100;
  total_bayar = (total_harga-(diskon));
  
  //Output
  if(total_harga>=500000){
   System.out.println("\nDiskon 5%  : "+diskon);
   System.out.print("Total Bayar  : "+total_bayar);
  }else if (total_harga>=0 && total_harga<500000){
   System.out.println("\nTotal Bayar : "+total_harga+ " maaf,anda tidak dapat potongan harga");
    
}

    
}
}
