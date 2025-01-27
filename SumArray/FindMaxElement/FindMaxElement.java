import java.util.Scanner;

public class FindMaxElement {

	public static int findMax(int[] nums){
		int max = nums[0];
		for (int num : nums) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
	
		System.out.print("Nhap so luong phan tu cua mang: ");
		int n = scanner.nextInt();
	
		int[] nums = new int[n];
		System.out.println("Nhap cac gia tri cua mang: ");
		for (int i = 0; i < n ; i ++) {
			System.out.print("Phan tu thu " + (i+1) + " : ");
			nums[i] = scanner.nextInt();
		}
		System.out.println("Gia tri lon nhat cua mang la " + findMax(nums));
	}
}
