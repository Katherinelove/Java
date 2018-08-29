package printer.impl;

import printer.IinkBox;

/**
 * 接口的实现类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月22日 上午11:07:06
 */
public class Ink implements IinkBox {
	
	@Override
	public String getColor() {
		return "red";
	}

}
