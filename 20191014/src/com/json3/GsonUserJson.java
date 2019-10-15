package com.json3;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.json.Boy;
import com.json.Person;

public class GsonUserJson {
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		String jsonStr2 = "{\"id\":1, \"name\":\"Tom\", \"age\":18, \"sex\":\"��\"}";
		Person per = JSON.parseObject(jsonStr2,Person.class);
//		System.out.println(per+"\n");
		
		String jsonStr3 = gson.toJson(per);
		System.out.print(jsonStr3+"\n");
		
		String jsonstr4 = " {\"name\":\"С��\",\"age\":25, \"girlF\":[\"�仨\",\"С��\",\"С��\"]}";
//		Boy boy = JSON.parseObject(jsonstr4,Boy.class);
//		System.out.println(boy+"\n");
		
		Boy boy2 = gson.fromJson(jsonstr4, Boy.class );
		System.out.println(boy2+"\n");
		
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
