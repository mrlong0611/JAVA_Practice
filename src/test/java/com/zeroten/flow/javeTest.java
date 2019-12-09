package com.zeroten.flow;

import netscape.javascript.JSObject;
import org.testng.annotations.Test;

import java.sql.Array;
import java.util.Arrays;

public class javeTest {

    @Test
    //吸血鬼练习题
    public void test3() {
        int num=0;
        int[] arryTotal=new int[0];
        for (int i=1000;i<=9999;i++){

            //千位上的数字
            int a=i/1000;
            //百位上的数字
            int b=i/100%10;
            //十位上的数字
            int c=i/10%10;
            //个位上的数字
            int d=i%10;
        //    System.out.println("千位上的数字:"+a+" "+"百位上的数字:"+b+" "+"十位上的数字:"+c+" "+"个位上的数字:"+d);

            int[] arry=new int[4];
            arry[0]=a;
            arry[1]=b;
            arry[2]=c;
            arry[3]=d;
           // System.out.println(Arrays.toString(arry));

            for(int j=0;j<arry.length;j++){

                for (int k=j+1;k<arry.length;k++){
                    String s1=String.valueOf(arry[j])+String.valueOf(arry[k]);
                    String s2=String.valueOf(arry[arry.length-1-j])+String.valueOf(arry[arry.length-1-k]);
                  //  System.out.println("s1="+s1);
                  //  System.out.println("s2="+s2);
                  //  System.out.println("arry[j]="+arry[j]+" "+"arry[k]="+arry[k]+" "+"arry[arry.length-j]="+arry[arry.length-1-j]+" "+"arry[arry.length-k]="+arry[arry.length-1-k]);
                    int l1=Integer.valueOf(s1);
                    int l2=Integer.valueOf(s2);
                    if(l1*l2==i) {
                        num += 1;
                        arryTotal=Arrays.copyOf(arryTotal,arryTotal.length+1);
                        arryTotal[arryTotal.length-1]=i;
                        /*System.out.println("i=" + i);
                        System.out.println("s1=" + s1);
                        System.out.println("s2=" + s2);*/
                    }

                }

            }


        }

        System.out.println("吸血鬼是数字应该有" + num+"个");
        System.out.println("吸血鬼是数字是" + Arrays.toString(arryTotal));
    }


}
