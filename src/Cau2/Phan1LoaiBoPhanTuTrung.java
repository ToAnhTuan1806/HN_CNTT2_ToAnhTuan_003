package Cau2;

import java.util.Scanner;

public class Phan1LoaiBoPhanTuTrung {
    public static int[] loaiBoTrung(int[] a, int n){
        int[] temp=new int[n];
        int size=0;
        for(int i=0; i<n; i++){
            boolean ptTrung=false;
            for(int j=0; j<size; j++){
                if(a[i] == temp[j]){
                    ptTrung = true;
                    break;
                }
            }
            if(!ptTrung){
                temp[size]=a[i];
                size++;
            }
        }
        int[] result=new int[size];
        for(int i=0; i<size;i++){
            result[i]=temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int[] kq=loaiBoTrung(a, n);
        System.out.print("Mang sau khi da loai bo trung: ");
        for(int x: kq){
            System.out.print(x+" ");
        }
    }
}
