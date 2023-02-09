package constructor;

public class VarArgs {
	public VarArgs() {
		System.out.println("기본 생성자");
	}
	
	public int sum(int...ar) { //배열화
		int hap=0;
		for(int i=0; i<ar.length; i++) {
			hap += ar[i];
		}
		return hap;
	}

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 = " + va.sum(10,20));
		System.out.println("합 = " + va.sum(10,20,30));
		System.out.println("합 = " + va.sum(10,20,30,40));
		
	}

}
