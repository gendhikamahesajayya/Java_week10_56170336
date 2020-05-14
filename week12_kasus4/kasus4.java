/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_kasus4;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus4 {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
        System.out.println("Banyak data : ");
        int N = in.nextInt();
        int data[] = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("Data ke- " + (i+1) + " : ");
            data[i] = in.nextInt();
        }
        for(int i=1; i<data.length; i++){
        int key = data[i];
        int j=i;
        while(j>0 && data[j-1]>key){
        data[j] = data[j-1];
        j--;
        }
        data[j] = key;
        }
        System.out.println("Data yang telah urut : ");
        for(int i=0; i<data.length;i++){
            System.out.println(data[i] + " ");
        }
        System.out.println();
        }
    }

