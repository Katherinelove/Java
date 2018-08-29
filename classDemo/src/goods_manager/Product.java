package goods_manager;

/**
 * 商品实体类
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月17日 上午9:08:30
 */
public class Product {
	private String goodsName;
	private double price;
	private String description;
	private String[] services;
	
	public Product() {}
	
	public Product(String name,double price){
		setGoodsName(name);
		setPrice(price);
	}
	
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

}
