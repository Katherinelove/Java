package collerction_case;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Ӣ��ҵ����
 * 
 * @author 15281
 *
 */
public class RoleBiz {
	private static List<Role> roleList;
	
	public RoleBiz() {
		// ����Arraylsit����ȥʵ�ָ��ӿ�
		roleList = new ArrayList<>();
	}
	
	public void sort(){
		//V1.0�Լ���д ð�ݷ�����������
		//V2.0-1ʹ�����õĹ��߽�������--ǰ�����ʵ�ֱȽ��� Comparator�ӿ�
		//�Ƚ���ʵ�ֵ������ʽӿ�   Comparator<Role>
		//���ƣ�����ͨ�����巽�����Զ����������ݣ�ʵ����ȽϽӿ�д����
		Collections.sort(roleList, new RoleComparator_Attack());
		//V2.0-2ʵ����ʵ�� comparable�ӿ�  �ӿ�����ΪComparable<Role>
		//�ӿ�Ϊ���ݴ�     .java.lang����	
	}
	
	public void reverse(){
//		Collections.reverse(roleList);
		/** ���ڱȽ�������ע��   */
		Collections.sort(roleList,Collections.reverseOrder(new RoleComparator_Attack()));
	}
	/**
	 * ����Ҳ������дequals������Ȼ����set����
	 * @param role
	 * @return
	 */
	public boolean update(Role role){
		//���ҵ���ͬ�����λ��--����
		int index=roleList.indexOf(role);
		if(index==-1) return false;
		roleList.set(index, role);
		return true;
	}
	
	/**
	 * Ϊ�˸���ͨ�� ����Roleʵ���� ������дequal�������Ƚ�name�Ƿ�һ�£���ɾ��
	 * @param role
	 * @return
	 */
	public boolean delete(Role role){
		roleList.remove(role);
		return true;
	}
	
	/**
	 * ���
	 * @param role
	 * @return
	 */
	public boolean add(Role role) {
		if (role == null)
			return false;
		roleList.add(role);
		return true;
	}
	/**
	 * ��ʾ
	 */
	public void show(){
		System.out.println("Name\t\tNockName\tHp\t\tattack");
		//�õ�������
		Iterator<Role> roleIt=roleList.iterator();
		while(roleIt.hasNext()){
			//ȡ������
			Role role=roleIt.next();
			System.out.println(role.getName()+"\t\t"+role.getNickName()+"\t\t"+
			role.getHp()+"\t\t"+role.getAttack());
		}
	}
}

/**
 * �Ƚ����ӿ�
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��9��11�� ����10:41:57
 */
class RoleComparator_Attack implements Comparator<Role>{

	@Override
	public int compare(Role role1, Role role2) {
		if(role1.getAttack()>role2.getAttack()) return 1;
		if(role1.getAttack()<role2.getAttack()) return -1;
		return 0;
	}

}