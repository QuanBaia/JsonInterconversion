package json.uitl;

import net.sf.json.JSONObject;

/**
 * 
 * @author Mr.bai
 * ��Ҫ���ڰ�Java����ת��ΪJson�ַ���
 */
public class ConversionJson {

	
	/**
	 * 
	 * @param object
	 * @return ����ת����Json�ַ���
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
	 * @return ���ڰ�Jsonת���ɶ���
	 */
	public static Object JsonToObject(String jsonStr,Class beanClass)
	{
		Object obj = null;
		JSONObject json = new JSONObject().fromObject(jsonStr);
		obj = json.toBean(json, beanClass);
		return obj;
	}
}
