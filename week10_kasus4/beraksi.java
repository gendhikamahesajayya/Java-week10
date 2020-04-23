/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10_kasus4;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class beraksi {
    public static void main(String[] args) {
 
  int ambil = 0,simpan = 0, masuk;
  Scanner pilih = new Scanner(System.in);
  bank bk = new bank(100000);
        do{
        System.out.println("Menu Atm");
        System.out.println("1. Cek saldo");
        System.out.println("2. Simpan uang");
        System.out.println("3. Ambil uang");
        System.out.println("4. Keluar");
        System.out.println("Pilih menu :");
        masuk = pilih.nextInt();
        switch(masuk){
            case 1: bk.simpanAwal();
            break;
            case 2: bk.simpanUang(simpan);
            break;
            case 3: bk.ambilUang(ambil);
            break;
            case 4: System.exit(0);
            break;
        }
    }while(masuk != 4);
    }
}
