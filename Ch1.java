package spoj;

import java.util.Scanner;
 
public class Ch1{
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int flag =0;
		int count =0;
		for(int i=0; i<5;i++) {
		arr[i] = sc.nextInt();
		count++;
		if(arr[i]==42) {
		flag =1;
//		break;
		}
		if(count ==0) {
			System.out.println( arr[i]);
		}
// 
		
		}
		for(int i=0; i<count;i++) {
		do {
		System.out.println(arr[i]);
		}while(arr[i]!=42);
	}
}
}