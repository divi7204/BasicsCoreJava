package DSA;
public class SortingAlgorithms {
	//Selection sort algorithm
	static int[] selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	//Bubble sort algorithm
	static int[] bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[i]<arr[j]) {
					break;
				}
				
			}
		}
		return arr;
	}
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {6,2,4,9,8,4};
		//Calling static method selectionSort() 
		selectionSort(arr);
		printArray(arr);
		System.out.println();
		//bubble sort
		bubbleSort(arr);
		printArray(arr);

	}

}
