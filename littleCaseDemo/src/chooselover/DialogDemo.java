package chooselover;
/**
 * �Ի���ʾ��
 * JOP--java��ѡ�����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��8�� ����4:01:55
 */

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogDemo {
	public static void main(String[] args) {
		//ȷ�Ͽ�
		//����1��������
		//����2����Ϣ����
		//����3������
		//����4����Ϣ���ͣ�0Ĭ���ޣ�
		JOptionPane.showMessageDialog(null, "�������");
		JOptionPane.showMessageDialog(null, "�������", "�꺮��ů", JOptionPane.WARNING_MESSAGE);
		//����5��icon��ʾ�Զ���ͼ��
		JOptionPane.showMessageDialog(null, "�������", "�꺮��ů", 0, new ImageIcon("images/��ʩ.jpg"));
		//ȷ�Ͽ򣬲���1�������ڣ�����2����Ϣ����
		JOptionPane.showConfirmDialog(null, " i love you");
		
		//���봰��
		//JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue)
		JOptionPane.showInputDialog(null, "�������", "�꺮��ů", 0, new ImageIcon("images/��ʩ.jpg"), new String[] {"����","����ƨ��","����һ��"},"����ƨ��");
		
	}

}
