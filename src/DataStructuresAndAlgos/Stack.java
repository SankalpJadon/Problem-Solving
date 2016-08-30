package DataStructuresAndAlgos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Stack {
	int top=-1;
	int[] stackArray;
	int stackSize;
	Stack(int size){
		stackSize=size;
		stackArray= new int[size];
		Arrays.fill(stackArray, -1);
	}
	
	public void push(int num){
		if(stackArray[stackSize-1]==-1){
			for(int i=0;i<stackSize;i++){
				if(stackArray[i]==-1){
					stackArray[i]=num;
					break;
				}
			}
			top=num;
			System.out.println(num+" successfully pushed in the stack!");
		} else{
			System.out.println("Sorry stack is full! ");
		}
		
	}
	
	public void pop(){
		int elementPopped=0;
		if(stackArray[0]==-1){
			System.out.println("Stack is already empty! ");
		}
		else{
			for(int i=stackSize-1;i>=0;i--){
				if(stackArray[i]!=-1){
					elementPopped=stackArray[i];
					stackArray[i]=-1;
					break;
				}
				break;
			}
		}
		System.out.println("Element "+elementPopped+" successfully popped out of stack!");
	}
	
	public void search(int num){
		for(int i=0;i<stackSize;i++){
			if(stackArray[i]==num){
				System.out.println(num+" found at "+i+" index!");
				break;
			}
			else{
				System.out.println("Element could not be found!");
				break;
			}
		}
	}
	
	public void peek(){
		System.out.println("Top most element is "+top);
	}
	
	public void empty(){
		for(int i=0;i<stackSize;i++){
			stackArray[i]=-1;
		}
		System.out.println("Stack emptied!");
	}
	
	public void display(){
		System.out.println(Arrays.toString(stackArray));
	}
	
	public static void main(String args[]){
		System.out.println("Enter stack size: ");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		Stack stack= new Stack(size);
		int cont=1;
		while(cont==1){
		System.out.println("Select the operation: ");
		System.out.println("Enter 1 to push ");
		System.out.println("Enter 2 to pop ");
		System.out.println("Enter 3 to search the stack ");
		System.out.println("Enter 4 to peek ");
		System.out.println("Enter 5 to empty the stack ");
		System.out.println("Enter 6 to print the stack ");
		int input= sc.nextInt();
		switch(input){
		
			case 1:
				System.out.println("Enter the number to be pushed: ");
				int num= sc.nextInt();
				stack.push(num);
				break;
				
			case 2:
				num= sc.nextInt();
				stack.pop();
				break;
				
			case 3:
				System.out.println("Enter the number to be searched: ");
				num=sc.nextInt();
				stack.search(num);
				break;
				
			case 4:
				stack.peek();
				break;
			
			case 5:
				stack.empty();
				break;
				
			case 6:
				stack.display();
				break;
		}
		System.out.println("Do you want to continue? ");
		cont= sc.nextInt();
	}
	}

}
