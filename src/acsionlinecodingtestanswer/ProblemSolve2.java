/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acsionlinecodingtestanswer;

/**
 *
 * @author irfanasidiq
 */
public class ProblemSolve2 {
    
    public int[] solution(int[] arr){
        int x, tmp = 1;    
        int arrlength = arr.length;
        if (arrlength == 1) {
            System.out.print("0");
        }
 
        int hasilAkhir[] = new int[arrlength];

        for (int i = 0; i < arrlength; i++){
            hasilAkhir[i] = 1;
        }
 

        for (x = 0; x < arrlength; x++) {
            hasilAkhir[x] = tmp;
            tmp *= arr[x];
        }
 
        tmp = 1;

        for (x = arrlength - 1; x >= 0; x--) {
            hasilAkhir[x] *= tmp;
            tmp *= arr[x];
        }
 
        return hasilAkhir;
    
    } 
}
