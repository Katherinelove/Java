package collecttion_using;
/**
 * ���ϳ��أ��ڴ����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��5�� ����3:53:04
 */
import java.util.*;


public class setUsing {
	
	public static void main(String[] args) {
		//����һ��Ӣ�ģ����ָ��word����
		Scanner console=new Scanner(System.in);
		
		System.out.print("������Ӣ�ģ�");
		Set words=tokenSet(console.nextLine());
		System.out.printf("���ظ��ĵ�����%d��",words.size(),words);

	}
	static Set tokenSet(String line) {
		// TODO Auto-generated method stub
		String[] tokens=line.split(" ");
		 //ʹ������hashsetʵ���ռ���ȥ���ַ���
		return new HashSet(Arrays.asList(tokens)); 
	}


}
