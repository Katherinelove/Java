package stringbufferusing;
/**
 * sringbuffer��stringbuilder������
 * ��ʾ��������ַ���  Ĭ�϶��16�ֽڿռ䣬ƴ���ǲ���Ҫnew����
 * ʵ�ֶ��ַ�������ɾ�Ĳ�
 * stringbuilder��sringbuffer����
 * ����stringbuilder��sringbuffer����ȫ�����߳�ͬ�������˿���ͬʱ�޸�
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��19�� ����11:04:05
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer strBuffer=new StringBuffer("abcd");
		//��
		strBuffer.append("love");
		System.out.println(strBuffer);
		strBuffer.insert(0, "hello");
		System.out.println(strBuffer);
		//ɾ
		strBuffer.deleteCharAt(1);
		System.out.println(strBuffer);
		//��
		strBuffer.replace(0, 2, "hehe");
		System.out.println(strBuffer);
		//����
		strBuffer.reverse();
		System.out.println(strBuffer);
		

	}

}
