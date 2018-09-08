package accessiblefiledemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 任意位置读写文件，seek（）方法设置指针的位置
 * 这是一个单独的类，已过时,只能以字节的方式读取
 * 每读写一次，重新设置指针，否则失败
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年9月4日 上午9:15:48
 */
public class AccessibleFileDemo {
	public static final String PathName1="D:/mygit/laojiuxuetang/myProject/files/RandomFile.txt";
	public static final String PathName2="D:/mygit/laojiuxuetang/myProject/files/RandomFile副本.txt";
	public static void main(String[] args) {
		File file=new File(PathName1);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try(RandomAccessFile randfile=
				new RandomAccessFile(file, "rw")){
			randfile.setLength(0);     //清空
			for (int i = 0; i < 2000; i++) {
				randfile.writeInt(i+2000);
			}
			//读取
			System.out.println("当前文件大小为："+randfile.length()+"字节！");
			randfile.seek(4*8);   //整型4字节  相当于第8个数
			System.out.println("移动8个字节："+randfile.readInt());
			randfile.seek(4*800);   //整型4字节  相当于第800个数
			System.out.println("移动800个字节："+randfile.readInt());
			//修改当前指针的内容
			randfile.seek(4*800);
			randfile.writeInt(520);
			randfile.seek(4*800);
			System.out.println("修改以后字节："+randfile.readInt());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		copy();
	}
	public static void copy() {
		//两个文件必须存在
		try(
			RandomAccessFile rfile1=new RandomAccessFile(new File(PathName1), "r");
				RandomAccessFile rfile2=new RandomAccessFile(new File(PathName2), "rw");
				){
			//核心代码  以字节数组形式读取
			int filelength=(int) rfile1.length();
			byte[] bytes=new byte[filelength];
			rfile1.readFully(bytes);
			rfile2.write(bytes);
			System.out.println("文件复制成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
