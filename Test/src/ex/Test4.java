package ex;

interface Will{
	public abstract void Hello();
	public void Hello2(); // abstract 생략가능
	void Hello3(); // abstract, public  생략가능
}

class Test implements Will {
	// alt shift s + v
	
	@Override
	public void Hello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hello2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hello3() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}


abstract class Shape{ // 가형성
	public abstract void draw(Shape s);
}

class Cir extends Shape { // 원
//	public void draw() {
//		System.out.println("원 그리기");
//	}
	public void draw(Shape s) {
		System.out.println(s+"원 그리기");
	}
}

class Tri extends Shape { // 삼각형
//	public void paint() {
//		System.out.println("삼각형 그리기");
//	}
	public void draw(Shape s) {
		System.out.println("삼각형 그리기");
	}
	
}

class Rec extends Shape { // 사각형
//	public void print() {
//		System.out.println("사각형 그리기");
//	}
	public void draw(Shape s) {
		System.out.println("사각형 그리기");
	}
	
}


public class Test4 {

	public static void main(String[] args) {
		
		
	}
}
