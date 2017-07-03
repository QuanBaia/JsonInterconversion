package json.test;

import json.po.Cat;
import json.uitl.ConversionJson;
/**
 * 
 * @author Mr.bai
 * 测试
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//创建对象
		Cat cat = new Cat("Tom", "小花猫", 2);
		String catStr = ConversionJson.ObjectToJson(cat);//把对象转换成Json
		System.out.println("对象转Json----------------------"+catStr);
		System.out.println("我是分割线------------------------------------------------------------------------------------");
		
		Cat cat2 = (Cat)ConversionJson.JsonToObject(catStr,Cat.class);
		System.out.println("Json转对象----------------------"+cat2);
		
	}

}
