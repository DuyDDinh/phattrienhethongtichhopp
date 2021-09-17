package Bai1;

import java.util.Scanner;

public class Bai2 {
    public static boolean ktsnt(int number) {
        if ( number <0){
            return false ;

        }else{
            for(int i = 2 ; i <= number/2 ; i++){
                int count = 0 ;

                if( number%i==0 ){
                    return false;

                }

                }
                return true ;
            }
            
           
        


        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
       
        System.out.println(" Nhap vao so cam kiem tra ");
        number = sc.nextInt();
        if(ktsnt(number)){
            System.out.println(" so nguyen to");
        }else{
            System.out.println("  khong so nguyen to");
        }
        
    }
}
