package decorator_Plus_using;
/**
 * ʹ��װ�����ĳ���
 * 1.�����ǲ���Ӱ����̸���������£��Զ�̬��͸���ķ�ʽΪ�������ӹ���	
 * 2.�����ʺ�ʹ�ü̳У�����Է���������չ
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��24�� ����3:48:48
 */
public class DecoratorTest {

	public static void main(String[] args) {
		// ������Ҫװ�εĶ���
		Component component=new TrueComponent();
		//Ϊԭʼ����͸�����ӹ���
		//����װ����A
//		ComponetImplA componetImplA=new ComponetImplA(component);
//		componetImplA.read();   //�����read������������ԭʼ���
//		ComponetImplB componetImplB=new ComponetImplB(component);
//		componetImplB.read();
		//װ����Ҳ���Լ���װ��װ��������Ϊװ����Ҳ��component����--��ǿ��
		ComponetImplA componetImplA=new ComponetImplA(component);
		ComponetImplB componetImplB=new ComponetImplB(componetImplA);
		componetImplB.read();
	}

}
