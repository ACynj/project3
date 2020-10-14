package project3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//7.34
	/*public static String sort(String s) {
		char []str=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			str[i]=s.charAt(i);
		}
		Boolean flag=true;
		for(int i=s.length()-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(str[j]>str[j+1]) {
					char tmp=str[j];
					str[j]=str[j+1];
					str[j+1]=tmp;
					flag=false;
				}
			}
			if(flag)break;
		}
		return new String (str);
	}
	*/
	/*public static int[] merge (int [] list1 ,int []list2 ) {
		int [] list=new int[list1.length+list2.length];
		//x1表示list1的光标，x2表示list2的光标
		int x1=0,x2=0;
		int x=0;
		//当光标超出对应数组的范围时，跳出循环
		while(x1<list1.length&&x2<list2.length) {
			if(list1[x1]<list2[x2]) {
				list[x++]=list1[x1++];
			}
			else if(list1[x1]>=list2[x2]) {
				list[x++]=list2[x2++];
			}
		}
		if(x1<list1.length) {
			for(int i=x1;i<=list1.length-1;i++) {
				list[x++]=list1[i];
			}
		}
		else if(x2<list1.length) {
			for(int i=x2;i<=list2.length-1;i++) {
				list[x++]=list2[i];
			}
		}
		return list;
	}
*/
	public static void main(String[] args) {
		//p241 7.3
		/*int []times=new int [120];
		int x;
		Scanner in = new Scanner (System.in);
		while(true) {
			 x=in.nextInt();
			if(x==0)break;
			times[x]++;			
		}
		for(int i=0;i<=99;i++) {
			if(times[i]>1)
		System.out.println(i+" occurs "+times[i]+"times");
			else if(times[i]==1) {
				System.out.println(i+" occurs "+times[i]+"time");
			}
		}
		*/
		//p241 7.5
		/*Scanner in = new Scanner(System.in);
		//定义输入的数
		int input;
		//新数保存数组
		int []x=new int [12];
		int j=0;
		boolean flag=false;
		for(int i=0;i<10;i++) {
			input=in.nextInt();
			for(int z=0;z<j;z++) {
				if(x[z]==input) {
					flag=true;
					break;
				}
				else {
					flag=false;
				}
				
			}
			if(!flag) {
				x[j]=input;
				j++;
			}
		}
		System.out.println("The number of distinct numbers is "+j);
		System.out.print("The number of distinct numbers are ");
		for( int i=0;i<j;i++) {
			System.out.print(x[i]+" ");
		}
		*/
		
		
		//p243 7.17
		/*Scanner in =new Scanner(System.in);
			System.out.println("请输入学生的人数:");
			int number=in.nextInt();
			System.out.println("请输入学生的名字:");
			String [] name=new String[100];
			for(int i=0;i<number;i++) {
				name[i]=in.next();
			}
			System.out.println("请输入学生的成绩:");
		    Double []grade=new Double[100];
		    for(int i=0;i<number;i++) {
		    	grade[i]=in.nextDouble();
		    }
		    //冒泡排序
		    //一共要j-1次排序
		    Boolean flag=false;
		    for(int i=number-1;i>=0;i--) {
		    	//将前后大小位置不是降序的元素调换
		    	for(int j=0;j<i;j++) {
		    		if(grade[j]<grade[j+1]) {
		    			//交换元素
		    			Double tmp=grade[j+1];
		    			grade[j+1]=grade[j];
		    			grade[j]=tmp;
		    			String temp=name[j+1];
		    			name[j+1]=name[j];
		    			name[j]=temp;
		    			flag=true;
		    		}
		    	}
		    	if(!flag)break;
		    }
		for(int i=0;i<number;i++) {
			System.out.println(name[i]+" "+grade[i]);
		}
		*/
		
		
		//p243 7.18冒泡排序
		/*Double []A=new Double[12];
		Boolean flag=false;
		Scanner in =new Scanner (System.in);
		int number =in.nextInt();
		for(int  i=0;i<number;i++) {
			A[i]=in.nextDouble();
		}
		for(int i=number-1;i>=0;i--) {
	    	//将前后大小位置不是降序的元素调换
	    	for(int j=0;j<i;j++) {
	    		if(A[j]<A[j+1]) {
	    			//交换元素
	    			Double tmp=A[j+1];
	    			A[j+1]=A[j];
	    			A[j]=tmp;
	    			
	    			flag=true;
	    		}
	    	}
	    	if(!flag)break;
	    }
		for(int i=0;i<number;i++)
		System.out.print(A[i]+" ");
		*/
		//p243 7.19
		/*Scanner in=new Scanner(System.in);
		Double []list=new Double [1000];
		Boolean issort=true;
		System.out.println("Enter the size of the list:");
		int number=in.nextInt();
		System.out.println("Enter the list");
		for(int i=0;i<number;i++) {
			list[i]=in.nextDouble();
		}
		for(int i=number-1;i>=0;i--) {
			for(int j=0;j<i;i++) {
				if(list[j]>list[j+1]) {
					issort=false;
					break;
				}
				
			}
			if(issort==true) {
				break;
			}
		}
		System.out.println("The list has "+number+" integers"+" ");
		for(int i=0;i<number;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		System.out.println(issort?"The list is already sorted":"The list is not sorted");
		*/
		
		
		//p243 7.23
		/*Scanner in=new Scanner (System.in);
		Boolean []L=new Boolean [100];
		for(int i=0;i<100;i++) {
			L[i]=false;
		}
		for(int i=0;i<100;i++) {
			for(int j=i;j<100;j+=(i+1)) {
				L[j]=!L[j];
			}
		}
		for(int i=0;i<100;i++) {
			if(L[i]) {
				System.out.print("第"+(i+1)+"个储物柜开着"+" ");
			}
		}
		*/
		
		
		//p245 7.31
	/*	Scanner in= new Scanner (System.in);
		System.out.println("Enter list1 size and contents:");
		int number1=in.nextInt();
		int []list1=new int [number1];
		for(int i=0;i<number1;i++)
		list1[i]=in.nextInt();
		System.out.println("Enter list2 size and contents:");
		int number2=in.nextInt();
		int []list2=new int [number2];
		for(int i=0;i<number2;i++)
		list2[i]=in.nextInt();
		System.out.println(list1.length+" "+list2.length);
		int []list=merge(list1,list2);
	
		System.out.print("The list1 is ");
		for(int i=0;i<number1;i++)
		System.out.print(list1[i]+" ");
	
		
		System.out.print("The list2 is ");
		for(int i=0;i<number2;i++)
		System.out.print(list2[i]+" ");
		
		
		System.out.print("The merged list is ");
		for(int i=0;i<list1.length+list2.length;i++)
		System.out.print(list[i]+" ");
		*/
		
		//7.24
		/*
		String []x= {"Spades","Clubs","Hearts","Diamonds"};
		String []y= {"1","2","3","4"};
		int []z=new int[4];
		int count=0;
		
		int sum=0;
		while(sum!=4) {
			Boolean flag=true;
			int number=(int)(Math.random()*13+1);
		  int color=(int)(Math.random()*4);
		  for(int i=0;i<4;i++) {
			  if(x[color].compareTo(y[i])==0) {
				  flag=false;
				  break;
			  }
		  }
		  
			if(flag) {
				z[sum]=number;
				y[sum++]=x[color];
			}
			count++;
		}
		
		for(int i=0;i<4;i++) {
			if(z[i]==10) {
				System.out.print("Jack");
			}
			else if(z[i]==11) {
				System.out.print("Queen");
			}
			else if(z[i]==12) {
				System.out.print("King");
			}
			else {
				System.out.print(z[i]);
			}
			System.out.println(" of "+y[i]);
		}
		System.out.println(count);
		*/
		//7.32
		
		/*Scanner in=new Scanner (System.in);
		System.out.println("input the size of the list:");
		int n=in.nextInt();
		System.out.println("input the list:");
		int []list=new int[n];
		for(int i=0;i<n;i++) {
			list[i]=in.nextInt();
		}
		int low =1;
		int high=n-1;
		int piot=list[0];
		while(true) {
			
			
			while(list[low]<=piot) {
				low++;
				if(low>=n-1)break;
			}
			
			while(list[high]>piot) {
				high--;
				if(high<=1)break;
			}
			
			if(high<low)break;
		
				int tmp=list[high];
				list[high]=list[low];
				list[low]=tmp;
				
				
		}
		list[0]=list[high];
		list[high]=piot;
		
		for(int i=0;i<n;i++) {
					System.out.print(list[i]+" ");
				}
				System.out.println();
			*/
		
		
		//7.34
		/*Scanner in=new Scanner (System.in);
		System.out.println("请输入一个字符串:");
		String s=in.nextLine();
		s=sort(s);
		System.out.println(s);*/
		

		
	}

}
