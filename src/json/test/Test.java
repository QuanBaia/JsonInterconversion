package json.test;

import json.po.Cat;
import json.uitl.ConversionJson;
/**
 * 
 * @author Mr.bai
 * ����
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//��������
		Cat cat = new Cat("Tom", "С��è", 2);
		String catStr = ConversionJson.ObjectToJson(cat);//�Ѷ���ת����Json
		System.out.println("����תJson----------------------"+catStr);
		System.out.println("���Ƿָ���------------------------------------------------------------------------------------");
		
		Cat cat2 = (Cat)ConversionJson.JsonToObject(catStr,Cat.class);
		System.out.println("Jsonת����----------------------"+cat2);
		
	}

}
