

public class ShapeExam {
	public static void main(String[] args) {
		Ract r = new Ract("사각형");
		r.area(7, 8);
        r.area(5, 5);
	}
}
class Shape{	//상위 클래스
	String name;
	public Shape () {
		System.out.println("도형 생성");
	}
	public void area(int w, int h) {
		System.out.println("도형의 가로는 " + w + "이고, 세로는 " + h + "이다.");
	}
}
class Ract extends Shape	//하위클래스
{
	public Ract(String n) {
		name = n;
		System.out.println("도형은 " + name + "입니다.");
	}
	public void area(int w, int h) {
		super.area(w, h);
		if(w==h) {
			System.out.println("정사각형 / 넓이는: " + w*h);
		}
		else {
			System.out.println("직사각형 / 넓이는: " + w*h);
		}
	}
}