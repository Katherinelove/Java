package modify_songLry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �޸ĸ�ʲ�������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��9��1�� ����2:53:58
 */
public class ModifiedLry {
	public static final String PathName="��Ϊ����.txt";
	public static final String PathName1="��Ϊ�����޸İ�.txt";
	public static void main(String[] args) {
		
		//1.��ȡ���
		String content=readLry(PathName);
		System.out.println("�޸ĸ��֮ǰ��");
		System.out.println(content);
		//2.�޸ĸ�ʣ�������Ϊʲô����
		//replaceAll Ҫ�����¶���
		String newConten=content.replaceAll("E","Ů").
				replaceAll("F", "��").replaceAll("E&F", "�ϳ�");
		System.out.println("�޸ĸ��֮��");
		System.out.println(newConten);
		//3.�洢���
		restore(PathName1,newConten,false);

	}
	private static void restore(String pathname, String content, boolean append) {
		// �洢���
		try(
				BufferedWriter bwriter=
				new BufferedWriter(new FileWriter(new File(pathname),append))
				){
			bwriter.write(content);
			System.out.println("�洢��ϣ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static String readLry(String pathname) {
		// ��ȡ���
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
			//ɾ�����һ����ӵ�\n
			content.delete(content.lastIndexOf(
					System.getProperty("line.separator")), content.length()-1);
//			System.out.println("��ȡ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content.toString();
	}

}
