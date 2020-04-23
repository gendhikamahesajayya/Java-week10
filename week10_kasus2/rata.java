/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10_kasus2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class rata {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String nama;
    int  nilai1, nilai2;
    double jumlah, rata2;
        System.out.println("---------Mencari Rata-rata Nilai-----------");
        System.out.println("Nama :");
        nama = input.nextLine();
        System.out.println("Jumlah mata kuliah");
        jumlah = input.nextDouble();
        int sum = 0;
        for(int i =1; i<=jumlah; i++){
            System.out.println("Nilai Mk :" + i);
        nilai1 = input.nextInt();
        sum += nilai1;
        }
        rata2 = sum/jumlah;
        System.out.println("rata-rata " +rata2);
    }
}
