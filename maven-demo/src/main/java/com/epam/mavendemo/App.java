package com.epam.mavendemo;
import choclate.*;
import sweets.*;
import brand.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String str="BRAND\n  |--munch\n |--perk\nCHOCLATE\n |--milk choclate\n |--dark choclate\n |--white choclate\nSWEETS\n |--kalakand\n |--burfi\n |--basundi\n";
        int choice=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("-----------WELCOME TO HALWAI SWEETS----------");
        System.out.println("*********************************************");
        do {
        	System.out.println("enter choice");
        	System.out.println("1:display menu\n2:display basket\n3:exit");
        	choice=sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		System.out.println(str);
        		break;
        	case 2:
        		int c;
        		int totalcost=0;
        		System.out.println("enter basket you want to buy:\n1.New Years Basket\n2.Choclate Basket\n3.Sweets Basket");
        		c=sc.nextInt();
        		switch(c) {
        		case 1:
        			ArrayList<Object> NewYearsBasket=new ArrayList<Object>();
        			NewYearsBasket.add(new munch());
        			NewYearsBasket.add(new munch());
        			NewYearsBasket.add(new perk());
        			System.out.println(NewYearsBasket);
        			System.out.println("cost : 200");
        			break;
        		case 2:
        			ArrayList<Object> ChoclateBasket=new ArrayList<Object>();
        			ChoclateBasket.add(new darkChoclate());
        			ChoclateBasket.add(new milkChoclate());
        			ChoclateBasket.add(new whiteChoclate());
        			System.out.println(ChoclateBasket);
        			System.out.println("cost : 500");
        			break;
        		case 3:
        			ArrayList<Object> SweetsBasket=new ArrayList<Object>();
        			SweetsBasket.add(new kalakand());
        			SweetsBasket.add(new burfi());
        			SweetsBasket.add(new basundi());
        			System.out.println(SweetsBasket);
        			System.out.println("cost : 700");
        			break;
        		}
        	}
        	
        }while(choice !=3);
        
    }
}
