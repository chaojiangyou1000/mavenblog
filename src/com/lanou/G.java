package com.lanou;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @author xalo
 * @ time2017-05-13
 */

public class G {
	/*
	 * 主函数
	 */
              public static void main(String[] args) {
            	  //创建对象
				            HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
				            //创建对象
				            Random random=new Random();
				            //用for循环控制随机数个数
				            for (int i = 0; i < 10; i++) {
				            	//获取随机数
								    int B=random.nextInt(45)%(45-23+1)+23;
								    //添加随机数到集合类中
								    hashMap.put(i, B);							    
							}
				            //定义中间变量
				            int U=22;
				            int X=46;
				            //用对象调用方法获取键值对集合
				            Set<Entry<Integer,Integer>>entry=hashMap.entrySet();
				            //用foeeach循环获取键值对集合
				            for (Entry<Integer, Integer> entry1 : entry) {
				            	//用键值对对象获取value值
								    int Y=entry1.getValue();
								    System.out.println(Y);
								    //用三元运算符分别获取最大值和最小值
								    U=Y>U?Y:U;
				                    X=Y<X?Y:X;
							}
				            System.out.println("最大值为："+U);
				            System.out.println("最小值为："+X);
				            
			}

	
}
