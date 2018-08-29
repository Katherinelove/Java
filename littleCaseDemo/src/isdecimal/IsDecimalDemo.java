package isdecimal;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/**
 * �ж��ַ����ǲ���С��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��18�� ����9:07:33
 */
public class IsDecimalDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.print("�����룺");
			String strNum=input.nextLine();
			if(strNum.equals("quit")) {
				break;
			}
			System.out.println(isDecimal(strNum));
		}

		
	}

	private static boolean isDecimal(String str) {
		boolean isDecimal=true;
		//�ж�ÿһ���ַ��ǲ�������
		//�������֣�һ��Ҫ���ǡ�.��������false
		//��С���㻹���벻������βλ��
		//�ж�������С�.������ֻ��һ��С����
		for (int i = 0; i < str.length(); i++) {
			if(!(Character.isDigit(str.charAt(i)))) {
				//������������ж��ǲ���Ϊ��.�����Ҳ��ڵ�һλ�����һλ
				if(str.charAt(i)=='.') {
					if(i==0||i==str.length()-1) {
						isDecimal=false;
						break;
					}
				}else {
					//�������ֺ͡�.����ֱ��false
					isDecimal=false;
					break;
				}	
			}
		}
		//�����жϳ��������֣���С�����Ҳ�����βλ�ã���ôȷ����.��ֻ��һ��
		if(!(str.contains(".")&&(str.indexOf('.')==str.lastIndexOf('.')))) {
			isDecimal=false;
			
		}
		return isDecimal;
	}
}
