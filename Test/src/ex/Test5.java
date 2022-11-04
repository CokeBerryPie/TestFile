package ex;

public class Test5 {

	public static void main(String[] args) {
		
		// String str = new String("hello")
		String str = "hello";
		System.out.println(str);
		str.toUpperCase(); // 대문자 변경 -> 실행할 '때에만' 변경
		System.out.println(str.toUpperCase());
		System.out.println(str);

		// String 메서드 실행 결과를 저장 하지 않음 (저장하려면 실행 결과를 변수에 저장해야함)
		// ex. 변수에 저장하면 항상 적용
		String tmp = str.toUpperCase();
		System.out.println(tmp);
		////////////////////////////////////////
		
		System.out.println("---------------------------------------");
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		// String 과 달리 변수에 따로 저장하지 않아도 변경 값이 저장 됨
		// 즉,StringBuffer 메서드는 실행 결과를 저장함
	}

}
