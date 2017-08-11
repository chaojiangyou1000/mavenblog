package com.lanou;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * 
 * @author xalo
 *  @ time 2017-05-13
 */
public class D {
              public static void main(String[] args) {
				            ArrayList<String> arraylist=new ArrayList<String>();
				            Random random=new Random();
				            for (int i = 0; i < 10; i++) {
								    int number=random.nextInt(100)%(100-10+1)+10;
								    String num=number+" ";
								    arraylist.add(num);
								    //System.out.println(arraylist.get(i));
							}
				            //for 循环
//				            for (int j = 0; j < arraylist.size(); j++) {
//								    System.out.print(arraylist.get(j)+".");
//							}
				            //froeach遍历
//				            for (String str : arraylist) {
//								   System.out.print(str+".");							   
//							}
				            //用迭代器遍历
				           Iterator<String>iterator= arraylist.iterator();                     //获取迭代器对象
				           while(iterator.hasNext()){
				        	              String str= iterator.next();
				        	              System.out.print(str+".");
				           }
				           
//				           arraylist.set(1, "你好笨");                     //修改下标为1的位置的数据，改成”你好笨“
//				           for (String str1 : arraylist) {
//				        	           System.out.println();
//							       System.out.print(str1+".");
//						}
				           
//				           Iterator<String>iterator1=arraylist.listIterator();
//				           while(iterator1.hasNext()){
//				        	                   String L=iterator1.next();
//				        	                   System.out.println();
//				        	                   System.out.print(L+".");
//				           }
//				           
				               
				               //  arraylist.remove(2);                                 //删除下标为2的数据，并遍历
//				                for (String strin : arraylist) {
//				                	        System.out.println();
//									    System.out.print(strin+".");
//								}
				                 
//				                 Iterator<String>iterator2=arraylist.iterator();
//				                 while(iterator2.hasNext()){
//				                	            String y= iterator2.next();
//				                	            System.out.println();
//				                	            System.out.print(y+".");
//				                 }
//				           
				                       
				                    arraylist.add(3, "我真的好笨");                     //向指定位置插入(添加)数据
				                     for (String st : arraylist) {
										    System.out.println();
										    System.out.println(st+".");
									}
				               
//				                        Iterator<String> iterator3=arraylist.iterator();
//				                        while(iterator3.hasNext()){
//				                        	            String J=iterator3.next();
//				                        	            System.out.println();
//				                        	            System.out.println(J+".");
//				                        }
				                  
				                        int b=arraylist.indexOf("我真的好笨");
				                        System.out.println(b);
				           
				           
			}
}
