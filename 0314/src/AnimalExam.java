
public class AnimalExam {
	public static void main(String[] args) {
		Cat c1 = new Cat("고양이");
		c1.eat();
             c1.eat();
	}
}
class Animal{
	String name;
	int food = 0;
	public Animal() {
		
	}
	public void eat() {
		System.out.println("eat 함수를 호출할 때마다 food 값이 10씩 증가합니다.");
	}
}
class Cat extends Animal{
	int age = 3;
	public Cat(String n) {
		name = n;
		System.out.println("동물의 종류는 " + name + "이고, " + age + "살 입니다.");
	}
	public void eat() {
		food += 10;		//food = food + 10
		System.out.println("오늘 먹은 음식의 양은 " + food + "g 입니다.");
	}

}