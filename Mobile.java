package cn;

import java.util.Scanner;

public class Mobile {
    public static void main(String[] args) {
        System.out.println("请输入4家店的价格");
        Scanner input=new Scanner(System.in);
        int num[]=new int[4];

        for (int i=0;i<num.length;i++){
            System.out.print("第"+(i+1)+"家店的价格：");
            num[i]=input.nextInt();
        }
        int min=num[0];
        for (int a=1;a<num.length;a++){
            if (num[a]<min){
                min=num[a];
            }
        }
        System.out.print("最低的价格是："+min);
    }





}
