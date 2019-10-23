package com.phone1000.system.pojo;
import java.util.List;
public class Page {
	//ÿҳ��¼�ĸ���
		private int size = 5;
		//��ǰҳ��
		private int pageno = 1;
		//��ҳ��
		private int totalPage;
		//�ܼ�¼��
		private int totalRecord;
		//��ҳ����
		private List list;
		
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
			int pages = this.totalRecord % this.size !=0 ? (this.totalRecord / this.size +1 ) :(this.totalRecord / this.size);
			this.setTotalPage(pages);
			
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

		private void setTotalPage(int totalPage) {
			this.totalPage = totalPage;
		}

		public int getTotalRecord() {
			return totalRecord;
		}

		public void setTotalRecord(int totalRecord) {
			this.totalRecord = totalRecord;
			int pages = this.totalRecord % this.size !=0 ? (this.totalRecord / this.size +1 ) :(this.totalRecord / this.size);
			this.setTotalPage(pages);
		}

		public List getList() {
			return list;
		}

		public void setList(List list) {
			this.list = list;
		}
		
		
}
