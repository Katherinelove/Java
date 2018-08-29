package iofile_using;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

import javax.sound.midi.SysexMessage;
import javax.swing.JFileChooser;

/**
 * �ļ�/Ŀ¼��ʹ��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��23�� ����6:34:19
 */
public class FileDemo {
	public static final String PathName="E:/teacher_liao";  //.��ʾ���̸�Ŀ¼
	public static void main(String[] args) {
		JFileChooser fileChooser=new JFileChooser(PathName);   //�����ļ��Ի����ʱ�ĸ�Ŀ¼
		//����JFileChooserѡ����  ѡ��Ŀ¼Ĭ��mode��ֻ��ѡ��Ŀ¼�� ʹ��ǰ�Լ�����
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		//����������Ĭ�Ϲ�����   ע������Ĺ���������ʱһ��FileFiter��
//		fileChooser.setFileFilter(new myFileFilter());
//		myFileFilter�̳���FileFiter��                    ���̳�FilenameFilte�ӿ��÷�һ��
		fileChooser.showOpenDialog(null);  //��ʾѡ���ļ��Ի���
		File file=fileChooser.getSelectedFile(); //��ȡѡ����ȡ���ļ�
		
//		File file=new File(PathName);
		
		//����trycatch�Ļ�  �����ж�
		if(file==null) {
			//���ȡ������null
			System.out.println("δѡ���ļ���ǿ���˳���");
			System.exit(0);
		}
		System.out.println("�ļ���Ŀ¼�Ƿ���ڣ�"+file.exists());
		System.out.println("�ļ���Ŀ¼�Ƿ����ļ���"+file.isFile());
		System.out.println("�ļ���Ŀ¼�Ƿ���Ŀ¼��"+file.isDirectory());
		System.out.println("�ļ���Ŀ¼�Ƿ�Ϊ�����ļ���"+file.isHidden());
		System.out.println("�ļ���Ŀ¼���ƣ�"+file.getName());
		System.out.println("����޸�ʱ�䣺"+new Date(file.lastModified()).toLocaleString());  //lastModified()�Ǹ�������ʱ��
		System.out.println("�ļ���Ŀ¼���·����"+file.getPath());
		System.out.println("�ļ���Ŀ¼����·����"+file.getAbsolutePath());
		
		System.out.println("�Ƿ�ɶ���"+file.canRead());
		System.out.println("�Ƿ��д��"+file.canWrite());
		System.out.println("�ļ���С��"+file.length()+"�ֽ�");
		System.out.println("��ǰĿ¼����Ŀ¼�����б�");
		String[] mulu=file.list();    //��������ļ�������
		for (int i = 0; i < mulu.length; i++) {
			System.out.println(mulu[i]);
		}
		
		System.out.println("ֻѡ��.exe�ļ�");
		String[] fileNames=file.list(new DirFilter());
		for (int i = 0; i < fileNames.length; i++) {
			System.out.println(fileNames[i]);
		}
	}
	
	//�ļ�������ʹ���ڲ���   ����Ӿ�̬��Ϊ��mian������ֱ��ʹ��
	public static class DirFilter implements FilenameFilter{
		//��д
		@Override
		public boolean accept(File dir, String name) {
			if(name.endsWith("exe")) {
				return true;
			}
			return false;
		}
		
	}
}
