import java.util.*;
class ArrayLevel{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	int value=0,x=1;
	int level=sc.nextInt();
	for(int i=level;i<=n;i++){
	value+=x;
	x++;
	}
	System.out.print(value);
	}
	
