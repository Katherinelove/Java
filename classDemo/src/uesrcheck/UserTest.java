package uesrcheck;

import java.util.Scanner;

/**
 * �û�����ڣ����ע���û��ĺϷ���
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��18�� ����2:33:34
 */
public class UserTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�������û�����");
		String name=input.nextLine().trim();
		if(UserUnit.isCerectUserName(name)) {
			System.out.println("�û�����Ч��");
		}else {
			System.out.println("�û�����Ч�����������룺");
			name=input.nextLine().trim();
		}
		System.out.print("���������룺");
		String password=input.nextLine().trim();
		String result=UserUnit.validatePassword(password);
		if(result.equals("")) {
			System.out.println("���������������������룡");
			password=input.nextLine().trim();
		}else {
			System.out.println("����ǿ��Ϊ��"+result);
		}
		System.out.print("����������ʼ���");
		String email=input.nextLine().trim();
		
		UserDemo user1=new UserDemo(name, password, email);
		
		

		
	}
}
