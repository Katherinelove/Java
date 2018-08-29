package iofile_using;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.print.DocFlavor.STRING;

/**
 * ##jdk1.7֮���Զ��ر���Դд��    -��bug�����������쳣�յ�����
 * ##��ȡϵͳ�Դ��ָ���
 * ##�����쳣�յ�����  ����ֶ�����
 * �ַ���
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��25�� ����9:17:44
 */
public class ReaderAndWriter {
	public static final String PathName1="E:/teacher_liao/Html/1.txt";
	public static final String PathName2="E:/teacher_liao/Html/love.txt";
	
	//��ȡ ϵͳ�Դ��ķָ���  WindowsĬ��\r\n
	public static final String separator=System.getProperty("line.separator");
	
	public static void main(String[] args) {
		read();
		writer();

	}

	private static void writer() {
		//��ȡ������
		StringBuffer content=new StringBuffer("����");
		content.append(separator);
		content.append("��ϲ����");
		content.append(separator);
		content.append("��ϲ����");
		content.append(separator);
		content.append("��ϲ����");
		content.append(separator);
		content.append("��Ҫ������˵����");
		//jdk1.7֮���Զ��ر���Դд��
		try(BufferedWriter bWriter=new BufferedWriter(new FileWriter(PathName2))){
			bWriter.write(content.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e){
			//����bwriter.close���׳�IOException,������쳣���½ṹ������
			//���´��������鿴�����Ƶ��쳣��Ϣ
			//˼·:���������쳣���жϲ��������쳣�Ƿ�Ϊ�գ�ץȡ�����Ƶ��쳣������ӡ
			if(e.getSuppressed()!=null) {
				//getSuppressed() ���ص��Ǹ���Throwable[]
				Throwable[] throwables=e.getSuppressed();
				for(Throwable throwable :throwables) {
					System.out.println(throwable+"case by"+throwable.getClass().getSimpleName());
				}
			}
		}
	}

	private static void read() {
		File file=new File(PathName1);
		if(!file.exists()) {
			System.out.println("��ȡ���ļ������ڣ�");
		}
		Reader readerStream=null;
		BufferedReader bReaderStream=null;
		try {
			readerStream=new FileReader(file);
			bReaderStream=new BufferedReader(readerStream);
			//Reader������ ����1��1�еĶ�ȡ   ���Ĵ���
			//readline�������ص���string��
			String line="";
			while((line=bReaderStream.readLine())!=null) {
				//��ȡһ�д�ӡһ��
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
