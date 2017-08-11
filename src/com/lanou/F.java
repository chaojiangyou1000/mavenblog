package com.lanou;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.SynchronousQueue;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * 
 * @author xalo
 * @ time 2017-05-13
 */
public class F {
	/*
	 * 主函数
	 */
              public static void main(String[] args) {
				            HashMap<Integer,String>hashMap=new HashMap<Integer,String>();
				            for (int i = 0; i < 10; i++) {
								    System.out.print((i+2)+".");
								    hashMap.put(i, i+2+" ");
							}
				            //用hashMap调用方法，获取键值对的set集合
//				            Set<Entry<Integer,String>>entry=hashMap.entrySet();
//				            //用foreach循环遍历
//				            for (Entry<Integer, String> entry2 : entry) {
//				            	//用键值对对象获取value值
//				            	        String W=entry2.getValue();
//								     System.out.println("Value"+":"+W);
//								     //用键值对对象获取key值
//								     int H=entry2.getKey();
//								     System.out.println("key"+":"+H);
//								     System.out.println(H+":"+W);
//							}
				                
				                 hashMap.put(1,"集合");                       //修改集合中的一个数据
//				                 Set<Entry<Integer,String>>entry=hashMap.entrySet();
//				                 for (Entry<Integer, String> entry2 : entry) {
//									       String F=entry2.getValue();
//									       int Q=entry2.getKey();
//									       System.out.println();
//									       System.out.print(Q+":"+F);								       
//								}
				               //删除集合中的任意两个数据，
				                hashMap.remove(6);                   //通过删除其key值来删除
				                hashMap.remove(4);
				                Set<Entry<Integer,String>>entry3=hashMap.entrySet();
				                for (Entry<Integer, String> entry4 : entry3) {
									       String K=entry4.getValue();
									       int M=entry4.getKey();
									       System.out.println();
									       System.out.print(M+":"+K);
								}
				            
				            
				            
				            
			}
}
