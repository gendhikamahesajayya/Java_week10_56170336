/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_kasus7;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus7 {
    public static void main(String[]args){
    Scanner  scan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Data : ");
        int jlh_data = scan.nextInt();
        
        int[] data = new int[jlh_data];
        System.out.println();
        for(int x = 0; x < jlh_data;x++){
            System.out.println("Input nilai data ke-" + (x+1) + " : ");
            data[x] = scan.nextInt();
        }
        System.out.println();
        System.out.println("Data sebelum di sorting");
        for(int x = 0; x < jlh_data; x++)
            System.out.println(data[x]+ " ");
        System.out.println("\n\nProses Selection Sort");
        for(int x = 0; x<jlh_data-1;x++){
            System.out.println("Iterasi ke-" + (x+1) + " : ");
        for(int y =0; y < jlh_data; y++)
                System.out.println(data[y]+" ");
            System.out.println("Apakah Data " + data[x] + "sudah benar pada urutannya");
            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "Tidak ada Pertukaran";
            for(int y = x+1; y <jlh_data; y++){
            if(min > data[y])
            {
            tukar = true;
            index = y;
            min = data[y];
            }
            }
            if(tukar == true){
            pesan = "data" + data[x] + "ditukar dengan data" + data[index];
            int temp = data[x];
            data[x] = data[index];
            data[index] = temp;
            }
            for(int y = 0; y<jlh_data;y++)
                System.out.println(data[y]+" ");
            System.out.println(pesan+"\n");
        }
        System.out.println("Data setelah di sorting : ");
        for(int x = 0; x <jlh_data;x++)
            System.out.println(data[x]+" ");
    }
}
