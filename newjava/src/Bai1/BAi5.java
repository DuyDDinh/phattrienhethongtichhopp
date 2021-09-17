package Bai1;
import java.util.Scanner;



public class BAi5 {
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
     Scanner scanner = new Scanner(System.in);
     do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n < 0);
    int array[] = new int[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        array[i] = scanner.nextInt();
    }
    int sum1 = 0 ;
    for(int i = 0 ; i <= 5 ; i++){
        sum1 += array[i];
        
    }
       
    }
   
}
