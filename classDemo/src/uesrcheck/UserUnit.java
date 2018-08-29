package uesrcheck;
/**
 * 字符串的工具类，封装了常用字符串的判断方法
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月18日 上午10:46:23
 */
public class UserUnit {
	/**
	 * 判断传入的用户名字符串是否是合法的用户名 用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号
	 * 
	 * @param userName
	 * @return
	 */
	public static boolean isCerectUserName(String userName) {
		// boolean isCerect=true;
		if (userName == null)
			return false;
		if (userName.length() >= 25)
			return false;
		// 不能包括特殊特殊字符 设置成字符数组
		char[] unValidChar = { ' ', '\'', '"', '?', '<', '>', ',' };
		for (char ch : unValidChar) {
			if (userName.contains(Character.toString(ch))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 密码6-18位，只能包含字母、数字、特殊符号（下划线、@、#、$、!） 
	 * 纯数字、纯字母时，密码强度都是弱 （★★☆☆☆☆）
	 * 数字+密码、数字+符号、数字+字母，强度为中（★★★★☆☆） 
	 * 同时存在三种字符，强度为强（★★★★★★）
	 * @param password
	 * @return 如果返回值为"",那么密码的验证失败；验证成功，则返回星号表示密码的强度
	 */
	public static String validatePassword(String password) {
		String power = "";//密码的强度,为空表示无效密码
		if(password==null) return power; 
		if(password.length()<6||password.length()>18) return power;
		if(!isCorrectValuedChar(password)) return power;
		//以上排除了非法格式，下面是有格式
		//下面开始判断密码强度
		if(isAlldigit(password)||isAllLetter(password)) {
			 power = "★★☆☆☆☆";
		}else if(isDigitAndLetter(password)){
			power = "★★★★☆☆";
			}else if(isContainsSymble(password)) {
				power = "★★★★★★";
			}
		return power;
	}
	
	/**
	 * 字符串中包含合法的字母和数字
	 * @param value
	 * @return
	 */
	private static boolean isDigitAndLetter(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isLetterOrDigit(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	/** 判断是不是全是数字*/
	private static boolean isAlldigit(String value) {
		for (int i = 0; i < value.length(); i++) {
			if(Character.isDigit(value.charAt(i))){
				return true;
			}
		}
		return false;
	}
	/** 判断是不是全是字母*/
	private static boolean isAllLetter(String value) {
		for (int i = 0; i < value.length(); i++) {
			if(Character.isLetter(value.charAt(i))){
				return true;
			}
		}
		return false;
	}
	/** 判断字符串中是否包含合法的特殊符号*/
	private static boolean isContainsSymble(String value){
		String part = "_@#$!";
		for (int i = 0; i < value.length(); i++) {
			if(part.contains(Character.toString(value.charAt(i)))){
				return true;
			}
		}
		return false;
	}
	
	/** 判断是不是合法形式*/
	private static boolean isCorrectValuedChar(String value) {
		//这里是只能包含，可以设置成字符串 valuedChar=“_@#！”
		String valuedChar="_@#!";
		for (int i = 0; i < value.length(); i++) {
			if(!(Character.isLetterOrDigit(value.charAt(i)))) {
				//如果不是字母或数字，并且也不是合法的特殊符号，就证明是非法的格式
				if(!(valuedChar.contains(Character.toString(value.charAt(i))))){
					return false;
				}
			}
		}
		return true;
	}
	

}
