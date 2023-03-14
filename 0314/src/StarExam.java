import java.util.Scanner;

public class StarExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b = 0; //a: 별의 개수, b: 방향
		System.out.println("별의 개수: ");
		a = scan.nextInt();
		System.out.println("방향: ");
		b = scan.nextInt();
		
		if(b==1) {
			for(int i=1; i<=a; i++) {		// 줄 반복
				for(int j=1; j<=i; j++) {	// 별 반복
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(b==2) {
			for(int i=a; i>=1; i--) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}