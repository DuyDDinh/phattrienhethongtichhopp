package Diem;

import java.util.Scanner;

public class Point {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Nhap toa do ");
            int x1  = scanner.nextInt();
            int y1  = scanner.nextInt();
        System.out.println(" Toa do diem vua nhap la : ("+x1+","+y1+")");
        System.out.println("khoang cach la "+ khoangCach(x1, y1)); 
        

    }
    public static double khoangCach(int x1, int y1) {
        double khoancach = Math.sqrt(x1*x1 + y1*y1);

        return khoancach ;

       
    }

    
}
