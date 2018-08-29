package decorator_using;
/**
 * 真正需要装饰的部分，子类实现父类
 * 本类已经写好，从外界添加东西，不对本类做修改
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月24日 下午3:26:20
 */
public class TrueComponent extends Component {

	@Override
	void read() {
		System.out.println("我爱你 luckylan!");
	}

	@Override
	void showLove() {
		System.out.println("我喜欢你 很久了！");
		
	}

}
