package wangzherongyao;

public class Maintest {

	public static void main(String[] args) {
		Warrior �ܲ�=new Warrior("�ܲ�");
		Magician ����=new Magician("����");
		//Ĭ�϶������tostring()����
		System.out.println("����\t����\t�������ֵ\t������");
		System.out.println(�ܲ�);
		System.out.println(����);
		//��̬ʹ��
		System.out.println(�ܲ�.compareToByLevel(����));
	}

}
