package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		int money;
		
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 Scanner 클래스를 생성하겠다
		System.out.print("돈 입력 : ");
		money = scan.nextInt();
		
		int thousand = money / 1000; //5
		int thousand_mod = money % 1000; //378
		
		int hunred = thousand_mod / 100; //3
		int hunred_mod = thousand_mod % 100; //78
		
		int ten = hunred_mod / 10; //7
		
		
		int one = hunred_mod % 10; //8
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("현금 : " + df.format(money) + "원"); //3자리마다 , 찍기
		System.out.println("천원 : " + thousand + "장");
		System.out.println("백원 : " + hunred + "원");
		System.out.println("십원 : " + ten + "원");
		System.out.println("일원 : " + one + "원");
		
	}

}

/*
[문제] 동전교환기 - 현금 5378원이 있습니다.

[실행결과]
현금 : 5378원
천원 : 5장
백원 : 3개
십원 : 7개
일원 : 8개

나누기 연산자, 퍼센트 연산자 (총 2가지) 사용해서 만들기 
*/