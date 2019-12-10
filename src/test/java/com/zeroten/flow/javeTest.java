package com.zeroten.flow;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Scanner;

public class javeTest {

    @Test
    //吸血鬼
    public void javaTest3() {

        String[] arryTotal=new String[0];
        for (int i=1000;i<=9999;i++){
            //千位上的数字
            int a=i/1000;
            //百位上的数字
            int b=i/100%10;
            //十位上的数字
            int c=i/10%10;
            //个位上的数字
            int d=i%10;
            int[] arry=new int[4];
            arry[0]=a;
            arry[1]=b;
            arry[2]=c;
            arry[3]=d;
           // System.out.println(Arrays.toString(arry));
            for(int j=0;j<arry.length-1;j++){
                for (int k=j+1;k<arry.length;k++){
                    String s1=String.valueOf(arry[j])+String.valueOf(arry[k]);
                    String s2="";
                    if( k<arry.length-1){
                        s2=String.valueOf(arry[k+1])+String.valueOf(arry[6-(2*k+1)-j]);
                    }
                    if(j==0 && k==arry.length-1){
                        s2=String.valueOf(arry[k-1])+String.valueOf(arry[j+1]);
                    }
                    if(j!=0 && k==arry.length-1){
                        s2=String.valueOf(arry[k-j])+String.valueOf(arry[arry.length-1-k]);
                    }
                    int l1=Integer.valueOf(s1);
                    int l2=Integer.valueOf(s2);
                    if(l1*l2==i) {
                       //判断吸血鬼数字是否已经存在
                        int num=0;
                        for(int n=0;n<arryTotal.length;n++){
                            if (arryTotal[n].contains(String.valueOf(i))){
                               num++;
                            }
                        }
                        //不存在继续添加吸血鬼数字
                        if(num==0){
                            arryTotal=Arrays.copyOf(arryTotal,arryTotal.length+1);
                            arryTotal[arryTotal.length-1]=String.valueOf(i)+"="+s1+"*"+s2;
                        }
                    }
                }

            }
        }
        System.out.println("吸血鬼数字应该有" + arryTotal.length+"个");
        System.out.println("吸血鬼数字是" + Arrays.toString(arryTotal));
    }



    @Test
    //回文数
    public void javaTest4(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入数字：");
        int num=scanner.nextInt();
        boolean flag=false;
        String str =String.valueOf(num);
        String mun="";
        if(num<0){
            StringBuffer sb = new StringBuffer();
            char[] ch = str.toCharArray();
            for(int j=ch.length-1; j>=0; j--){
                sb.append(ch[j]);
            }
            mun=sb.toString();
        }
        if(num>0 ){
            for (int i=0;i<str.length();i++){
                char S1= str.charAt(0);
                char S2= str.charAt(str.length()-1);
                int Ts1=Integer.parseInt(String.valueOf(S1));
                int Ts2=Integer.parseInt(String.valueOf(S2));
                if(i<str.length()-1-i){
                    if(Ts1!=Ts2){
                        StringBuffer sb = new StringBuffer();
                        char[] ch = str.toCharArray();
                        for(int j=ch.length-1; j>=0; j--){
                            sb.append(ch[j]);
                        }
                        mun=sb.toString();
                        break;
                    }
                    if(Ts1==Ts2){
                        flag=true;

                    }
                }else {
                    break;
                }
            }
        }

        if(!flag){
            System.out.println("输入数字为："+num);
            System.out.println("输出为："+flag);
            System.out.println("解释：从左向右读为："+num+"。"+"从右向左读为："+mun+"."+"因此它不是回文数");
        }else {
            System.out.println("输入数字为："+num);
            System.out.println("输出为："+flag);
        }

    }


}
