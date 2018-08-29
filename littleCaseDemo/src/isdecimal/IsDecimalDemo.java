package isdecimal;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/**
 * 判断字符窜是不是小数
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月18日 上午9:07:33
 */
public class IsDecimalDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.print("请输入：");
			String strNum=input.nextLine();
			if(strNum.equals("quit")) {
				break;
			}
			System.out.println(isDecimal(strNum));
		}

		
	}

	private static boolean isDecimal(String str) {
		boolean isDecimal=true;
		//判断每一个字符是不是数字
		//不是数字，一定要求是‘.’，否则false
		//是小数点还必须不能在收尾位置
		//判断是如果有“.”，否只有一个小数点
		for (int i = 0; i < str.length(); i++) {
			if(!(Character.isDigit(str.charAt(i)))) {
				//如果不是数字判断是不是为‘.’，且不在第一位或最后一位
				if(str.charAt(i)=='.') {
					if(i==0||i==str.length()-1) {
						isDecimal=false;
						break;
					}
				}else {
					//不是数字和‘.’，直接false
					isDecimal=false;
					break;
				}	
			}
		}
		//现在判断出了是数字，有小数点且不在收尾位置，怎么确定‘.’只有一个
		if(!(str.contains(".")&&(str.indexOf('.')==str.lastIndexOf('.')))) {
			isDecimal=false;
			
		}
		return isDecimal;
	}
}
