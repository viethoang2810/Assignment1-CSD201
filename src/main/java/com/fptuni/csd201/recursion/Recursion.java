/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fptuni.csd201.recursion;

/**
 *
 * @author Admin
 */
public class Recursion {
    //A recursive function that computes the sum of all numbers from 1 to n, where n is given as parameter.
    public int sum(int n){
        if(n >= 1){
            return n + sum(n-1) ;
        }
        return  0 ;
    }
    //Implement Fibonacci recursively as f
    public int fibo(int n){
        if(n == 0 && n == 1){
            return 1 ;
        } 
        return fibo(n-1) + fibo(n-2) ;
    }
    
//    public int stirling(int n , int k ){
//        if(n == 0 && k == 0){
//            return 1 ;
//        }else if(n > 0 && k == 0){
//            return 0 ;
//        }
//            return  stirling(n , k -1) - n*stirling(n,k) ;
//    }
    public boolean isPalidrome(String str){
        int a = 1 ;
        if(str == null){
            return false ;
        } else if(str.length() == 1){
            return true ;
        }
        String first = str.substring(0, 1) ;
        String last = str.substring(str.length()-1,str.length());
        if((first.equals(last)) == false){
            return false ;
        }else{
            return isPalidrome(str.substring(1, str.length() - 1)) ;
        }
    }
    // Recursive method addReciprocals that takes an integer as a parameter and returns the sum of the first n reciprocals.
    public double addReciprocal(int n){
        if(n < 1){
            return 0 ; 
        }else if( n == 1){
            return 1;
        }
        return 1/n +addReciprocal(n - 1);
        
    }
    
}
