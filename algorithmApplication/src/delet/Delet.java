package delet;

import java.util.Scanner;

/**
 * delet�㷨   �������飬�����±����
 * 1.�ҵ�Ҫɾ��Ԫ�ص��±� delIndex
 * 2.��Ҫɾ���±꿪ʼ������һ��Ԫ�ظ�ֵ��ǰ��һ��Ԫ�أ������ǣ�
 * ������һ��bug������Խ�磬��ֻ�ܽ����һ����ֵ�������ڶ�����
 * numsp[i]=nums[i+1]
 * 3.�����ܳ���-1
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��7�� ����3:43:55
 */
public class Delet {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		//���ַ�ǰ��������������
		int[] nums= {3,12,24,36,48,56,78,99};
		System.out.print("��������Ҫdelete��������");
		int searchNum=console.nextInt();
		
		boolean isFind=false;        //���ұ�־��Ĭ��û�в��ҵ�
		int low=0;                   //��Сֵ�±꣨��ʼֵ��
		int hight=nums.length-1;     //���ֵ�±꣨��ʼֵ��
		int delIndex=-1;          //��¼����ֵ���±�
		
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
				delIndex=mid;
				break;
			}
		}
		
		
		//ѭ�����ӡ
		if(isFind) {
			System.out.printf("�ҵ��ˣ��㽫delete��ֵ�±�Ϊ%d\n",delIndex);
			delete(nums,delIndex);
			printNums(nums);
		}else {
			System.out.println("�Բ���û���ҵ��㽫ɾ�������֣�");
		}
		
	}

	private static void printNums(int[] nums) {
		// ע���������һ�����ڣ����۷�
		for (int i = 0; i < nums.length-1; i++) {
			System.out.print(nums[i]+"\t");
		}
		
	}

	private static void delete(int[] nums,int delIndex) {
		// TODO Auto-generated method stub
		for (int i =delIndex; i < nums.length-1; i++) {
			//��ʼֵΪdelIndex  ��ֹʱΪ�����ڶ�����ע���������һ�����ڣ����۷�
			nums[i]=nums[i+1];
		}
		
	}



}
