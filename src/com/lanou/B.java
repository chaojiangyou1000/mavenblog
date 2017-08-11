package com.lanou;
import java.util.HashMap;
import java.util.Set;

//创建两种异常，并处理，捕获异常并给用户提示
public class B {
	/*
	 * 主函数
	 */
				public static void main(String[] args) {
					         //数组越界异常
					       int [] array={1,3,5,7,0,2};
					       //类型转换异常
					       HashMap<String,String> hashMap=new HashMap<>();
					       //空指针异常
					       //int j=(Integer) null;
					       //算数异常
					       //int f=5*0;
				
					       
		    //数组越界异常			       
//					       try {
//							       array[6]=5;
//						} catch (ArrayIndexOutOfBoundsException e) {
//							   System.out.println("数组越界异常");
//							   //捕获异常信息
//							   String ju=e.getMessage();
//							   System.out.println(ju);
//							   
//						}
					       
					       
	  //类型转换异常				       
//					         try {
//								     Set<String> set=(Set<String>) hashMap;
//							} catch (ClassCastException e) {
//							        System.out.println("类型转换异常");
//							        String ko=e.getMessage();
//							        System.out.println(ko);
//							}
					       
					       
					       
	//空指针异常
					       
//					          try {
//								       int m=(Integer)null;							       
//							} catch (NullPointerException e) {
//							            System.out.println("空指针异常");
//							            String po=e.getMessage();
//							            System.out.println(po);
//							}
					       
					       
		//算数异常
					       
//					          try {
//								      int t=7/0;
//							} catch (ArithmeticException e) {
//						              System.out.println("算数异常");
//						              String ty=e.getMessage();
//						              System.out.println(ty);
//							}
//					       
					       
					       
					       
					       
					       
				}
}
