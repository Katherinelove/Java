package interface_using;
/**
 * ²âÊÔÀà
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018Äê8ÔÂ20ÈÕ ÏÂÎç3:37:52
 */
public class InterfaceMain {

	public static void main(String[] args) {
		Hero öùÓã=new Warrior("²Ü²Ù",0,0);
		Hero ÂåÊÖ=new Warrior("ÂåÊÖ",10,10);
		
		Structure ÖÓËş=new Structure("ÖÓËş",20,20);
		öùÓã.pk(ÂåÊÖ);
		ÂåÊÖ.pk(ÖÓËş);
		ÖÓËş.pk(ÂåÊÖ);
	}

}
