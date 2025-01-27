import java.util.Scanner;

public class bai1_tinh_tong_so_trong_mang {

	public static int sumArray(int[] nums) {
		int sum = 0;
		for ( int num : nums){
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Nhap so luong phan tu cua mang: ");
		int n = scanner.nextInt();
		
		int[] nums = new int[n];
		System.out.println("Nhap cac gia tri cho mang: ");
		for (int i = 0; i < n ; i++) {
			System.out.print("Phan tu thu " + ( i + 1 ) + " : ");
			nums[i] = scanner.nextInt();
		}

		System.out.println("Tong cac phan tu trong mang la: " + sumArray(nums));
		
		scanner.close();
	}
}

