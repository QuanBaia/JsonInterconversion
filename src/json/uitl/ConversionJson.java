package json.uitl;

import net.sf.json.JSONObject;

/**
 * 
 * @author Mr.bai
 * 主要用于把Java对象转换为Json字符串
 */
public class ConversionJson {

	
	/**
	 * 
	 * @param object
	 * @return 对象转换成Json字符串
	 */
	public static String ObjectToJson(Object object)
	{
		String str = "";
		JSONObject json = JSONObject.fromObject(object);
		str = json.toString();
		return str;
	}
	
	
	/**
	 * 
	 * @param jsonStr
	 * @return 用于把Json转换成对象
	 */
	public static Object JsonToObject(String jsonStr,Class beanClass)
	{
		Object obj = null;
		JSONObject json = new JSONObject().fromObject(jsonStr);
		obj = json.toBean(json, beanClass);
		return obj;
	}
}
