package collerction_case;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 英雄业务类
 * 
 * @author 15281
 *
 */
public class RoleBiz {
	private static List<Role> roleList;
	
	public RoleBiz() {
		// 利用Arraylsit子类去实现父接口
		roleList = new ArrayList<>();
	}
	
	public void sort(){
		//V1.0自己手写 冒泡法、插入排序法
		//V2.0-1使用内置的工具进行排序--前提必须实现比较器 Comparator接口
		//比较器实现的是名词接口   Comparator<Role>
		//优势，可以通过定义方法，自定义排序依据，实体类比较接口写死了
		Collections.sort(roleList, new RoleComparator_Attack());
		//V2.0-2实体类实现 comparable接口  接口名称为Comparable<Role>
		//接口为形容词     .java.lang包中	
	}
	
	public void reverse(){
//		Collections.reverse(roleList);
		/** 基于比较器逆序注意   */
		Collections.sort(roleList,Collections.reverseOrder(new RoleComparator_Attack()));
	}
	/**
	 * 跟新也必须重写equals方法，然后在set（）
	 * @param role
	 * @return
	 */
	public boolean update(Role role){
		//先找到相同对象的位置--索引
		int index=roleList.indexOf(role);
		if(index==-1) return false;
		roleList.set(index, role);
		return true;
	}
	
	/**
	 * 为了更加通用 传入Role实体类 ，并重写equal方法，比较name是否一致，才删除
	 * @param role
	 * @return
	 */
	public boolean delete(Role role){
		roleList.remove(role);
		return true;
	}
	
	/**
	 * 添加
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
	 * 显示
	 */
	public void show(){
		System.out.println("Name\t\tNockName\tHp\t\tattack");
		//得到迭代器
		Iterator<Role> roleIt=roleList.iterator();
		while(roleIt.hasNext()){
			//取出对象
			Role role=roleIt.next();
			System.out.println(role.getName()+"\t\t"+role.getNickName()+"\t\t"+
			role.getHp()+"\t\t"+role.getAttack());
		}
	}
}

/**
 * 比较器接口
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年9月11日 上午10:41:57
 */
class RoleComparator_Attack implements Comparator<Role>{

	@Override
	public int compare(Role role1, Role role2) {
		if(role1.getAttack()>role2.getAttack()) return 1;
		if(role1.getAttack()<role2.getAttack()) return -1;
		return 0;
	}

}