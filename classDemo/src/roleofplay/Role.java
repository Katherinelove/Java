package roleofplay;

public class Role {
	private String name;
	private int level;
	private int blood;
	//���캯������
//	Role(){
//		
//	}
//	Role(String name,int level,int blood){
//		this.name=name;
//		this.level=level;
//		this.blood=blood;
//	}
//	
	//����
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
		//����������¶���
	}
	//��ȡ������Ϣ �����ַ���  string.format���������ַ���
    public String toString() {
		return String.format("(%s,%d,%d)",this.getName(),this.getLevel(),
				this.getBlood());
	}
}
