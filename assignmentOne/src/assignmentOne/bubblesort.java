package assignmentOne;
import java.util.Scanner;
public class bubblesort {
	static int[] bubblesort(int arr[])
	{
		int n = arr.length,temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					}
			}}
			return(arr);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,12,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("this is before sorting ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(+array[i]+" ");
		}
		array = bubblesort(array);
		System.out.println();
		System.out.println("this is sorted array");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(+array[i]+" ");
		}
		/*int n = array.length,temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					
				}
			}
			
			
		}*/

	}

}
