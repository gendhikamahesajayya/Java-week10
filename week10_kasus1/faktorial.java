/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10_kasus1;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class faktorial {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    long fak = 1;
    int angka = 0;
        System.out.println("Masukkan angka :");
        angka = input.nextInt();
        
        for(int i=1; i<=angka; i++){
        fak = i * fak;
        }
        System.out.println("faktorial dari "+angka+" adalah " + fak );
    }
}
