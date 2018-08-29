package uesrcheck;
/**
 * �ַ����Ĺ����࣬��װ�˳����ַ������жϷ���
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018��8��18�� ����10:46:23
 */
public class UserUnit {
	/**
	 * �жϴ�����û����ַ����Ƿ��ǺϷ����û��� �û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
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
		// ���ܰ������������ַ� ���ó��ַ�����
		char[] unValidChar = { ' ', '\'', '"', '?', '<', '>', ',' };
		for (char ch : unValidChar) {
			if (userName.contains(Character.toString(ch))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * ����6-18λ��ֻ�ܰ�����ĸ�����֡�������ţ��»��ߡ�@��#��$��!�� 
	 * �����֡�����ĸʱ������ǿ�ȶ����� ��������
	 * ����+���롢����+���š�����+��ĸ��ǿ��Ϊ�У������� 
	 * ͬʱ���������ַ���ǿ��Ϊǿ��������
	 * @param password
	 * @return �������ֵΪ"",��ô�������֤ʧ�ܣ���֤�ɹ����򷵻��Ǻű�ʾ�����ǿ��
	 */
	public static String validatePassword(String password) {
		String power = "";//�����ǿ��,Ϊ�ձ�ʾ��Ч����
		if(password==null) return power; 
		if(password.length()<6||password.length()>18) return power;
		if(!isCorrectValuedChar(password)) return power;
		//�����ų��˷Ƿ���ʽ���������и�ʽ
		//���濪ʼ�ж�����ǿ��
		if(isAlldigit(password)||isAllLetter(password)) {
			 power = "�������";
		}else if(isDigitAndLetter(password)){
			power = "�������";
			}else if(isContainsSymble(password)) {
				power = "�������";
			}
		return power;
	}
	
	/**
	 * �ַ����а����Ϸ�����ĸ������
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
	/** �ж��ǲ���ȫ������*/
	private static boolean isAlldigit(String value) {
		for (int i = 0; i < value.length(); i++) {
			if(Character.isDigit(value.charAt(i))){
				return true;
			}
		}
		return false;
	}
	/** �ж��ǲ���ȫ����ĸ*/
	private static boolean isAllLetter(String value) {
		for (int i = 0; i < value.length(); i++) {
			if(Character.isLetter(value.charAt(i))){
				return true;
			}
		}
		return false;
	}
	/** �ж��ַ������Ƿ�����Ϸ����������*/
	private static boolean isContainsSymble(String value){
		String part = "_@#$!";
		for (int i = 0; i < value.length(); i++) {
			if(part.contains(Character.toString(value.charAt(i)))){
				return true;
			}
		}
		return false;
	}
	
	/** �ж��ǲ��ǺϷ���ʽ*/
	private static boolean isCorrectValuedChar(String value) {
		//������ֻ�ܰ������������ó��ַ��� valuedChar=��_@#����
		String valuedChar="_@#!";
		for (int i = 0; i < value.length(); i++) {
			if(!(Character.isLetterOrDigit(value.charAt(i)))) {
				//���������ĸ�����֣�����Ҳ���ǺϷ���������ţ���֤���ǷǷ��ĸ�ʽ
				if(!(valuedChar.contains(Character.toString(value.charAt(i))))){
					return false;
				}
			}
		}
		return true;
	}
	

}
