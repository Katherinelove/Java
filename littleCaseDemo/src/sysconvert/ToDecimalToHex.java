package sysconvert;

import java.util.Scanner;

/**
 * 十六进制与十进制转换
 * 切记处理的是int 还是char   0-9（'0'-'9'）   10-15（'A'-'F'）
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月12日 下午4:11:24
 */
public class ToDecimalToHex {
	public static void main(String[] args) {
		// 1.输入
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个十进制数字：");
		int decNum=input.nextInt();
		// 2.decimaltohex
		System.out.println(decimaltohex(decNum));
		
		System.out.print("请输入一个十六进制数字：");
		String hexNum=input.next();
		// 3.hextodecimal
		System.out.println(hextodecimal(hexNum));
	}
	private static int hextodecimal(String hexNum) {
		int decNum=0;
		//6E =6*16^(2-1)+14*16^0
		//字符相减  即是整数
		for (int i = 0; i <hexNum.length(); i++) {
			char tempChar=hexNum.charAt(i);
			//两种情况 '0'-'9'   'A'-'F'
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
		// 返回什么类型，定义什么类型，并返回
		String hexNum="";
		//核心算法，余数为0时，反向取余
		while(decNum!=0) {
			int temp=decNum%16;     //取余数
			//0-9   10-15  A-F
			if(temp>=0 && temp<=9) {
				//0-9   int数字可以直接与string串接
				hexNum=temp+hexNum;
			}
			else if(temp>=10 && temp<=15){
				//10-15  A-F
				//整型加字符串为为ASCII值，任然为整数
				hexNum=(char)(temp%10+'A')+hexNum;
			}
			//卸磨杀驴
			decNum/=16;
		}
		return hexNum;
	}
}
