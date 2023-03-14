import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수학, 과학 영어 순으로 3과목의 점수 입력>>");
		int m = scan.nextInt();
		int s = scan.nextInt();
		int e = scan.nextInt();
		
		Grade me = new Grade(m,s,e);
		System.out.println("평균은 " + me.average());
	}
}

class Grade{
	int math;
	int science;
	int english;
	
	public Grade(int m, int s, int e) {	//생성자(초기화)
		math = m;
		science = s;
		english = e;
	}
	public int average() {	//평균을 구하는 함수
		return (math+science+english)/3;
	}
}
