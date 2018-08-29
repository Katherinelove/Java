package printer;

import java.awt.print.Paper;

/**
 * 打印机模型
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月22日 上午10:57:59
 */
public class PrinterdDemo {
	// 属性用来组装接口
	private String name;
	//接口是成员变量  可以直接使用
	private IinkBox inkBox=null;
	private IPaper iPaper=null;

	
	public PrinterdDemo() {}
	
	public PrinterdDemo(String name) {
		setName(name);
	}

	//打印机功能
	public void print(String content) {
		if(inkBox==null||iPaper==null){
			System.out.println("墨盒或纸张异常");
		}else {
			System.out.println("打印颜色："+inkBox.getColor());
			System.out.println("打印纸张："+iPaper.getSize());
			System.out.println("打印内容");
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
