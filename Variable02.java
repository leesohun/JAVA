package basic;

class Test {
	int a = 10; 
	static int b = 20;
	static String str;
}
//---------------------
public class Variable02 {
	int a; //필드, 초기화
    double b; //필드
    static int c;
    
	public static void main(String[] args) {
		int a = 5; //지역변수(local variable), 쓰레기값
		System.out.println("지역변수 a = " + a);
         
		Variable02 v = new Variable02();//메모리 생성, 주소(클래스@16진수)
		System.out.println("객체 = " + v);
		System.out.println("필드 a= " + v.a);
		System.out.println("필드 b= " + v.b);
		
		System.out.println("필드 b= " + c);
		System.out.println("필드 b= " + Variable02.c);
		System.out.println();
		
		Test t = new Test();
		System.out.println("필드 a= " + t.a);
		System.out.println("필드 b= " + t.b);
	    System.out.println("필드 str= " + t.str);
	}

}
