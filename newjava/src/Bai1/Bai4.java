package Bai1;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
       
        System.out.println(" Nhap vao so  ");
        number = sc.nextInt();
        int sum= 0 ;
        for( int i = 1 ; i <= number ; i++){
           
            sum +=i ;


        }
        System.out.println("tong "+ sum);
    }
}
