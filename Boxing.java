package operator;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a /3; //Casting, 강제형변환 / 자동형변환
		
		String c = "25";
		
		//int d = c; //int는 기본형 String은 객체형으로 String은 int에 들어갈 수가 없다 객체형을 기본형으로 강제형변환 하는것은 불가능(error)
		int d = Integer.parseInt(c); //Integer :객체형 parseInt는 메소드
		//Integer.parseInt("25") = 25 + ""
		
		int e = 5;
		
		Integer f = e; //JDK 5.0, AutoBoxing (기본형 -> 객체형으로 자동으로)
	//  객체형      =기본형
	//	Integer f = new Integer(e); //JDK 5.0 이전에 
		
		Integer g = 5;
		int h = g; //JDK 5.0 unAutoBoxing (객체형 -> 기본형)
		//int h = g.intValue(); //JDK 5.0 이전

	}

}
