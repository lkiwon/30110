import java.util.Scanner;

public class CircleExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("반지름 값 :");
        int radius = scan.nextInt();
        Circle c = new Circle(radius);	//객체 생성
        System.out.println("반지름" + radius + "인 원의 넓이는 " + c.Area()+ "이다.");
    }
}

class Circle{
    int radius;	// 변수 선언
    public Circle() {}				//기본 생성자
    public Circle(int radius) {		//생성자(radius) 값 초기화
        this.radius = radius;
    }
    public double Area() {			//함수 선언(원의 넓이)
        return radius*radius*3.14;
    }
}