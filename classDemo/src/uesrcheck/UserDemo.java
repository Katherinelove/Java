package uesrcheck;

/**
 * �û����ݰ�--��֤ע���û������ƺ�����
 * ��֤��������д�ڹ�������
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018��8��18�� ����10:39:19
 */
public class UserDemo {
	/**
	 * �û��� ����  ����
	 */
	private String name;
	private String password;
	private String email;

	public UserDemo() {
	}

	public UserDemo(String name, String password, String email) {
		setName(name);
		setPassword(password);
		setEmail(email);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
