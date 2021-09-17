package Bai1;
import java.util.Scanner;
import java.lang.Math;

public class Bai3 {
    public static void tinhptbac2(float a,float b,float c) {
        double denta ;
        denta = b*b-4*a*c ;
        if (denta == 0 ) {
            float nghiem = -b/2*a ;

            
        } else {
            if (denta >0 ) {
                double nghiem1 =( -b + Math.sqrt(denta) /2*a) ; 
                double nghiem2 =( -b - Math.sqrt(denta) /2*a) ;
                System.out.println(" nghi1em " + nghiem1 +"___" +4 nghiem2);
            } else {
                System.out.println(" khong co nghiem");
            }
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Phuong trinh bac 2 cai dang ax^2 +bx +c = 0 ");
        System.out.println(" Nhap vao a , b ,c ");
        float a ,b,c ;
        a= sc.nextFloat();
        b= sc.nextFloat();
        c= sc.nextFloat();
        tinhptbac2(a, b, c);
        
    }
    
}
