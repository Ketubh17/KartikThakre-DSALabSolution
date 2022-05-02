package com.dsaproject;
import java.util.Scanner;
import java.util.Stack;
public class Main {
	
	static boolean string(String ch)
	{
		Stack<Character> stack = new Stack<Character>();
	    
		for (int i =0; i < ch.length();i++)
		{
			char a =ch.charAt(i);
		    
		    if(a == '(' || a =='{' || a =='[' )
		    {
		    	stack.push(a);
		    }
		    if(a == ')' || a == '}' || a ==']')
		    {
		    	if(stack.isEmpty())
		    		return false;
		    	stack.pop();
		    }
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
          Scanner scan =new Scanner(System.in);
          System.out.println("Enter the string");
          String ch = scan.nextLine();
          //System.out.println(ch);
          if (string(ch))
          {
        	  System.out.println("Entered string is Balanced String");
          }
          else
          {
        	  System.out.println("Entered string is Unbalanced String");
          }
	}

}
