/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chgithub1;

public class FirstTest {

    public static void main(String[] args) {
        //
        int[] table = {5, 1, 3, 4, 2};
        printTableasStars(table);
    }
  
 
    public static void printStars(int many) {
        while (many > 0) {
            System.out.print("*");
            many = many - 1;
        }
    }

    public static void printTableasStars(int[] table) {
        //Go through the numbers in the table
        //use the method printStars for every number
        int index=0;
        while(index < table.length){
            printStars(table[index]);
            System.out.println("");
            index++;
        }
    }
}