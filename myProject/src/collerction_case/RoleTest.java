package collerction_case;
/**
 * ������
 * @author 15281
 *
 */
public class RoleTest {
	public static void main(String[] args) {
		RoleBiz roleBiz=new RoleBiz();
				
		Role role1=new Role("÷����", "�������1", 100, 500);
		Role role2=new Role("÷����", "�������2", 200, 400);
		Role role3=new Role("÷����", "�������3", 300, 300);
		Role role4=new Role("÷����", "�������4", 400, 200);
		Role role5=new Role("÷����", "�������5", 500, 100);
		
		roleBiz.add(role1);
		roleBiz.add(role2);
		roleBiz.add(role3);
		roleBiz.add(role4);
		roleBiz.add(role5);
		
		roleBiz.show();
		//�������������   ������new���¶���ɾ����ʱ��,x��Ҫ�õ�equal����
		Role role6=new Role("÷����", "�������4", 400, 200);
		roleBiz.delete(role6);
		roleBiz.show();
		
		Role role7=new Role("÷����", "love", 400, 200);
		roleBiz.update(role7);
		roleBiz.show();
		
		System.out.println("�����");
		roleBiz.sort();
		roleBiz.show();
		
		
		roleBiz.reverse();
		System.out.println("��ת֮��");
		roleBiz.show();
	}
}
