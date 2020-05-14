/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_kasus5;

/**
 *
 * @author USER
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
public class kasus5 {
    public static void main(String[]args)throws IOException
    {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Masukkan jumlah Data : ");
        int jlh_data = Integer.parseInt(dataIn.readLine());
        int[]data= new int[jlh_data];
        
        System.out.println("\nMenu Pengisian Data");
        System.out.println("1. di input oleh user");
        System.out.println("2. di isi oleh program");
        System.out.println("Pilihan : ");
        int isi_data = Integer.parseInt(dataIn.readLine());
        switch(isi_data){
            case 1: System.out.println();
                for(int a = 0; a< jlh_data; a++){
                    System.out.println("Data ke-" + (a+1) + " : ");
                    data[a] = Integer.parseInt(dataIn.readLine());
                }
                break;
            
            case 2: System.out.println();
                for(int a =0; a < jlh_data; a++)
                    data[a] = new Random().nextInt(201);
                System.out.println("Data : ");
                for(int a = 0; a < jlh_data; a++)
                    System.out.println(data[a] + " ");
                break;
                
            default : System.out.println("\npilihan tidak tersedia");
        }
        System.out.println("\nProses Insertion Sort");
        for(int a = 0; a < jlh_data-1; a++){
            System.out.println("Iterasi" + (a+1));
            for(int b = 0; b < jlh_data; b++)
                System.out.println(data[b] + "\t");
            System.out.println("    ------>Bandingkan  " + data[a+1]+ "dengan" + data[a]);
            for(int b = a+1; b > 0; b--){
            String pesan = "  --> Tidak ada pertukaran";
            if(data[b] < data[b-1])
            {
                pesan = " ---> " + data[b] + "tukar posisi dengan" +data[b-1];
                
                int temp = data[b];
                data[b] = data[b-1];
                data[b-1] = temp;
                System.out.println();
                for(int c=0; c<jlh_data;c++)
                    System.out.println(data[c]+"\t");
                System.out.println(pesan);
            }
            else{
                System.out.println();
                for(int c = 0; c < jlh_data; c++)
                    System.out.println(data[c] + "\t");
                System.out.println(pesan);
                break;
            }
            }
            System.out.println("\n");
        }
        System.out.println("\nData setelah di sorting : ");
        for(int a =0; a < jlh_data; a++)
            System.out.println(data[a] + " ");
    }
}
