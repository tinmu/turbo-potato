/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import  java.util.Scanner;
public  class  LuasSegiTiga {

         public static  void  main(String []  args)   {


            Scanner input  =new Scanner(System.in);
            System.out.println("Sila masukkan nilai tapak");
            int tapak  = input.nextInt();
         
            System.out.println("Sila masukkan nilai tinggi");
            int tinggi =  input.nextInt();

                  
            double luas = (1.0/2)*tapak*tinggi;
                         
            System.out.println("Luas  segi  tiga ialah:"+luas);

           }

    
}
