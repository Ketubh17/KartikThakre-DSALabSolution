package com.dsaproject1;

import java.util.Scanner;
import java.util.Stack;

public class BinaryTree 
{
	
    static class Node
    {
          int data;
          Node left, right;
           
    	
    }
    
    static Node NewNode(int data )
    {
           Node node = new Node();
           node.data =data;
           node.left =null;
           node.right=null;
           return node;
    }
      
    
    
    static Node insert (Node root, int key)
    {
    	if(root == null)
    	    return NewNode(key);
    	if( key < root.data )
    	{
    		root.left = insert(root.left, key);
    	}
    	else
    	{
    		root.right =insert(root.right,key);
    		
    	}
    		
    	return root;
    }

    static boolean findPair(Node root ,int key , Stack<Integer> stack)
    {
    	
    	if(root == null)
    		return false;
    	
    	if(findPair(root.left ,key , stack))
    		return true;
    	if (stack.contains(key - root.data))
    	{
    		System.out.println("Pair does match"+ "("+(key - root.data)+","+root.data+")");
    	}
    	else
    	{
    		
    		stack.add(root.data);
    	}
    	
    	return findPair(root.right ,key,stack);
    }
    
    
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the sum value");
    	int sum = scan.nextInt();
    	Node root =null;
    	root = insert(root, 40);
        root = insert(root, 20);
        root = insert(root, 60);
        root = insert(root, 10);
        root = insert(root, 30);
        root = insert(root, 50);
        root = insert(root, 70);
        Stack<Integer> stack =new Stack<Integer>();
        
        findPair(root,sum , stack);
       
    }

}
