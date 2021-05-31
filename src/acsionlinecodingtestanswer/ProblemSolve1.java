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
public class ProblemSolve1 {
    public boolean solution(int[] arr, int k){
        boolean status = false;
        for(int i = 0; i<arr.length; i++ ){
            for(int j = i+1; j< arr.length; j++){
                if((arr[i] + arr[j]) == k ){
                    status = true;
                    return status;
                }
            }
        }
      return status;  
    }
}
