package printer;

import java.awt.print.Paper;

import printer.impl.A4Paper;
import printer.impl.Ink;

/**
 * ��ӡ������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��22�� ����11:02:11
 */
public class PrinterTest {
	public static void main(String[] args) {
		PrinterdDemo printer1=new PrinterdDemo("������");
		//��װī��
		printer1.setInkBox(new Ink());
		//��װֽ��
		printer1.setIPaper(new A4Paper());
		printer1.print("love you!");
	}
	
}
