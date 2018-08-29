package iofile_using;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.omg.CORBA.portable.OutputStream;

/**
 * 处理非字符数据   用的缓存流Bufferin/outputStream
 * 实现复制功能（剪切只是多一个 文件delete()）
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月24日 下午8:36:32
 */
public class Copy {
	private static final String PathName1="E:/teacher_liao/Html/1.txt";
	private static final String PathName2="E:/teacher_liao/Html/1复制文件.txt";
	public static void main(String[] args) {
		long deltaTime=copyByRWTimes();
		System.out.println("用时："+deltaTime+"msec");
	}
	private static long copyByRWTimes() {
		long startTime=System.currentTimeMillis();
		copyByRW();
		long endTime=System.currentTimeMillis();
		return endTime-startTime;
	}
	private static void copyByRW() {
		// copy 核心代码
		File file=new File(PathName1);
		InputStream InStream=null;
		BufferedInputStream bInStream=null;
	
		FileOutputStream outStream=null;      //为什么只能使用子类？
		BufferedOutputStream bOutStream=null;
		try {
			InStream = new FileInputStream(PathName1);
			bInStream=
					new BufferedInputStream(InStream);
			outStream=new FileOutputStream(PathName2);
			bOutStream=new BufferedOutputStream(outStream);
			
			//这里可以一个字节一个字节读取，不用显示，就不用byte[]数组存储了
			//byte数组就相当于缓存
			//固定代码
			int i=-1;  //读取字符数据，临时变量
			//bufferInputStream().read()无参时，读取完毕为-1
			while((i=bInStream.read())!=-1) {
				//一边读取一边写入
				//***这里写入到缓存中，如果不关闭资源/.flush()的话，硬盘中没用写入成功！##
				bOutStream.write(i);   
			}
			
			//提示
			System.out.println("copy成功！");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
//				bOutStream.flush();
				//.close()中强制.flush（）
				//没用.close()  无法成功写入！
				bOutStream.close();    
				outStream.close();
				bInStream.close();
				InStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
	
	

}
