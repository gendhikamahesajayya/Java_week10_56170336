/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12_kasus6;

/**
 *
 * @author USER
 */
public class kasus6 {
    public static void main(String[]args){
    int [] tabInt = {51,23,17,32,43,88};
    int i,j,N;
    N=6;
    for(i = 0; i < N; i++){
    int min = tabInt[i];
    int pos = i;
    for(j = i; j < N; j++){
    if(tabInt[j] < min){
    min = tabInt[j];
    pos = j;
    }
    }
    if(i!=pos){
    int temp = tabInt[i];
    tabInt[i] = tabInt[pos];
    tabInt[pos] = temp;
    }
    }
    for(i=0; i<6; i++){
        System.out.println(tabInt[i] + " ");
    }
    }
}
