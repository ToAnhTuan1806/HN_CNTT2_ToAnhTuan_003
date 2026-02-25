package Cau2;

import java.util.Scanner;

public class Phan2OnePass {
    public static void timDoanTang(int[] a, int n){
        int maxLen=1;
        int currLen=1;
        int start=0;
        int bestStart=0;

        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                currLen++;
            }else{
                currLen=1;
                start=i;
            }
            if(currLen>maxLen){
                maxLen=currLen;
                bestStart=start;
            }
        }
        System.out.println("Do dai: "+ maxLen);
        System.out.print("Doan tang dai nhat: ");
        for(int i=bestStart;i<bestStart+maxLen;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nTu vi tri: "+ bestStart+ " den " + (bestStart+maxLen-1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        timDoanTang(a,n);
    }
}
