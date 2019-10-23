package com.json3;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.json.Boy;
import com.json.Person;

public class ToJsonString {

	public static void main(String[] args) {
		Gson gson = new Gson();
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		String str1 = gson.toJson(list);
		System.out.println(str1);
		System.out.println("--------------------------------");
		
		Person p = new Person(111, "����", "Ů", 23);
		String str2 = gson.toJson(p);
		System.out.println(str2);
		System.out.println("--------------------------------");
		
		Person p2 = new Person(222, "�̾�", "��", 25);
		List<Person> list2 = new ArrayList<Person>();
		list2.add(p);
		list2.add(p2);
		String str3 = gson.toJson(list2);
		System.out.println(str3);
		System.out.println("--------------------------------");
		
		
		Boy boy = new Boy();
		boy.setAge(30);
		boy.setName("С��");
		boy.setGirlFreind(list);
		String str4 = gson.toJson(boy);
		System.out.println(str4);
		System.out.println("--------------------------------");
		
		

	}

}
