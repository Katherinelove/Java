package modify_songLry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 修改歌词部分内容
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年9月1日 下午2:53:58
 */
public class ModifiedLry {
	public static final String PathName="因为爱情.txt";
	public static final String PathName1="因为爱情修改版.txt";
	public static void main(String[] args) {
		
		//1.读取歌词
		String content=readLry(PathName);
		System.out.println("修改歌词之前：");
		System.out.println(content);
		//2.修改歌词？？？？为什么？？
		//replaceAll 要返回新对象
		String newConten=content.replaceAll("E","女").
				replaceAll("F", "男").replaceAll("E&F", "合唱");
		System.out.println("修改歌词之后：");
		System.out.println(newConten);
		//3.存储歌词
		restore(PathName1,newConten,false);

	}
	private static void restore(String pathname, String content, boolean append) {
		// 存储歌词
		try(
				BufferedWriter bwriter=
				new BufferedWriter(new FileWriter(new File(pathname),append))
				){
			bwriter.write(content);
			System.out.println("存储完毕！");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static String readLry(String pathname) {
		// 读取歌词
		StringBuffer content=new StringBuffer();
		try(
				BufferedReader breader=
				new BufferedReader(new FileReader(new File(pathname)))
				){
			String line=null;
			while((line=breader.readLine())!=null) {
				content.append(line);
				content.append(System.getProperty("line.separator"));
			}
			//删除最后一个添加的\n
			content.delete(content.lastIndexOf(
					System.getProperty("line.separator")), content.length()-1);
//			System.out.println("读取完毕");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content.toString();
	}

}
