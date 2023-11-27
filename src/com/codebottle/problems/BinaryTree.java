package com.codebottle.problems;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	public Node root;
		
	public class Node
	{
	    int data;
	    public Node left, right;

	    public Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	
	public int height(Node node) 
    {
        int height = 1;
        Queue<Node> q = new LinkedList<>();
        node.data = 1;
        q.add(node);
        
        while(! q.isEmpty()) {
            Node temp = q.peek();
            if(temp.left != null) {
                temp.left.data = temp.data + 1;
                if(temp.left.data > height) {
                    height = temp.left.data;
                }
                q.add(temp.left);
            }
            if(temp.right != null) {
                temp.right.data = temp.data + 1;
                if(temp.right.data > height) {
                    height = temp.right.data;
                }
                q.add(temp.right);
            }
            q.remove();
        }
        
        return height;
    }
	
	public int height2(Node node) {
		
		// if node is null height is 0;
		// Max of (height of left tree , height of right tree) + 1;			
		
		if(node == null)
			return 0;
	       
		return Math.max(height(node.left), height(node.right)) + 1;
	}
	
}