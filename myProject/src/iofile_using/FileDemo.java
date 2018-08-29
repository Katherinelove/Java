package iofile_using;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

import javax.sound.midi.SysexMessage;
import javax.swing.JFileChooser;

/**
 * 文件/目录的使用
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月23日 下午6:34:19
 */
public class FileDemo {
	public static final String PathName="E:/teacher_liao";  //.表示工程根目录
	public static void main(String[] args) {
		JFileChooser fileChooser=new JFileChooser(PathName);   //设置文件对话框打开时的根目录
		//利用JFileChooser选择器  选择目录默认mode（只能选择目录） 使用前自己设置
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		//还可以设置默认过滤器   注意这里的过滤器对象时一个FileFiter类
//		fileChooser.setFileFilter(new myFileFilter());
//		myFileFilter继承了FileFiter类                    跟继承FilenameFilte接口用法一致
		fileChooser.showOpenDialog(null);  //显示选择文件对话框
		File file=fileChooser.getSelectedFile(); //获取选择框获取的文件
		
//		File file=new File(PathName);
		
		//不用trycatch的话  必须判断
		if(file==null) {
			//点击取消返回null
			System.out.println("未选择文件，强制退出！");
			System.exit(0);
		}
		System.out.println("文件或目录是否存在："+file.exists());
		System.out.println("文件或目录是否是文件："+file.isFile());
		System.out.println("文件或目录是否是目录："+file.isDirectory());
		System.out.println("文件或目录是否为隐藏文件："+file.isHidden());
		System.out.println("文件或目录名称："+file.getName());
		System.out.println("最后修改时间："+new Date(file.lastModified()).toLocaleString());  //lastModified()是个长整型时间
		System.out.println("文件或目录相对路径："+file.getPath());
		System.out.println("文件或目录绝对路径："+file.getAbsolutePath());
		
		System.out.println("是否可读："+file.canRead());
		System.out.println("是否可写："+file.canWrite());
		System.out.println("文件大小："+file.length()+"字节");
		System.out.println("当前目录的子目录名称列表：");
		String[] mulu=file.list();    //可以添加文件过滤器
		for (int i = 0; i < mulu.length; i++) {
			System.out.println(mulu[i]);
		}
		
		System.out.println("只选择.exe文件");
		String[] fileNames=file.list(new DirFilter());
		for (int i = 0; i < fileNames.length; i++) {
			System.out.println(fileNames[i]);
		}
	}
	
	//文件过滤器使用内部类   这里加静态是为了mian方法中直接使用
	public static class DirFilter implements FilenameFilter{
		//重写
		@Override
		public boolean accept(File dir, String name) {
			if(name.endsWith("exe")) {
				return true;
			}
			return false;
		}
		
	}
}
