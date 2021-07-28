package com.iu.c2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberDAO {

	private String info;
	
	private Scanner sc;
	
	//생성자 만듦
	public MemberDAO() {
		info = "iu,pw1,32,suji,pw2,27,choa,pw3,30";
		sc = new Scanner(System.in);
	}
	
	//memberAdd 메서드명
	//Scanner로 id, pw, age를 입력받아서 MemberDTO 멤버변수
	//매개변수로 ArrayList를 받아서 생성한 MemberDTO를 추가
	//메인메서드에서 memveradd를 호출할때 memberinit 추가
	
	public void memberAdd(ArrayList<MemberDTO> ar) {
		
		//id, pw, age 입력받기 
		
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("추가할 Id를 입력해주세요"); // 한번 쓰고말 변수는 굳이 선언 안해도됨 ex)String id = sc.next(); 생략
		memberDTO.setId(sc.next());
		
		System.out.println("추가할 PW를 입력해주세요");
		memberDTO.setPw(sc.next());
		
		System.out.println("추가할 Age를 입력해주세요");
		memberDTO.setAge(sc.nextInt());
				
		ar.add(memberDTO);
	}
	
	
	//memeberInit 메서드명 
	//info에 있는 정보를 파싱해서 MemberDto 객체 생성해서 대입
	//ArrayList에 각각 추가하고 리턴
	
	public ArrayList<MemberDTO> memberInit() {
		
		StringTokenizer st = new StringTokenizer(info, ","); 
		ArrayList<MemberDTO> ar = new ArrayList<MemberDTO>();
		
		
		while(st.hasMoreTokens()) {
			
			MemberDTO memberDTO = new MemberDTO();
			String id = st.nextToken();
			memberDTO.setId(id);
			
			String pw = st.nextToken();
			memberDTO.setPw(pw);
			
			String age = st.nextToken();
			int age2 = Integer.parseInt(age);
			memberDTO.setAge(age2);
			
			ar.add(memberDTO); //ArrayList에 추가
			
		}
		
		return ar;
	
	}
	
	//memberLogin
	//Scanner로 id, pw를 입력받아서 MemberDTO 멤버변수에 추가
	//매개변수로 ArrayList를 받아서 입력받은 id,pw 둘다 일치하는 것을 찾아서 해당 DTO를 리턴
	
	public MemberDTO memberLogin(ArrayList<MemberDTO> ar) {
		
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("Id를 입력해주세요");
		memberDTO.setId(sc.next());
		System.out.println("Pw를 입력해주세요");
		memberDTO.setPw(sc.next());
		
		MemberDTO result = null;
		for(int i= 0; i<ar.size(); i++) {
			if(memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
				result = ar.get(i);
				break;
			}
		}
		return result;
	}
	

	//memberDelete
	//Scanner로 id, pw를 입력받아서 MemberDTO 멤버변수에 추가
	//매개변수로 ArrayList를 받아서 입력받은 id,pw 둘다 일치하는 것을 찾아서 삭제
	
	public int memberDelete(ArrayList<MemberDTO> ar) {
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("삭제할 Id를 입력하세요");
		memberDTO.setId(sc.next());
		System.out.println("삭제할 Pw를 입력하세요");
		memberDTO.setPw(sc.next());
		int result  = 0;
		for(int i=0; i<ar.size();i++) {
			if(memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
			
				ar.remove(i);
				
				result = 1;
				break;
			}	
		}
		
		return result;
	}
	

	
}
