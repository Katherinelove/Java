package binaryFind;

import java.util.Scanner;

/**
 * ���ַ����ң�ǰ���Ǳ�������������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��7�� ����2:52:42
 */
public class BinaryFind {
//	����ԭ��
//	���Ƚ�Ҫ���ҵ�Ԫ�أ�key����������м�Ԫ�رȽ�
//	1.���Key���м�Ԫ��С��ֻҪ�������ǰһ��Ԫ���м������ң�high=mid-1��
//	2.���Key���м�Ԫ����ȣ�ƥ��ɹ��� ���ҽ���
//	3.���Key���м�Ԫ�ش�ֻҪ������ĺ�һ��Ԫ���м������ң�low=mid+1��
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		//���ַ�ǰ��������������
		int[] nums= {3,12,24,36,48,56,78,99};
		System.out.print("��������Ҫ���ҵ�������");
		int searchNum=console.nextInt();
		
		boolean isFind=false;        //���ұ�־��Ĭ��û�в��ҵ�
		int low=0;                   //��Сֵ�±꣨��ʼֵ��
		int hight=nums.length-1;     //���ֵ�±꣨��ʼֵ��
		int searchIndex=-1;          //��¼����ֵ���±�
	
		//��֪�����Ҵ���
		while(hight>=low) {
			int mid=(hight+low)/2;   //�м�ֵ��
			if(searchNum<nums[mid]) {      //��¼�����±꣬�Ƚϵ���ֵnums[�±�]
				hight=mid-1;
			}else if(searchNum>nums[mid]) {
				low=mid+1;
			}else {
				//������ ��λһ��hight=low=mid
				isFind=true;
				searchIndex=mid;
				break;
			}
		}
		
		
		//ѭ�����ӡ
		if(isFind) {
			System.out.printf("�ҵ��ˣ�����ҵ�ֵ�±�Ϊ%d\n",searchIndex);
		}else {
			System.out.println("�Բ���û���ҵ�����ҵ����֣�");
		}
		
	}

}
