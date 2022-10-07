package com.pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Product {
	
	public static int  price,sum;
	public static void display() {
		Scanner sn=new Scanner(System.in);
		System.out.println("===========WELCOME TO MART===========");
		System.out.println("1.Electronic\n2.bath\n3.kitchen\n4.cloths");
		System.out.println(" please select u r section");
		int v=sn.nextInt();
		if (v==1) {
			electronic();
			method1();	
		}
		else if(v==2) {
			bath();
			method2();
		}
		else if(v==3) {
			kitchen();
			method3();
		}
		else if(v==4) {
			cloth();
			method4();
		}
		else {
			System.out.println(" invalid selection");
		}
	}
	
	public static void electronic() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");	
		
		Statement st =con.createStatement();
		
		ResultSet rs=st.executeQuery("SELECT * FROM product.electronic");
		System.out.println("==========WELL-COME==========");
	  	   System.out.println("----u r selected electroic section----");
	  	   System.out.println("ID    NAME          PRICE    QUANTITY");
	  	   System.out.println("----------------------------------------");
		 
	       while(rs.next()) {
	    	   
	    	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
	       }
	} 
	catch (Exception e) {
		System.out.println(e);
		// TODO: handle exception
	}
}
	public static void method1() {
		try {
			Scanner s=new Scanner(System.in);
		       System.out.println("enter product id");
		       int a=s.nextInt();
		       System.out.println("enter the quantity");
		       int b=s.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");	
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM product.electronic where id='"+a+"'");
		       while(rs.next()) {
		    	   int c=rs.getInt(3);
		    	   price=c*b;
		    	   sum+=price;
		    	   
		    	  
		       }
		       continue1();
		       
		} 
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
	public static void bath() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");	
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from  bath");
			 System.out.println("==========WELL-COME==========");
		  	   System.out.println("----u r selected bath section----");
		  	   System.out.println("ID   NAME            PRICE   QUANTITY");
		  	   System.out.println("----------------------------------------");
		       while(rs.next()) {
		    	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		       }
		      
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void method2() {
		try {
			 Scanner s=new Scanner(System.in);
		       System.out.println("enter product id");
		       int a=s.nextInt();
		       System.out.println("enter the quantity");
		       int b=s.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");	
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from  bath where id='"+a+"'");
			
		       while(rs.next()) {
		    	   int c=rs.getInt(3);
		    	   price=c*b;
		    	   sum+=price;
		    	   
		    	   
		       }
		       continue1();
		     
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void kitchen() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");	
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from  kitchen");
			System.out.println("==========WELL-COME==========");
		  	   System.out.println("----u r selected kitchen section----");
		  	   System.out.println("ID   NAME        PRICE   QUANTITY");
		  	   System.out.println("----------------------------------------");
		       while(rs.next()) {
		    	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		       }
		      
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void method3() {
		try {
			 Scanner s=new Scanner(System.in);
		       System.out.println("enter product id");
		       int a=s.nextInt();
		       System.out.println("enter the quantity");
		       int b=s.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");	
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from  kitchen where id='"+a+"'");
			
		       while(rs.next()) {
		    	   int c=rs.getInt(3);
		    	   price=c*b;
		    	   sum+=price;
		    	   
		    	   
		       }
		       continue1();
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void cloth() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");	
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from cloth");
			System.out.println("==========WELL-COME==========");
		  	   System.out.println("----u r selected cloth section----");
		  	   System.out.println("ID   NAME     PRICE   QUANTITY");
		  	   System.out.println("----------------------------------------");
		       while(rs.next()) {
		    	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		       }
		      
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void method4() {
	try {
		Scanner s=new Scanner(System.in);
	       System.out.println("enter product id");
	       int a=s.nextInt();
	       System.out.println("enter the quantity");
	       int b=s.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");	
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from cloth where id='"+a+"'");
		
	       while(rs.next()) {
	    	   int c=rs.getInt(3);
	    	   price=c*b;
	    	   sum+=price;


	       }
	       continue1();
	      
	} 
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
	public static void continue1() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1 for continue    enter  2 for exit");
	int i = s.nextInt();
	if(i==1)
	{
		display();
	}
	else
	{
		System.out.println("=========Thank you===========");
	}
		
	}
	public static void main(String[]args) {
		Product p=new Product();
		display();
System.out.println("TOTAL BILL="+sum+"/-");
	}
}


