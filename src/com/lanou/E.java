package com.lanou;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author xalo
 * @ time 2017-05-13
 */
public class E {
            public static void main(String[] args) {
				           HashSet<Integer> hashSet=new HashSet<Integer>();
				           for (int i = 0; i < 10; i++) {
							          System.out.print(i*10+".");
							          hashSet.add(i*10);
						  }
				         
//				          for (Integer str : hashSet) {
//				        	           System.out.println();
//							       System.out.print(str+".");						     
//						}
				           
				           //用hashSet调用方法获取迭代器对象
//				          Iterator<Integer> iterator=hashSet.iterator();
//				          //用while循环判断是否有下一个
//				           while(iterator.hasNext()){			        	  
//				        	               int D=iterator.next();
//				        	               System.out.println();
//				        	               System.out.print(D+".");
//				           }
				           
				             hashSet.remove(20);
				             hashSet.remove(30);
//				             for (Integer sto : hashSet) {
//				            	       System.out.println();
//								   System.out.print(sto+".");
//							}
				              
				              Iterator<Integer>iterator1=hashSet.iterator();
				              while(iterator1.hasNext()){
				            	            int S=iterator1.next();
				            	            System.out.println();
				            	            System.out.print(S+".");
				              }
				           
				           
			}
}
