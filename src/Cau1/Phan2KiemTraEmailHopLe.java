package Cau1;

import java.util.Scanner;

public class Phan2KiemTraEmailHopLe {
    public static boolean kiemTraEmail(String email){
        if(email.contains(" ")){
            return false;
        }
        int atIndex=email.indexOf("@");
        if(atIndex!=-1){
            return false;
        }
        //kiem tra dung 1 ky tu @
        if(email.indexOf("@", atIndex+1)!=-1){
            return false;
        }
        //co it nhat 1 dau '.' sau @
        int dotIndex=email.indexOf(".", atIndex);
        if(dotIndex==-1){
            return false;
        }
        //khong co khoang trang
        if(atIndex==0 || atIndex==email.length()-1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap email: ");
        String email=sc.nextLine();
        if(kiemTraEmail(email)){
            System.out.println("Email hop le.");
        }else{
            System.out.println("Email khong hop le");
        }
    }
}
