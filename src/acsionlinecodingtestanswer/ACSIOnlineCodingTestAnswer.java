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
public class ACSIOnlineCodingTestAnswer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProblemSolve1 solveprob1 = new ProblemSolve1();
        ProblemSolve2 solveprob2 = new ProblemSolve2();
        
        //hasil jawaban problem1
        int[] arr = {10, 15, 3, 25};
        System.out.println(" "+solveprob1.solution(arr, 18));
        
        //hasil jawaban problem2
        int arrg[] = { 1, 2, 3, 4, 5};
        System.out.println("hasil dari array adalah : ");
        int hasil[] = solveprob2.solution(arrg);
        for(int x =0; x<hasil.length; x++){
            System.out.print(hasil[x]+" ");
        }
        
        //hasil jawaban problem3
        
        //hasil jawaban problem4
        
        //hasil jawaban problem5
    }
    
}
