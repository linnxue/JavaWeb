package service;

import java.util.List;

import dao.UserDao;
import pojo.User;

public class UserService {
//	����Service��˽�����Ժ�Dao����
	private UserDao ud = new UserDao();
//	last-> ����Dao����
	public List<User> getAllUsers(){
//		�����servlet
		return ud.getAllUser();
	}
//	��¼�Ƿ�ɹ���service�����������ڴ˶���boolean���͵ķ���
	public boolean checkLogin(String lname, String lpwd) {
//		���費�ɹ�
		boolean rs = false;
//		����Dao�з���
		User user = ud.getUserByName(lname);
		if(user != null) {
//			�ж�
			if(user.getUsername().equals(lname) && user.getPassword().equals(lpwd)) {
				rs = true;
			}
		}		
		return rs;
	}
//	����������int���ͣ��ж����ִ����û���������/�������
	public int checkLogin2(String lname, String lpwd) {
		int rs = 0;//��¼ʧ��
		
		User user = ud.getUserByName(lname);
		if(user != null) {
			if(user.getUsername().equals(lname) && user.getPassword().equals(lpwd)) {
				rs = 1;//��½�ɹ�
			}else {
				rs = 2;//�û����������
			}
		}else {
			rs = 3;//��ǰ�û���������
		}		
		return rs;
	}
	
	
}
