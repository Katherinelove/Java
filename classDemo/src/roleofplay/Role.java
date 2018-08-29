package roleofplay;

public class Role {
	private String name;
	private int level;
	private int blood;
	//构造函数重载
//	Role(){
//		
//	}
//	Role(String name,int level,int blood){
//		this.name=name;
//		this.level=level;
//		this.blood=blood;
//	}
//	
	//方法
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name=name;
	}
	
	int getLevel() {
		return this.level;
	}
	void setLevel(int level) {
		this.level=level;
	}
	int getBlood() {
		return this.blood;
	}
	void setBlood(int blood) {
		this.blood=blood;
	}
	
	void fight(){
		//子类必须重新定义
	}
	//提取公共信息 返回字符串  string.format（）连接字符串
    public String toString() {
		return String.format("(%s,%d,%d)",this.getName(),this.getLevel(),
				this.getBlood());
	}
}
