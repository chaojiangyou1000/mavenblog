package com.lanou;
import java.util.Random;

/**
 * // 1.随机产生20个10到100的整数存入数组中，求最大值，最小值，平均值和元素之和
 * @author xalo
 *  @ time 2017-05-13
 *  
 */
public class A {
	/*
	 * 主函数
	 */
              public static void main(String[] args) {
				            int array[ ] =new int[20];
				            Random random=new Random();
				            for (int i = 0; i < 20; i++) {
								   int A=random.nextInt(100)%(100-10+1)+10;
								   array[i]=A;		
								   System.out.print(array[i]+".");
							}
				           int max=10;
				           int mix=101;
				           int sum=0;
				           int avg=0;
				           for (int j = 0; j < array.length; j++) {
							       max=max<array[j]?array[j]:max;						      					       
							       mix=mix>array[j]?array[j]:mix;	
							       sum+=array[j];
							       avg=sum/20;
						   }
				           System.out.println();
				           System.out.println("最大值为："+max);	
				           System.out.println("最小值为："+mix);
				           System.out.println("元素之和为："+sum);
				           System.out.println("平均值为："+avg);
			}
}
