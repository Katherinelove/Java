package decorator_using;
/**
 * ������Ҫװ�εĲ��֣�����ʵ�ָ���
 * �����Ѿ�д�ã��������Ӷ��������Ա������޸�
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��24�� ����3:26:20
 */
public class TrueComponent extends Component {

	@Override
	void read() {
		System.out.println("�Ұ��� luckylan!");
	}

	@Override
	void showLove() {
		System.out.println("��ϲ���� �ܾ��ˣ�");
		
	}

}
