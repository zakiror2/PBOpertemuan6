/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p6_pbojava_achmad_zaki_naufal2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author A-14
 */
public class Strukturkontrol2latihan7PBO {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Tuliskan pesan di sini, saya akan tampilkan berulang.");
        System.out.print("Pesan: ");
        String message = keyboard.nextLine();

        // dua baris berikut untuk membuat bilangan random bertipe integer
        Random mesinRandom = new Random();
        int jumlahPengulangan = 1 + mesinRandom.nextInt(11);

        if (jumlahPengulangan > 10) {
            System.out.println("Bilangan random yang didapat terlalu besar.");
            jumlahPengulangan = 5;
        }

        System.out.print("Pesan akan diulang: " + jumlahPengulangan + " kali\n");
        for (int n = 0; n < jumlahPengulangan; n++) {
            System.out.println((n + 1) + ". " + message);
        }
    }
}
