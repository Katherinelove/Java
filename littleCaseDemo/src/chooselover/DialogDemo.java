package chooselover;
/**
 * 对话框示例
 * JOP--java的选项面版
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月8日 下午4:01:55
 */

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogDemo {
	public static void main(String[] args) {
		//确认框
		//参数1：父窗口
		//参数2：消息内容
		//参数3：标题
		//参数4：信息类型，0默认无；
		JOptionPane.showMessageDialog(null, "你吃了吗？");
		JOptionPane.showMessageDialog(null, "你吃了吗", "嘘寒问暖", JOptionPane.WARNING_MESSAGE);
		//参数5：icon表示自定义图标
		JOptionPane.showMessageDialog(null, "你吃了吗", "嘘寒问暖", 0, new ImageIcon("images/西施.jpg"));
		//确认框，参数1：父窗口，参数2：消息内容
		JOptionPane.showConfirmDialog(null, " i love you");
		
		//输入窗口
		//JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue)
		JOptionPane.showInputDialog(null, "你吃了吗", "嘘寒问暖", 0, new ImageIcon("images/西施.jpg"), new String[] {"吃了","关你屁事","明天一起"},"关你屁事");
		
	}

}
