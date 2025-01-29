import java.util.*;
class secondLargestElement{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];
	System.out.println("Enter the elements of array :");
	for(int i=0; i<arr.length; i++){
		arr[i]= sc.nextInt();
	}
	
	int largest = arr[0];
	int second = arr[1];
	
	for(int i=2; i<arr.length; i++){
		if(arr[i]<largest && arr[i]>second){
			second = arr[i];
		}
		else if(arr[i]>second && arr[i]!= largest ){
				second = arr[i];
			}
			
		}
		System.out.println();	
	
	System.out.println(second);
	}
}