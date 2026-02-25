package Cau1;

import java.util.Scanner;

public class Phan1ChuanHoaChuoi {
    public static String chuanHoaChuoi(String s){
        //xoa khoang trang du thua
        s=s.trim();
        StringBuilder result=new StringBuilder();
        boolean vietHoa=true;
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if (c == ' '){
                if(result.length()>0 && result.charAt(result.length()-1)!= ' '){
                    result.append(' ');
                }
                vietHoa=true;
            }else {
                //viet hoa chu cai dau moi tu
                if(vietHoa){
                    result.append(Character.toUpperCase(c));
                    vietHoa=false;
                }else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chuoi bat ky: ");
        String s=sc.nextLine();
        System.out.println(chuanHoaChuoi(s));
    }
}
