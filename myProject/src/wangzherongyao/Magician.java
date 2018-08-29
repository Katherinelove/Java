package wangzherongyao;
/**
 * 法师类--继承自英雄类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月18日 下午5:26:11
 */
public class Magician extends Hero{
	private static int ID=1;
	private int magicAttack;
	
	
	
	public Magician() {
		//设置默认参数
		setNickName("默认法师"+ID);
		setLevel(1);
		setMaxlife(100);
		setMagicAttack(99);
		ID++;
	}
	
	public Magician(String nickName) {
		//如何只修改默认名称，其他不变
		this();
		//先执行一遍，在复制
		this.setNickName(nickName);				
	}
	
	//重写敬
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer(getNickName());
		str.append("\t");
		str.append(getLevel());
		str.append("\t");
		str.append(getMaxlife());
		str.append("\t");
		str.append(getMagicAttack());
		//记得将stringbuffer转为string型
		return str.toString();
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	
	
}
