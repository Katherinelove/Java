package collerction_case;
/**
 * 测试类
 * @author 15281
 *
 */
public class RoleTest {
	public static void main(String[] args) {
		RoleBiz roleBiz=new RoleBiz();
				
		Role role1=new Role("梅长书", "麒麟才子1", 100, 500);
		Role role2=new Role("梅中书", "麒麟才子2", 200, 400);
		Role role3=new Role("梅短书", "麒麟才子3", 300, 300);
		Role role4=new Role("梅狼书", "麒麟才子4", 400, 200);
		Role role5=new Role("梅狗书", "麒麟才子5", 500, 100);
		
		roleBiz.add(role1);
		roleBiz.add(role2);
		roleBiz.add(role3);
		roleBiz.add(role4);
		roleBiz.add(role5);
		
		roleBiz.show();
		//对象是外面给的   这里是new的新对象，删除的时候,x需要用到equal方法
		Role role6=new Role("梅狼书", "麒麟才子4", 400, 200);
		roleBiz.delete(role6);
		roleBiz.show();
		
		Role role7=new Role("梅狗书", "love", 400, 200);
		roleBiz.update(role7);
		roleBiz.show();
		
		System.out.println("排序后：");
		roleBiz.sort();
		roleBiz.show();
		
		
		roleBiz.reverse();
		System.out.println("倒转之后：");
		roleBiz.show();
	}
}
