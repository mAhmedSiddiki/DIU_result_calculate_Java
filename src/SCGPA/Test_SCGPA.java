package SCGPA;

import java.util.Scanner;

public class Test_SCGPA {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int x=1,z=0;
        int credit;
        double point,haha = 0,all;
        
        while(x>0){
            
            System.out.print("\n\n\t❤ Welcome to DIU Result ❤\nHow many subject you calculate: ");
            int sub = input.nextInt();
            
            for (int i = 1; i <= sub; i++) {
                System.out.print("\nEnter "+i+" subject credit: ");
                credit = input.nextInt();
                System.out.print("Enter "+i+" subject grade point: ");
                point = input.nextDouble();
                
                haha = haha + (credit * point);
                z=z+credit; 
            }
            
            all = haha/z;
            
            System.out.print("\n\n\t\t🎃 🎃 🎃 🎃 🎃 🎃 🎃 🎃 🎃 🎃 🎃\n");
            System.out.printf("\t\t😎 😎 😎 SCGPA: %.2f  😎 😎 😎",all);
            System.out.print("\n\t\t🎃 🎃 🎃 🎃 🎃 🎃 🎃 🎃 🎃 🎃 🎃\n");
            
            
            
            System.out.print("\n\nDo you want to exit: \n1. Yes\n2. No\n");
            int y = input.nextInt();
            
            if(y == 1){
                x=0;
            }
            else if(y == 2){
                x=1;
            }
        }
        
        System.out.println("\n\n\t\t😍 Developed by MARJUK 😍");
        
    }
    
}
