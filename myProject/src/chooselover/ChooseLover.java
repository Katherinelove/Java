package chooselover;

import java.util.Scanner;


/**
 * ��ѡ��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��8�� ����10:35:35
 */
public class ChooseLover {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//����ĳ�ʼ����
		int loveCount=5;
		//�������� ,Ԥ���ռ�,���ʮ������
		String[] names= {"��ʩ","����","���Ѿ�","����","�缧","","","","",""};
		//�乬��������
		String[] lgNames=new String[] {"","","","","","","","","",""};
		
		//��������
		String[] levelNames= {"����","����","����","�ʹ���","�ʺ�"};
		//��Ӧ������levelNamesһ��ʹ��
		int[] level= new int[10];
		//�øж�
		int[] love=new int[10];
		//����Ĭ��5���Ϻøж�100��
		for (int i = 0; i <love.length ; i++) {
			love[i]=100;
		}

		//��Ϸ��ʼֵΪ��1�죬Ĭ���ܹ�10��
		int gameday=1;
		
		
		//��ѭ��
		while(gameday<=10) {
			//��ӡ�˵�
			printMenu(gameday);
			// ѡ�����
			int choose=input.nextInt();
			//��ֹ�����Ӧ��������
			switch (choose) {
			case 1:
				// 1���ʵ���ּѡ��\t\t������)  ���룬�ж���������
				if(loveCount==names.length) {
					System.out.println("�ʵ۱��£����Ѿ�����Ϊ�����Ѿ�����֮����ѡ��ʧ�ܣ�");
					break;
				}else {
					//����   ��������  �ø߶����� ��������  Ĭ�ϸ���
					System.out.print("���£��������������䣺");
					String newName=input.next();
					//�������飬Ĭ�ϸ������±�
					names[loveCount]=newName;
					//��ʼ����Ϊ���˲���
					//��ʼ�øж�100���������Ӻøж�-10
					for (int i = 0; i < loveCount; i++) {
						love[i]-=10;
					}
					System.out.println("����:"+names[loveCount]+"�ɹ���");
					System.out.println("�������Ӻøж�-10������"+loveCount);
					loveCount++;
				}
				break;
			case 2: //���Ƴ���\t\t���޸�״̬��  �Ȳ��ң��ٳ��ң�+20������-10��
				System.out.print("���£��������������䣺");
				String name=input.next();
				//��¼��ѯ���±�
				int searchIndex=Integer.MIN_VALUE;
				
				//δ���� for()˳����Ҳ���,ѭ�����жϲ����������ڴ濪��
				for (int i = 0; i < loveCount; i++) {
					//�ַ����Ƚ�
					if(name.compareTo(names[i])==0) {
						searchIndex=i;
						break;
					}
				}
				if(searchIndex==Integer.MIN_VALUE) {
					System.out.println("���£���Ҫ�������Ҫ�����ʵ��");
					break;   //��Ҫ�ɲ�Ҫ��������һ��break��ֱ����ֹ���ɼ�break��
				}else {
					//���ҵ�֮�󣬳��Ҳ���(+20��������һ��)
					love[searchIndex]+=20;
					//����
					if(level[searchIndex]>=levelNames.length) {
						System.out.println(names[searchIndex]+"�Ѿ�ĸ�����£�");
					}
					level[searchIndex]++;
					
					for (int i = 0; i < loveCount; i++) {
						//�ѽ���ҵı�������
						if(i==searchIndex) {
							continue;
						}else {
							love[i]-=10;
						}						
					}			
				}
				//��ӡ��Ϣ
				System.out.println("����"+names[searchIndex]+"�ɹ����øж�+20����������-10��");
				System.out.println(names[searchIndex]+"����Ϊ"+levelNames[level[searchIndex]]);
			    break;
			case 3:  //3�������乬\t\t��ɾ����
				System.out.print("���£��������������֣�");
				String lgName=input.next();
				//����ɾ��������±�
				int searchLgNameIndex=Integer.MIN_VALUE;
				for (int i = 0; i < loveCount; i++) {
					if(lgName.equals(names[i])) {
						searchLgNameIndex=i;
					}
				}
				if(searchLgNameIndex==Integer.MIN_VALUE) {
					System.out.println("���£����޴����ˣ�"+lgName+"��\n�����´��");
					continue;
				}else {
					//�����乬  ��bug �ἷ��ͬһλ�õċ݋�
					//�����乬�е�������Ŀ
					int countLg=0;
					for (int i = 0; i < lgNames.length; i++) {
						if(!(lgNames[i].equals(""))) {
							countLg++;
						}
					}
					//��������Խ��
//					System.out.println(countLg+"---"+searchLgNameIndex);
					lgNames[countLg]=names[searchLgNameIndex];
					//ɾ������
					for (int i =searchLgNameIndex ; i < loveCount; i++) {
						names[i]=names[i+1];
					}
					loveCount--;
					System.out.println(lgNames[countLg]+"�������乬��");
				}
			    break;
			case 4://4���޵İ�����\t\t�����ң�
				System.out.print("���£�����������Ѱ��ǧ�ٵ����");
				String searchName=input.next();
				//����ɾ��������±�
				int searchIdx=Integer.MIN_VALUE;
				for (int i = 0; i < loveCount; i++) {
					if(searchName.equals(names[i])) {
						searchIdx=i;
					}
				}
				if(searchIdx==Integer.MIN_VALUE) {
					System.out.println("���£���������Ҫ�����ʵ!û�д�"+searchName+"���");
				}
				else {
					System.out.println(names[searchIdx]+":���£�����ڴˣ�");
				}
			    break;
			default:
				System.out.println("��������1-4֮�������!");
				//Ϊ�˷�ֹ���ѭ������������1
				continue;
			}
			//��������øжȵ���60�򣬷������ң�ǿ���˳�
			//����øжȵ���60���������
			int countLowLove=0;
			for (int i = 0; i < loveCount; i++) {
				if(love[i]<60) {
					countLowLove++;
				}
			}
			if(countLowLove>=3) {
				System.out.println("������������øжȵ���60���󹬱��ң�ǿ���˳���");
				System.exit(0);
			}
			
			//ÿһ��ѡ�񣬴�ӡ����Ϣ
			printLove(loveCount,names,levelNames,level,love);
			gameday++;
		}
		
	}


	private static void printLove(int loveCount, String[] names, String[] levelNames, int[] level,int[] love) {
		// ע��������Ŀ�ı仯
		System.out.println("����\t����\t�øж�");
		System.out.println("========================================");
		for (int i = 0; i <loveCount; i++) {
			System.out.println(names[i]+"\t"+levelNames[level[i]]+"\t"+love[i]);
		}
		//������
		System.out.println();
		System.out.println();
	}


	private static void printMenu(int gameday) {
		// TODO Auto-generated method stub
		System.out.println("��Ϸ���е�"+gameday+"��");
		System.out.println("�˵���");
		System.out.println("========================================");
		System.out.println("1���ʵ���ּѡ��\t\t�����ӣ�");
		System.out.println("2�����Ƴ���\t\t���޸�״̬��");
		System.out.println("3�������乬\t\t��ɾ����");
		System.out.println("4���޵İ�����\t\t�����ң�");
		System.out.println("========================================");
		System.out.print("������ѡ��");
	}

}
