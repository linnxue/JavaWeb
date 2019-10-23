package com.json3;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.json2.User;

public class FromToJson {

	public static void main(String[] args) {

		Gson gson = new Gson();
		
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
		
		List<User> list = gson.fromJson(json, new TypeToken<List<User>>() {}.getType());
		for(User u : list) {
			System.out.println(u);
		}
		System.out.println("--------------------------------------------");
		String str = gson.toJson(list);
		System.out.println(str);
		

	}

}
