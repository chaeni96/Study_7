package com.iu.c2.list.ex1;

public class MemberView {
	
	public void view() {
		//myPage 선택시 실행
		//id,pw,age 출력
		//단, 메서드의 head는 변경 금지
		//멤버변수 선언 X
		
		MemberDTO memberDTO = MemberSession.SESSION.get("member");
		System.out.println("Id : "+memberDTO.getId());
		System.out.println("Pw : "+memberDTO.getPw());
		System.out.println("Age : "+memberDTO.getAge());
		
		
	}

}
