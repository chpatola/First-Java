
package com.mycompany.chgithub1;

public class FirstTest {

    public static void main(String[] args) {
        //
        int[] table = {4, 1, 3, 4, 2};
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
