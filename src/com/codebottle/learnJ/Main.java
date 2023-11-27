package com.codebottle.learnJ;

import java.lang.Math;
import com.codebottle.problems.*;

public class Main {

	public static void main(String[] args) {
		
//		Stack<Integer> stack = new Stack<Integer>();
//		
//		stack.push(10);
//		stack.push(20);
//		
//		System.out.println(stack.peek());
//		
//		stack.push(30);
//		
//		System.out.println(stack.isEmpty());
//		
//		System.out.println(stack.peek());
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		
//		System.out.println(stack.isEmpty());
		
		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		list.append(100);
//		list.append(200);
//		list.append(300);
//		list.append(400);
//		list.append(500);
//		
//		list.print();

//		System.out.println(getFirstSetBit(4));
//		System.out.println(getFirstSetBit(0));
//		System.out.println(getFirstSetBit(1));
//		System.out.println(getFirstSetBit(2));
//		System.out.println(getFirstSetBit(3));
//		
//		System.out.println(getFirstSetBit(18));
//		System.out.println(getFirstSetBit(12));
		
//		Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int[] arr = new int[N];       
//        
//        for(int i = 0; i < N; i++) {
//        	arr[i] = scanner.nextInt();
//        }
//        scanner.close();       
//        
//        for(int i = N - 1; i >= 0; i--) {
//            System.out.println(arr[i]);
//        }
		
		//findLargest(3,10);
		
//		Polynomial poly = new Polynomial();
//		
//		int[][] data = {{1,2},{3,1},{10,0}};
//		poly.Create(data);
//		poly.Print();
		
//		BinaryTree bt = new BinaryTree();
//		bt.root = bt.new Node(1);
//		bt.root.left = bt.new Node(2);
//		bt.root.right = bt.new Node(3);
//		
//		bt.height2(bt.root);	
		
		//int sum = maxSubArray(new int[] {-10,-5,-2});
		
		//pushZerosToEnd(new int[] {3, 5, 0, 0, 4}, 5);
		//pushZerosToEnd(new int[] {0, 0 , 0, 4}, 4);
		//pushZerosToEnd(new int[] {0, 4, 0, 4, 0, 4}, 6);
		
		shortestCommonSupersequence();
		
	}
	
	public static int getFirstSetBit(int n) {
		int index  = 0;
		if(n == 0 || n == 1) {
			return n;	
		}				
		else {
			while(n / 2 >= 0) {
				if(n % 2 == 1)
					return ++index;
				n = n / 2;
				++index;
			}
		}		
		return 0;		
	}
	
	public static int findLargest(int N, int S){
        int max = 0;
        for(int i = N - 1; i >= 0; i--) {
            max = max + (int) Math.pow(10, i) * 9;
        }
        
        
        for(int j = max; j > 0; j--) {
        	
        }
        
        
        
        
        return 0;        
    }

	public static int maxSubArray(int[] nums) {
		
		int max_sum = Integer.MIN_VALUE;
        int temp_sum = 0;        
        
        for(int num : nums) {
        	temp_sum = temp_sum + num;
        	if(temp_sum < num) {
        		temp_sum = num;
        	}
        	if(max_sum < temp_sum) {
        		max_sum = temp_sum;
        	}
        }
        
        return max_sum;
    }
	
	//4 0 4 0 4 0
	//    i	
	public static void pushZerosToEnd(int[] arr, int n) {
		boolean zeroPointer = false;
        int zeroIndex = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0 && zeroPointer == false) {
            	zeroIndex = i;
            	zeroPointer = true;
            }
            if(zeroPointer && arr[i] > 0) {
            	arr[zeroIndex] = arr[i];
            	arr[i] = 0;
            	zeroIndex++;
            	if(arr[zeroIndex] == 0)
            		zeroPointer = true;
            }
            
        }
    }
	
	public static int shortestCommonSupersequence()
    {
		String X = "QNOWbWpEjeAYZxvcEzjtonywGWbPpuosybfDHvXRWbRtljDo";
		String Y = "iXdpkntZpfEkAVyehadHOwk";
		int m = 48;
		int n = 23;
        char c1;
        
        for(int i = 0; i < m; i++) {
            c1 = X.charAt(i);
            for(int j = 0; j < n; j++) {
                if(c1 == Y.charAt(j)) {
                    Y = Y.replaceFirst(Character.toString(Y.charAt(j)), "");
                    n--;
                    break;
                }
            }
        }
        
        return X.length() + Y.length();
    }
	
}
