package decorator_using;
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

		ComponetImplA componetImplA=new ComponetImplA(component);
		componetImplA.showLove();
	}

}
