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
 * ������ַ�����   �õĻ�����Bufferin/outputStream
 * ʵ�ָ��ƹ��ܣ�����ֻ�Ƕ�һ�� �ļ�delete()��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��24�� ����8:36:32
 */
public class Copy {
	private static final String PathName1="E:/teacher_liao/Html/1.txt";
	private static final String PathName2="E:/teacher_liao/Html/1�����ļ�.txt";
	public static void main(String[] args) {
		long deltaTime=copyByRWTimes();
		System.out.println("��ʱ��"+deltaTime+"msec");
	}
	private static long copyByRWTimes() {
		long startTime=System.currentTimeMillis();
		copyByRW();
		long endTime=System.currentTimeMillis();
		return endTime-startTime;
	}
	private static void copyByRW() {
		// copy ���Ĵ���
		File file=new File(PathName1);
		InputStream InStream=null;
		BufferedInputStream bInStream=null;
	
		FileOutputStream outStream=null;      //Ϊʲôֻ��ʹ�����ࣿ
		BufferedOutputStream bOutStream=null;
		try {
			InStream = new FileInputStream(PathName1);
			bInStream=
					new BufferedInputStream(InStream);
			outStream=new FileOutputStream(PathName2);
			bOutStream=new BufferedOutputStream(outStream);
			
			//�������һ���ֽ�һ���ֽڶ�ȡ��������ʾ���Ͳ���byte[]����洢��
			//byte������൱�ڻ���
			//�̶�����
			int i=-1;  //��ȡ�ַ����ݣ���ʱ����
			//bufferInputStream().read()�޲�ʱ����ȡ���Ϊ-1
			while((i=bInStream.read())!=-1) {
				//һ�߶�ȡһ��д��
				//***����д�뵽�����У�������ر���Դ/.flush()�Ļ���Ӳ����û��д��ɹ���##
				bOutStream.write(i);   
			}
			
			//��ʾ
			System.out.println("copy�ɹ���");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
//				bOutStream.flush();
				//.close()��ǿ��.flush����
				//û��.close()  �޷��ɹ�д�룡
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
