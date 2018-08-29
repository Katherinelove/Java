package uesrcheck;

/**
 * 用户数据包--验证注册用户的名称和密码
 * 验证数据输入写在工具箱类
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月18日 上午10:39:19
 */
public class UserDemo {
	/**
	 * 用户名 密码  邮箱
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
