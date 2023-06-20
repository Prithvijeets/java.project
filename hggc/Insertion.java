package insertionsort;

public class Insertion {
	public static int insertSort(int [] arr) {
		int count = 0;
		
		for(int i=1; i<arr.length; i++) {
			int j = i-1;
			int key = arr[i];
			
			while(j >=0 &&  arr[j] > key) {
				count++;
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key; 
		}
		return count;
}
public static void display(int []arr) {
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}