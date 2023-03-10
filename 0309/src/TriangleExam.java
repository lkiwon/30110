
public class TriangleExam {

	public static void main(String[] args) {
		Triangle tr=new Triangle(10.2, 17.3);
		System.out.println("삼각형의 넓이 : " + tr.getArea());
		
		tr.setSize(7.5, 9.2);
		
		System.out.println("삼각형의 넓이 : " + tr.getArea());
	}
}
class Triangle{
	double bottom;	//변수 선언
	double height;
	
	public Triangle(double bt, double hg) {	// 생성자
		bottom=bt;
		height=hg;
	}
	public void setSize(double bt, double hg) { // 길이 변환 함수
		bottom=bt;
		height=hg;
	}
	public double getArea() {	// 넓이 함수
		return bottom*height/2;
	}
}