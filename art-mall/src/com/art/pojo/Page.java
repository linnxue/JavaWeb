package com.art.pojo;
import java.util.List;
public class Page {
	//ÿҳ��¼�ĸ���
	private int size = 6;
	//��ǰҳ��
	private int pageno = 1;	
	//��ҳ��
	private int totalPage;
	//�ܼ�¼��
	private int totalRecord;
	//��ҳ����
	private List list;
	
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	public Page() {}
	
	public Page(int size, int pageno) {
		super();
		this.size = size;
		this.pageno = pageno;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
			
	}

	public int getPageno() {
		return pageno;
	}

	public void setPageno(int pageno) {
		this.pageno = pageno;
	}

	public int getTotalPage() {
		return totalPage;
	}

	
	public void settotalPage() {
		this.totalPage = totalRecord / size;
		if(totalRecord % size !=0) {
			this.totalPage++;
		}
	}


	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	
}
