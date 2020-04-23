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
public class bank {
    int saldo;
  Scanner masukan = new Scanner(System.in);
 
public bank(int saldo) {
  this.saldo =saldo;
}
 
void simpanAwal(){
  System.out.println("Saldo awal adalah : Rp. " + saldo);
}
 
void simpanUang(int simpan){
    System.out.println("Masukkan jumlah uang yang anda simpan");
  simpan = masukan.nextInt();
  saldo = simpan+saldo;
  System.out.println("Saldo Saat ini adalah Rp:" +saldo);
}
 
void ambilUang(int ambil){
    System.out.println("Masukkan uang yang anda ambil");
  ambil=masukan.nextInt();
  if(saldo < 0){
      saldo = saldo - ambil;
    System.out.println("Saldo saat ini adalah Rp:" + saldo);
  }
  else{
      saldo = 0;
      System.out.println("Saldo tidak mencukupi");
  }
}
}
