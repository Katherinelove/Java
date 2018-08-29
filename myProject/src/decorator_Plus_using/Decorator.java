package decorator_Plus_using;
/**
 * װ���� һ�����ԣ�Component component��
 * һ��������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��24�� ����3:30:20
 */
public class Decorator extends Component {
	//������洢��Ҫ  װ�ε����--��̬���������
	private Component component;
	
	public Decorator(Component component) {
		setComponent(component);
	}
	
	@Override
	void read() {
		//�������أ�������дҲ���ԣ�Ҳ����������д���ӹؼ���abstract��
		//ע�⣺�۲�˭������ʵ����read()������
		//������ת����component����ת����Ϳɽ���һЩ��չ������
		component.read();  //��̬ʵ������
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}
	

}
