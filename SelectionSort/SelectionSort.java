import java.util.Scanner;

public class SelectionSort {
	
	public static void  main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Nhap so luong phan tu cua mang: ");
		int n = scanner.nextInt();
		int[] nums = new int[n];
		System.out.println("Nhap cac gia tri cua mang: ");
		for (int i = 0; i < n; i ++) {
			System.out.print("Phan tu thu " + (i+1) + " : ");
			nums[i] = scanner.nextInt();
		}

		System.out.println("Mang ban dau: ");
		printArray(nums);
	
		selectionSort(nums);
		
		System.out.println("Mang sau khi sap xep ");
		printArray(nums);
	}
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++){
				if (arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void printArray(int[] arr){
		for (int num : arr){
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
			
