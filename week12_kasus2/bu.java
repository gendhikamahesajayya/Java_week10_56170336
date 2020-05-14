/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_kasus2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class bu {
    public static void main(String[]args){
    int jumlah, i, j, swap;
    Scanner input = new Scanner(System.in);
    
        System.out.println("Masukkan Jumlah Bilangan yang mau di inputkan");
        jumlah = input.nextInt();
        
        int array[] = new int[jumlah];
        
        System.out.println("\nMasukkan" + jumlah + "buah bilangan integer");
        System.out.println("============================================");
        for(i=0; i < jumlah; i++){
            System.out.println("Bilangan Ke- " + (i+1) + " =");
            array[i]= input.nextInt();
        }
        System.out.println("Bilangan Belum terurutnya");
        for(int a=0; a<jumlah; a++){
            System.out.print(array[a] + " ");
        }
        for(i=0; i<(jumlah-1);i++){
        for(j=0;j<jumlah-i-1;j++){
        if(array[j] < array[j+1]){
        swap = array[j];
        array[j] = array[j+1];
        array[j+1]=swap;
        }}}
        System.out.println("\n\nBilangan Terurutnya adalah :");
        for(i=0;i<jumlah;i++)
            System.out.println(array[i] + " ");
    }
}
