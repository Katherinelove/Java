package printer;

import java.awt.print.Paper;

import printer.impl.A4Paper;
import printer.impl.Ink;

/**
 * 打印机对象
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月22日 上午11:02:11
 */
public class PrinterTest {
	public static void main(String[] args) {
		PrinterdDemo printer1=new PrinterdDemo("爱普生");
		//安装墨盒
		printer1.setInkBox(new Ink());
		//安装纸张
		printer1.setIPaper(new A4Paper());
		printer1.print("love you!");
	}
	
}
