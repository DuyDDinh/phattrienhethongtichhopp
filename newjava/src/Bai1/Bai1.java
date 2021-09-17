package Bai1;


import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) throws Exception {

         Scanner sc = new Scanner(System.in);
         String message ; 
         System.out.println(" Nhap vao chuoi ky tu ");
         message = sc.nextLine();
        char[] charArray = message.toCharArray();
        for( int i = 0 ; i < charArray.length ;i++){
            if( charArray[i] >= 97 && charArray[i]<= 122){
                charArray[i] -=32 ;

            }
        }
        // char[] charArray = message.toCharArray();
    //sử dụng vòng lặp for để duyệt các phần tử trong charArray
    // for(int i = 0; i < charArray.length; i++) {
    //   if(charArray[i] >= 97 && charArray[i] <= 122){
    //     charArray[i] -= 32;
    //   }
    // }
     
        message=String.valueOf(charArray);
        System.out.println("chuoi sau khi doi "+ message);
            
     
    }
}
