package role.test;

/**
 * Ӣ���࣬���ݷ�װ
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018��8��16�� ����9:33:04
 */
public class Hero {
	private long id; // id ֵ���ܴܺ�
	private String name; // �������ƺ󲻿ɸ���
	private long level; // ����1-999��
	private long curExp; //��ǰ����ľ���ֵ
	private long exp; // ��ǰ�����������辭��ֵ

	public long getId() {
		return id;
	}

	public void setId(long id) {
		//�����ֵ��Ҫ��֤
		if(id<=0) {
			this.id=1;   //С��0Ĭ��id 1
		}
		else {
			this.id = id;
		}
	}
	
	

	public Hero(String name) {
		setName(name);
	}

	public Hero() {}

	public String getName() {
		return name;
	}

	
	//���ƶ�������޸ģ����Ա����ӿڣ�����Ϊprivate�Լ�����ʹ��
	//���߲����Լ����ӿڣ�������Ĺ����������ó�ʼ�ǳ�
	private void setName(String name) {
		if(name==null) {
			this.name="Katherine";//Ĭ������
		}
		else {
			this.name = name;
		}
	}

	public long getLevel() {
		return level;
	}

	public void setLevel(long level) {
		if(level<1||level>999) {
			this.level =1;//Ĭ�ϼ���
		}
		this.level = level;
	}

	public long getCurExp() {
		return curExp;
	}

	public void setCurExp(long curExp) {
		this.curExp = curExp;
	}

	public long getExp() {
		exp=(long)((Math.pow(level-1, 3)+60)/5*
				(Math.pow(level-1, 2))+60);
		return exp;
	}

	//��ǰ�����������Ҫ�ľ���ֵΪ�̶���ʽ
//	public void setExp(long exp) {
//		this.exp = exp;
//	}

}
