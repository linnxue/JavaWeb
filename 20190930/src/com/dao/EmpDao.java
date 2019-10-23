package com.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Emp;
import com.utils.DBUtil;

public class EmpDao {

	//�������֣�ģ����ѯ������List<Emp>
	public List<Emp> getEmpsByName(String ename){
		List<Emp> emps = new ArrayList<Emp>();
		
		String sql = "select * from emp where ename like ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnetion();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+ename+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Emp e = new Emp();
				if(rs.getObject("comm")!=null) {
					//����������decimal������java�е�����BigDecimal
					//�����ǽ�BigDecimalתΪDouble
					e.setComm(Double.valueOf(rs.getObject("comm").toString()));
					// e.setComm((Double)rs.getObject("comm"));
					//e.setComm(rs.getDouble("comm"));//����double,������ݿ�null���򷵻�0.0
				}else {
					e.setComm(null);
				}
				e.setDeptno(rs.getInt("deptno"));
				e.setEmpno(rs.getInt("empno"));
				e.setEname(rs.getString("ename"));
				e.setHiredate(rs.getString("hiredate"));
				e.setJob(rs.getString("job"));
				e.setMgr(rs.getInt("mgr"));
				e.setSal(rs.getDouble("sal"));
				
				emps.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		
		return emps;
	}
}
