package insert;

import java.util.Scanner;

/**
 * insert算法：前提也是数组有序,必须开拓空间
 * 1.找到要插入元素的下标（找到第一个大于要插入元素的下标）
 * 2.从最后一个元素开始   nums[i]=num[i-1]
 * 直到insetIndex结束
 * 3.在inserIndex处赋值
 * 4.总个数+1
 * 
 * 对于有序数列插入，可以在数列后插入后再排序
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月7日 下午3:43:13
 */
public class Insert {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		//二分法前提是是有序数组
		int[] nums= {3,12,24,36,48,56,78,99};
		System.out.print("请输入你要插入的整数：");
		int insertNum=console.nextInt();
		
		//拓展空间   复制数组
		int[] numsInsert=copyNums(nums);
		
		//找到要插入元素的下标（找到第一个大于要插入元素的下标）
		int insertIndex=findIndex(insertNum,numsInsert);
		
		//从最后一个元素开始   nums[i]=num[i-1]
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
		// 从最后一个元素开始   nums[i]=num[i-1] 到insetIndex为止,在对insetIndex赋值
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
