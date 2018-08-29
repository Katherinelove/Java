package printer;

import java.awt.print.Paper;

/**
 * ��ӡ��ģ��
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018��8��22�� ����10:57:59
 */
public class PrinterdDemo {
	// ����������װ�ӿ�
	private String name;
	//�ӿ��ǳ�Ա����  ����ֱ��ʹ��
	private IinkBox inkBox=null;
	private IPaper iPaper=null;

	
	public PrinterdDemo() {}
	
	public PrinterdDemo(String name) {
		setName(name);
	}

	//��ӡ������
	public void print(String content) {
		if(inkBox==null||iPaper==null){
			System.out.println("ī�л�ֽ���쳣");
		}else {
			System.out.println("��ӡ��ɫ��"+inkBox.getColor());
			System.out.println("��ӡֽ�ţ�"+iPaper.getSize());
			System.out.println("��ӡ����");
			System.out.println(content);
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IinkBox getInkBox() {
		return inkBox;
	}

	public void setInkBox(IinkBox inkBox) {
		this.inkBox = inkBox;
	}

	public IPaper getIPaper() {
		return iPaper;
	}

	public void setIPaper(IPaper iPaper) {
		this.iPaper = iPaper;
	}

}
