package com.iu.c5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	
	public static void main(String[] args) {
		//client 연결 요청이 오면 1:1 Socket을 생성해주는 Server Socket이 있음
		Scanner scanner = new Scanner(System.in);
		Socket sc = null;
		ServerSocket ss = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		try {
		 ss = new ServerSocket(8282);
		 System.out.println("Client 접속 기다리는 중");
		 
		 sc = ss.accept();
		 System.out.println("Client와 연결 성공");
		
		 boolean check = true;
		 
		 while 	(check) {
			 is = sc.getInputStream();
			 ir = new InputStreamReader(is);
			 br = new BufferedReader(ir);
			 
			 String message = br.readLine();
			 System.out.println("클라이언트에서 보낸 메세지");
			 System.out.println("Client : "+message);
			 
			 if(message.toUpperCase().equals("Q")) {
				 //break;
				 check= false;
				 continue;
			 }
			 
			 System.out.println("클라이언트로 보낼 메세지");
			 message = scanner.nextLine();
			 
			 //message를 클라이언트로 전송
			 
			 os = sc.getOutputStream();
			 ow = new OutputStreamWriter(os);
			 bw = new BufferedWriter(ow);
			 
			 bw.write(message+"\r\n");
			 bw.flush();
			 
				if(message.toUpperCase().equals("Q")) {
					break;
				}
				
		 }//while의 끝
		 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				sc.close();
				ss.close();
				scanner.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
