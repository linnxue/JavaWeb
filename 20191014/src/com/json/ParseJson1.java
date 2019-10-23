package com.json;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ParseJson1 {

	public static void main(String[] args) throws JSONException {
		String jsonStr1 = "[\"Tom\",\"Rose\",\"Mary\"]";
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
		
		List<String> list1 = new ArrayList<String>();
		JSONArray jarr1 = new JSONArray(jsonStr1);
		for(int i=0; i<jarr1.length(); i++) {
			list1.add(jarr1.getString(i));
		}
		System.out.println(list1);
		System.out.println("-----------------------");
		String jsonStr2 = "{\"id\":1, \"name\":\"Tom\", \"age\":18, \"sex\":\"��\"}";
		Person per = new Person();
		JSONObject jobj1 = new JSONObject(jsonStr2);
		per.setId(jobj1.getInt("id"));
		per.setAge(jobj1.getInt("age"));
		per.setName(jobj1.getString("name"));
		per.setSex(jobj1.getString("sex"));
		System.out.println(per);
		System.out.println("-----------------------");
		String jsonStr3 = "[{\"id\":101,\"name\":\"С��\",\"age\":20,\"sex\":\"��\"},"
				+ "{\"id\":102,\"name\":\"С��\",\"age\":22,\"sex\":\"��\"}]";
		List<Person> list2 = new ArrayList<Person>();
		JSONArray jarr2 = new JSONArray(jsonStr3);
		for(int i=0; i<jarr2.length(); i++) {
			JSONObject jobj2 = jarr2.getJSONObject(i);//{\"id\":101,\"name\":\"С��\",\"age\":20,\"sex\":\"��\"}
			Person p = new Person();
			p.setAge(jobj2.getInt("age"));
			p.setId(jobj2.getInt("id"));
			p.setName(jobj2.getString("name"));
			p.setSex(jobj2.getString("sex"));
			
			list2.add(p);
		}
		System.out.println(list2);
		System.out.println("---------------------------");
		String jsonstr4 = " {\"name\":\"С��\",\"age\":25, \"girlF\":[\"�仨\",\"С��\",\"С��\"]}";
		Boy boy = new Boy();
		JSONObject jobj3 = new JSONObject(jsonstr4);
		boy.setAge(jobj3.getInt("age"));
		boy.setName(jobj3.getString("name"));
		
		JSONArray jarr4 = jobj3.getJSONArray("girlF");
		for(int i=0; i<jarr4.length(); i++) {
			boy.getGirlFreind().add(jarr4.getString(i));
		}
		System.out.println(boy);
	}

}
