import java.util.Scanner;
 
class Ch1{
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int flag =0;
		int count =0;
		for(int i=0; i<10;i++) {
		arr[i] = sc.nextInt();
		count++;
		if(arr[i]==42) {
		flag =1;
		break;
		}
		if(flag==0) {
			System.out.println( arr[i]);
		}
		}
	}
}