package ex;


// 상속  필요조건 : 부모객체(SuperClass)가 존재해야한다
//					부모객체의 성격(형태)과 유사한 형태를 구현

class SuperClass{
	
}

class SubClass extends SuperClass{
	
}


// iPhone13 객체 - 속성 : color, price
class IPhone13{
	String color;
	int price;
}
// iPhone14 객체 - 속성 : color, price, tel
class IPhone14 extends IPhone13{
//	String color;
//	int price;
	String tel;
}



class Parent{
	public void pprn() {
		System.out.println(" P : pprn() 호출!!! ");
	}
}

class Child extends Parent{
	//@Override : 해당 메서드가 오버라이딩 하고 있다. 표시(생략이 가능)
	@Override
	public void pprn() {
		System.out.println(" P : pprn() 호출!!!(오버라이딩) ");
	}
	public void cprn() {
		System.out.println(" C : cprn() 호출!!! ");
	}
}


class Point2D{
	protected int x;
	private int y;
}

class Point3D extends Point2D{
//	int x;
//	int y;
	int z;
}



public class Test1 {

	public static void main(String[] args) {
		// 객체 : 클래스를 구체화(메모리에 올림)
		
		// 상속 : 자식이 부모가 가지고 있는 재산,권력을 물려받는 것
		// => 자식클래스가 부모 클래스의 모든 요소를 사용가능하게 하는 것
		
		// 자식 클래스( 서브클래스 - SubClass, 하위클래스)
		// 부모 클래스( 슈퍼클래스 - SuperClass, 상위클래스)
		
		//		 [생물]			<- [상위객체] : 공통속성을 보유, 속성 간단(상위로 갈수록)
		//      /      \
		//   [동물]   [식물]
		//   /   \
		// [새] [호랑이]		<- [하위객체] : 개별속성을 보유, 속성 복잡(하위로 갈수록)
	
		// * 프로그래밍에서의 상속 : 이미 정의되어 있는 객체(속성)을 사용해서 새로운 객체를 만드는것
		
		///////////////////////////////////////////////////////////////////////
		
		// 아이폰13,14 객체 생성 - 정보 출력
		IPhone13 i13 = new IPhone13();
		i13.color = "white";
		i13.price = 150;
		
		
		IPhone14 i14 = new IPhone14();
		i14.color = "black";
		i14.price = 199;
		i14.tel = "010-1111-1111";
		
		System.out.println("--------------------------------------------------");
		
		Parent p1 = new Parent(); // heap 에 p 생성 (p 안에 pprn 메서드 생성)
		p1.pprn(); // stack에 저장된 p1이 p 에 참조
		// p1.cprn(); 단방향 상속이므로 하위객체로 부터 상속 받을수 없다
		//			  즉, 상속관계가 아니다
		
		Child c1 = new Child();
		c1.pprn(); // 부모의 메서드 호출 ( 상속관계)
		c1.cprn(); // stack에 저장된 c1이 heap에 저장된 c와 p(부모)를 두개다 참조
		
		
		// 접근지정자 (제어자)
		
//		public >> protected >> deafult(생략)>> private
//		(크)<<===============범위===============>> (작)
		
		// private : 자신 클래스
		// 생략    : 자신 클래스, 같은 패키지
		// protected: 자신 클래스, 같은 패키지, 하위 클래스
		// public  : 자신 클래스, 같은 패키지, 하위 클래스, 다른 패키지
		
		// protected => 상속관계 일때는 public, 아닐때는 private
		
//		Point2D p2 = new Point2D();
//		p2.x = 100;
//		p2.y = 140;
//		
//		Point3D p3 = new Point3D();
//		p3.x = 100;
//		p3.y = 200;
//		p3.z = 300;
		
		// * 메서드 오버라이딩 vs 메서드 오버로딩
		// => '상속'
		
		// 메서드 오버라이딩 : 서브클래스에서 슈퍼클래스의 메서드를 재정의 하는 것
		// => 기존의 부모의 메서드를 같은 형태로 사용 하는 것 (동작은 다름)
		// => 기존의 메서드명, 전달인자의 타입, 전달인자의 개수가 모두 동일
		// 	=> 부모의 메서드를 '은닉' 시켜서 항상 재정의된 메서드가 호출

		//	---------------------------------------------------------------------------	

		// 메서드 시그니처 <= 메서드명, 메서드 전달인자의 타입, 전달인자의 개수
		
		// 메서드 오버로드
		// 1) 메서드명 동일
		// 2) 메서드의 전달인자 타입 다름
		// 3) 메서드의 전달인자 개수 다름
	
		// 메서드 오버라이딩
		// 1) 메서드명 동일
		// 2) 메서드의 전달인자 타입 동일
		// 3) 메서드의 전달인자 개수 동일
		// 4) 접근지정자의 범위가 줄어들 수 없음
		
		//public void method () {}
		//private void method () {}
		
		// 부모의 메서드
		//(생략) void method(){}
		
		// 오버라이딩 된 메서드 
		// public void method(){} - 사용가능
		// protected void method(){} - 사용가능
		//  void method(){} - 사용가능
		// private void method(){} - 사용불가능
		
		// 부모의 메서드
		//  void method(){}
		//  void method(); <- 추상 메서드
				
		// 오버라이딩 된 메서드 
		// public void method(){} - 
		// protected void method(){} - 
		//  void method(){} - 
		// private void method(){} - 
	}

}
