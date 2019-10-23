package com.json2;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class ParseUserJson {

	public static void main(String[] args) {
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
		
		List<User> users = JSON.parseArray(json, User.class);
		for(User u :users) {
			System.out.println(u);
		}
		
		System.out.println("-----------------------------");
		String str = JSON.toJSONString(users);
		System.out.println(str);

	}

}
