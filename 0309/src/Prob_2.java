import java.util.Scanner;

public class Prob_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new  Scanner(System.in);
		int arr[] = new int[5];
		int max = 0;
		int j = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"번 입력: ");
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				j = i+1;
			}
		}
		System.out.println("가장 큰 수는 " + j + "번째 숫자인" + max);
	}
}
