package com.phone1000.system.dao;
import java.util.List;

import com.phone1000.system.pojo.User;

public interface IUserDao {
	
	//���ݵ�ǰҳ���ÿҳ���������ظ�ҳ��¼
	public List<User> getUsersByPage(int size, int pageno);
	//��ѯ����ȫ����¼
	public List<User> getAllUsers();
}
