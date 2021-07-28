package com.iu.c2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

	
	private Scanner sc;
	private MemberDAO memberDAO;
	private ArrayList<MemberDTO> ar;
	
	
	public MemberController(){
		sc= new Scanner(System.in);
		memberDAO = new MemberDAO();
		ar = memberDAO.memberInit();
	}
	
	public void start() {
		
		//init - 초기화
		
		 
		boolean flag = true;
		
		while(flag) {
			
			if(mem)
			flag = beforeLogin();
			
					
		}
	}//start의 끝
	
	private void afterLogin() {
		System.out.println("1. Mypage");
		System.out.println("2. Logout");
		
	}
	
	private boolean beforeLogin() {
		System.out.println("번호를 선택해주세요");
		System.out.println("1. 회원 가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종 료");
		int select = sc.nextInt();
		
		boolean check = true;
		
		switch(select){
			case 1 : 
				memberDAO.memberAdd(ar);
				break;
				
			case 2 :
			MemberDTO memberDTO	= memberDAO.memberLogin(ar);
				if(memberDTO != null){
					System.out.println("로그인 성공");
					MemberSession.SESSION.put("member", memberDTO);
				}else {
					System.out.println("로그인 실패");
				}
				break;
				
			default :
				System.out.println("프로그램이 종료되었습니다");
				check =false;
		}
		
		return check;
	}
}
