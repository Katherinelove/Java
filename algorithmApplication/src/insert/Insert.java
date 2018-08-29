package insert;

import java.util.Scanner;

/**
 * insert�㷨��ǰ��Ҳ����������,���뿪�ؿռ�
 * 1.�ҵ�Ҫ����Ԫ�ص��±꣨�ҵ���һ������Ҫ����Ԫ�ص��±꣩
 * 2.�����һ��Ԫ�ؿ�ʼ   nums[i]=num[i-1]
 * ֱ��insetIndex����
 * 3.��inserIndex����ֵ
 * 4.�ܸ���+1
 * 
 * �����������в��룬���������к�����������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��7�� ����3:43:13
 */
public class Insert {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		//���ַ�ǰ��������������
		int[] nums= {3,12,24,36,48,56,78,99};
		System.out.print("��������Ҫ�����������");
		int insertNum=console.nextInt();
		
		//��չ�ռ�   ��������
		int[] numsInsert=copyNums(nums);
		
		//�ҵ�Ҫ����Ԫ�ص��±꣨�ҵ���һ������Ҫ����Ԫ�ص��±꣩
		int insertIndex=findIndex(insertNum,numsInsert);
		
		//�����һ��Ԫ�ؿ�ʼ   nums[i]=num[i-1]
		insert(insertNum,insertIndex,numsInsert);
		
		printNums(numsInsert);
	}

	private static void printNums(int[] numsInsert) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numsInsert.length; i++) {
			System.out.println(numsInsert[i]);
		}
	}

	private static void insert(int insertNum,int insertIndex, int[] numsInsert) {
		// �����һ��Ԫ�ؿ�ʼ   nums[i]=num[i-1] ��insetIndexΪֹ,�ڶ�insetIndex��ֵ
		for (int i =numsInsert.length-1; i >=insertIndex; i--) {
			numsInsert[i]=numsInsert[i-1];
		}
		numsInsert[insertIndex]=insertNum;
	}

	private static int findIndex(int searchNum,int[] nums) {
		// TODO Auto-generated method stub
		int index=-1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>searchNum) {
				index=i;
				break;
			}
		}
		return index;
	}

	private static int[] copyNums(int[] nums) {
		// TODO Auto-generated method stub
		int[] numsInsert=new int[nums.length+1];
		for (int i = 0; i < nums.length; i++) {
			numsInsert[i]=nums[i];
		}
		return numsInsert;
	}


}
