package com.json2;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.json.Boy;
import com.json.Person;

public class ParseUserJson {
	
	public static void main(String[] args) {
		
		String jsonStr1 = "[\"Tom\",\"Rose\",\"Mary\"]";
		List<String> list1 = JSON.parseArray(jsonStr1,String.class);
		System.out.println(list1+"\n");
		
		String jsonStr3 = "[{\"id\":101,\"name\":\"С��\",\"age\":20,\"sex\":\"��\"},"
				+ "{\"id\":102,\"name\":\"С��\",\"age\":22,\"sex\":\"��\"}]";
		List<String> list2 = JSON.parseArray(jsonStr3,String.class);
		System.out.println(list2+"\n");
		
		String jsonStr2 = "{\"id\":1, \"name\":\"Tom\", \"age\":18, \"sex\":\"��\"}";
		Person per = JSON.parseObject(jsonStr2,Person.class);
		System.out.println(per+"\n");
		
		String jsonstr4 = " {\"name\":\"С��\",\"age\":25, \"girlF\":[\"�仨\",\"С��\",\"С��\"]}";
		Boy boy = JSON.parseObject(jsonstr4,Boy.class);
		System.out.println(boy+"\n");
		
		
		String json="[{\"name\":\"������\",\"age\":27,"
				+ "\"list\":[{\"price\":35.6,\"bookName\":\"��������\"},"
							+ "{\"price\":88.6,\"bookName\":\"��Хɽׯ\"},"
							+ "{\"price\":90.6,\"bookName\":\"�軨Ů\"}]},"
		+ "{\"name\":\"Ȯҹ��\",\"age\":20,"
			+ "\"list\":[{\"price\":33.5,\"bookName\":\"�����ȫ\"},"
			+ "{\"price\":73.5,\"bookName\":\"׷����\"},"
			+ "{\"price\":93.5,\"bookName\":\"��������\"},"
			+ "{\"price\":43.5,\"bookName\":\"���¶�\"}]},"
		+ "{\"name\":\"С��\",\"age\":17,"
			+ "\"list\":[{\"price\":33.6,\"bookName\":\"��¥��\"},"
			+ "{\"price\":103.6,\"bookName\":\"���ӱ���\"},"
			+ "{\"price\":63.6,\"bookName\":\"����A��\"}]}]";
		
		
		
	}

}
