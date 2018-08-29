package uesrcheck;

import java.util.Scanner;

/**
 * 用户类入口，检测注册用户的合法性
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月18日 下午2:33:34
 */
public class UserTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入用户名：");
		String name=input.nextLine().trim();
		if(UserUnit.isCerectUserName(name)) {
			System.out.println("用户名有效！");
		}else {
			System.out.println("用户名无效，请重新输入：");
			name=input.nextLine().trim();
		}
		System.out.print("请输入密码：");
		String password=input.nextLine().trim();
		String result=UserUnit.validatePassword(password);
		if(result.equals("")) {
			System.out.println("输入密码有误，请重新输入！");
			password=input.nextLine().trim();
		}else {
			System.out.println("密码强度为："+result);
		}
		System.out.print("请输入电子邮件：");
		String email=input.nextLine().trim();
		
		UserDemo user1=new UserDemo(name, password, email);
		
		

		
	}
}
