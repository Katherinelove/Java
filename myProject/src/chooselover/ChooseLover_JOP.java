package chooselover;

/**
 * ��ѡ��  ����̨��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��8�� ����10:35:35
 */
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ChooseLover_JOP {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//����ĳ�ʼ����
		int loveCount=5;
		//�������� ,Ԥ���ռ�,���ʮ������
		String[] names= {"��ʩ","����","���Ѿ�","����","�缧","","","","",""};
		//Ұ����Ů
		String[] btgirs= {"���","�Է���","槼�","С��","��ԲԲ"};
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
			//��ӡ�˵�			// ѡ�����
			int choose=printMenu(gameday);

			//��ֹ�����Ӧ��������
			switch (choose) {
			case 1:
				// 1���ʵ���ּѡ��\t\t������)  ���룬�ж���������
				if(loveCount==names.length) {
					JOptionPane.showInternalMessageDialog(null, "�ʵ۱��£����Ѿ�����Ϊ�����Ѿ�����֮����ѡ��ʧ�ܣ�",
							"ѡ��", 0, new ImageIcon("images/����֮��.jpg"));
//					System.out.println("�ʵ۱��£����Ѿ�����Ϊ�����Ѿ�����֮����ѡ��ʧ�ܣ�");
					break;
				}else {
					//����   ��������  �ø߶����� ��������  Ĭ�ϸ���
					Object ob2=JOptionPane.showInputDialog(null, "���£��������������䣺", 
							"ѡ��", 0, new ImageIcon("images/ѡ��.jpg"),btgirs, null);
//					System.out.print("���£��������������䣺");
					String newName=ob2.toString();
					//�������飬Ĭ�ϸ������±�
					names[loveCount]=newName;
					//��ʼ����Ϊ���˲���
					//��ʼ�øж�100���������Ӻøж�-10
					for (int i = 0; i < loveCount; i++) {
						love[i]-=10;
					}
					String str1="����:"+newName+"�ɹ���\n";
					str1+="�������Ӻøж�-10������\n";
					JOptionPane.showMessageDialog(null,str1,
							newName, 0, 
							new ImageIcon("images/"+newName+".jpg"));
//					System.out.println("����:"+names[loveCount]+"�ɹ���");
//					System.out.println("�������Ӻøж�-10������"+loveCount);
					loveCount++;
				}
				break;
			case 2: //���Ƴ���\t\t���޸�״̬��  �Ȳ��ң��ٳ��ң�+20������-10��
				Object ob3=JOptionPane.showInputDialog(null, "���£��������������䣺", 
						"ѡ��", 0, new ImageIcon("images/����.jpg"),names, null);
				String name=ob3.toString();
//				System.out.print("���£��������������䣺");
//				String name=input.next();
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
					JOptionPane.showMessageDialog(null,"���£���Ҫ�������Ҫ�����ʵ��",
							"����", 0, new ImageIcon("images/�����ʵ.jpg"));
//					System.out.println("���£���Ҫ�������Ҫ�����ʵ��");
					break;   //��Ҫ�ɲ�Ҫ��������һ��break��ֱ����ֹ���ɼ�break��
				}else {
					//���ҵ�֮�󣬳��Ҳ���(+20��������һ��)
					love[searchIndex]+=20;
					//����
					if(level[searchIndex]>=levelNames.length) {
						JOptionPane.showMessageDialog(null,names[searchIndex]+"�Ѿ�ĸ�����£�",
								"��ְ", 0, new ImageIcon("images/ĸ������.jpg"));
//						System.out.println(names[searchIndex]+"�Ѿ�ĸ�����£�");
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
				String message="����"+names[searchIndex]+"�ɹ����øж�+20����������-10��\n";
				message+=names[searchIndex]+"����Ϊ"+levelNames[level[searchIndex]];
				JOptionPane.showMessageDialog(null, message,
						"����"+names[searchIndex]+"��", 0, 
						new  ImageIcon("images/"+names[searchIndex]+".jpg"));
//				System.out.println("����"+names[searchIndex]+"�ɹ����øж�+20����������-10��");
//				System.out.println(names[searchIndex]+"����Ϊ"+levelNames[level[searchIndex]]);
			    break;
			case 3:  //3�������乬\t\t��ɾ����
				Object ob4=JOptionPane.showInputDialog(null, "���£��������������֣�",
						"�����乬", 0, new ImageIcon("images/�����乬.jpg"), 
						names, null);
				String lgName=ob4.toString();
//				System.out.print("���£��������������֣�");
//				String lgName=input.next();
				//����ɾ��������±�
				int searchLgNameIndex=Integer.MIN_VALUE;
				for (int i = 0; i < loveCount; i++) {
					if(lgName.equals(names[i])) {
						searchLgNameIndex=i;
					}
				}
				if(searchLgNameIndex==Integer.MIN_VALUE) {
					JOptionPane.showMessageDialog(null, 
							"���£����޴����ˣ�"+lgName+"��\n�����´��",
							"�����乬", 0);
//					System.out.println("���£����޴����ˣ�"+lgName+"��\n�����´��");
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
					JOptionPane.showMessageDialog(null, lgNames[countLg]+"�������乬��",
							"�����乬", 0,
							new ImageIcon("images/"+lgNames[countLg]+".jpg"));
//					System.out.println(lgNames[countLg]+"�������乬��");
				}
			    break;
			case 4://4���޵İ�����\t\t�����ң�
				Object ob5=JOptionPane.showInputDialog(null,"���£�����������Ѱ��ǧ�ٵ����",
						"Ѱ�Ұ���", 0, new ImageIcon("images/��檳�Ⱥ.jpg"), 
						names, null);
				String searchName=ob5.toString();
//				System.out.print("���£�����������Ѱ��ǧ�ٵ����");
//				String searchName=input.next();
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
					JOptionPane.showMessageDialog(null, names[searchIdx]+":���£�����ڴˣ�",
							"�����ڴ�", 0, new ImageIcon("images/"+ names[searchIdx]+".jpg"));
//					System.out.println(names[searchIdx]+":���£�����ڴˣ�");
				}
			    break;
			default:
				
//				System.out.println("��������1-4֮�������!");
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
				JOptionPane.showMessageDialog(null,
						"������������øжȵ���60���󹬱��ң�ǿ���˳���",
						"�󹬱���", 0, new ImageIcon("images/����.jpg"));
//				System.out.println("������������øжȵ���60���󹬱��ң�ǿ���˳���");
				System.exit(0);
			}
			
			//ÿһ��ѡ�񣬴�ӡ����Ϣ
			printLove(loveCount,names,levelNames,level,love);
			gameday++;
		}
		
	}


	private static void printLove(int loveCount, String[] names, String[] levelNames, int[] level,int[] love) {
		// ע��������Ŀ�ı仯
		String message="����        ����        �øж�\n";
		message+="========================================\n";
		for (int i = 0; i < loveCount; i++) {
			message+=names[i]+"        "+levelNames[level[i]]+"        "+love[i]+"\n";
		}		
		JOptionPane.showMessageDialog(null, message, "ÿ�����",0, new ImageIcon("images/ÿ�����.jpg"));
//		System.out.println("����\t����\t�øж�");
//		System.out.println("========================================");
//		for (int i = 0; i <loveCount; i++) {
//			System.out.println(names[i]+"\t"+levelNames[level[i]]+"\t"+love[i]);
//		}
//		//������
//		System.out.println();
//		System.out.println();
	}

	/**
	 * 
	 * @param gameday ��Ϸִ������
	 * @return
	 */
	private static int printMenu(int gameday) {
		// TODO Auto-generated method stub
		String message="��Ϸ���е�"+gameday+"��\n";
		message+="�˵���\n";
		message+="========================================\n";
		message+="1���ʵ���ּѡ��\n";
		message+="2�����Ƴ���\n";
		message+="3�������乬\n";
		message+="4���޵İ���\n";
		String[] menuNum= {"1","2","3","4"};
		Object ob1=JOptionPane.showInputDialog(null, message, "������", 
				0, new ImageIcon("images/�󹬼�����ǧ.jpg"), 
				menuNum,null);
		int choose=Integer.parseInt(ob1.toString());
		return choose;
		
//		System.out.println("��Ϸ���е�"+gameday+"��");
//		System.out.println("�˵���");
//		System.out.println("========================================");
//		System.out.println("1���ʵ���ּѡ��\t\t�����ӣ�");
//		System.out.println("2�����Ƴ���\t\t���޸�״̬��");
//		System.out.println("3�������乬\t\t��ɾ����");
//		System.out.println("4���޵İ�����\t\t�����ң�");
//		System.out.println("========================================");
//		System.out.print("������ѡ��");
	}


}
