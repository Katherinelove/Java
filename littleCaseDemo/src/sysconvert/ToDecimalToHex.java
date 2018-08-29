package sysconvert;

import java.util.Scanner;

/**
 * ʮ��������ʮ����ת��
 * �мǴ������int ����char   0-9��'0'-'9'��   10-15��'A'-'F'��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��12�� ����4:11:24
 */
public class ToDecimalToHex {
	public static void main(String[] args) {
		// 1.����
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��ʮ�������֣�");
		int decNum=input.nextInt();
		// 2.decimaltohex
		System.out.println(decimaltohex(decNum));
		
		System.out.print("������һ��ʮ���������֣�");
		String hexNum=input.next();
		// 3.hextodecimal
		System.out.println(hextodecimal(hexNum));
	}
	private static int hextodecimal(String hexNum) {
		int decNum=0;
		//6E =6*16^(2-1)+14*16^0
		//�ַ����  ��������
		for (int i = 0; i <hexNum.length(); i++) {
			char tempChar=hexNum.charAt(i);
			//������� '0'-'9'   'A'-'F'
			if(tempChar>='0' && tempChar<='9') {
				decNum+=(tempChar-'0')*
						Math.pow(16, hexNum.length()-i-1);
			}else if(tempChar>='A' && tempChar<='F'){
				decNum+=(tempChar-'A'+10)*
						Math.pow(16, hexNum.length()-i-1);
			}
		}
		return decNum;
	}

	private static String decimaltohex(int decNum) {
		// ����ʲô���ͣ�����ʲô���ͣ�������
		String hexNum="";
		//�����㷨������Ϊ0ʱ������ȡ��
		while(decNum!=0) {
			int temp=decNum%16;     //ȡ����
			//0-9   10-15  A-F
			if(temp>=0 && temp<=9) {
				//0-9   int���ֿ���ֱ����string����
				hexNum=temp+hexNum;
			}
			else if(temp>=10 && temp<=15){
				//10-15  A-F
				//���ͼ��ַ���ΪΪASCIIֵ����ȻΪ����
				hexNum=(char)(temp%10+'A')+hexNum;
			}
			//жĥɱ¿
			decNum/=16;
		}
		return hexNum;
	}
}
