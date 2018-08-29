package iofile_using;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * ��������������--��ȡ�����ַ����ݣ�������ʱ���ٶȿ죬ƽʱ������filestream
 * ˼·һ��
 * ʹ�ô��������(�൱��װ����) ���Ӷ�дЧ��
 * �ȹرջ�����  �ڹر��ļ���
 * ���������������Ķ��������޸� 
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��24�� ����3:00:00
 */
public class BufferIoStreamDemo {
	public static final String PathName1="E:/teacher_liao/Html/1.txt";
	public static final String PathName2="E:/teacher_liao/Html/2.txt";
	public static void main(String[] args) {
		File file=new File(PathName1);
		InputStream inputStream=null;    //��try-catch���涨�巽��ر���Դ
		
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedInputStream bInoputStream=new 
				BufferedInputStream(inputStream);
		
		try {
			byte[] bytes=new byte[bInoputStream.available()];
			bInoputStream.read(bytes);
			String content=new String(bytes);
			System.out.println("��ȡ���ݣ�"+content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bInoputStream.close();
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//д���ļ�
		BufferedOutputStream bOutputStream=null;
		try {
			bOutputStream=
					new BufferedOutputStream(new FileOutputStream(PathName2));
			//�½��ֽ����飨�൱�ڻ�������
			StringBuffer bString=new StringBuffer("");
			bString.append("sb,��׷�Ұ�");
			bString.append("�ܶ���");
			System.out.println();
			bOutputStream.write(bString.toString().getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
