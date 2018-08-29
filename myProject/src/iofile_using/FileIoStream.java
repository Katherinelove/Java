package iofile_using;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ��ԭʼ���ļ�����ȡ
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��23�� ����8:59:41
 */
public class FileIoStream {
	//�ļ���
	public static final String pathName="E:/teacher_liao/Html/1.js";
	public static void main(String[] args) {
		try {
			fileRead();
			System.out.println("��ȡ������ϣ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fileWrite();
			System.out.println("д���ļ���ϣ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void fileWrite() throws IOException {
		//д���ļ�
		final String pathName1="E:/teacher_liao/Html/1.txt";
		//����ֱ�������ļ���
		OutputStream outputStream=new FileOutputStream(pathName1);
		String content="���� ilove you��";
		//�ַ���ת�ֽ�����
		outputStream.write(content.getBytes());
		outputStream.close();
	}

	private static void fileRead() throws IOException {
		// ��ȡ�ļ�  ��--�ر�
		File file1=new File(pathName);
		InputStream inputStream=new FileInputStream(file1);
		//����bytes[]������ȡ�ֽ�
		byte[] bytes=new byte[(int) file1.length()];
		//��ȡ��bytes��
		inputStream.read(bytes);
		//���ֽ�����תΪ�ַ���
		String content=new String(bytes);
		System.out.println(content);
		
		//�ر�
		inputStream.close();
	}
}
