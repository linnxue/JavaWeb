package com.json3;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.json.Boy;
import com.json.Person;
import com.json2.User;

public class ParseJson {

	public static void main(String[] args) {
		String jsonStr1 = "[\"Tom\",\"Rose\",\"Mary\"]";
		String jsonStr3 = "[{\"id\":101,\"name\":\"С��\",\"age\":20,\"sex\":\"��\"},"
						+ "{\"id\":102,\"name\":\"С��\",\"age\":22,\"tel\":\"123456\"}]";
		String jsonStr2 = "{\"id\":1, \"name\":\"Tom\", \"age\":18, \"sex\":\"��\"}";
		String jsonstr4 = " {\"name\":\"С��\",\"age\":25, \"girlFreind\":[\"�仨\",\"С��\",\"С��\"]}";
		
		
		Gson  gson = new Gson();
		Person per = gson.fromJson(jsonStr2, Person.class);
		System.out.println(per);
		System.out.println("----------------------------");
		Boy boy = gson.fromJson(jsonstr4, Boy.class);
		System.out.println(boy);
		System.out.println("----------------------");
		
		List<String> list1 = gson.fromJson(jsonStr1, new TypeToken<List<String>>() {}.getType());
		System.out.println(list1);
		System.out.println("------------------------------------------");
		List<User> list2 = gson.fromJson(jsonStr3, new TypeToken<List<User>>() {}.getType());
		System.out.println(list2);
		
		

	}

}
