

package Bai2;
import java.util.Scanner;
public class cau1 {
    public static void gantoado() {
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2;
        System.out.println(" nhap vao toa do diem X ");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        System.out.println(" nhap vao toa do diem Y ");
        y2 = sc.nextInt();
        y1 = sc.nextInt();


        
    }
    public void printtoado(int x1,int y1) {
        System.out.println("toa do diem X ("+x1+","+y1+")");
    }
    public static void main(String[] args) {
     gantoado();
     printtoado();
        
    }
    
}
