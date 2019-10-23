package com.servlets;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
@WebServlet("/FileUpServlet")
public class FileUpServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		//�ж�request�е������Ƿ�"multipart/form-data"
		if(ServletFileUpload.isMultipartContent(req)) {
			//��ù���
			DiskFileItemFactory fac = new DiskFileItemFactory();
			//�����ļ��ϴ�����
			ServletFileUpload  sfu = new ServletFileUpload(fac);
			try {
				//����request����ȡrequest�����е��ļ���
				List<FileItem>  items = sfu.parseRequest(req);
				//��������
				for(FileItem fi : items) {
					//�ж��Ƿ�����ͨԪ��
					if(!fi.isFormField()) {
						//������ͨԪ�أ��ſ����ϴ��ļ�
						//�ϴ�����ļ�����
						String pagepath = fi.getName();
						String filename = FilenameUtils.getName(pagepath);
						//�ϴ��ļ�������·��
						String path = this.getServletContext().getRealPath("/file");
						//�����ϴ��ļ�
						
						File file = new File(path, System.currentTimeMillis()+filename);
						//��ʼ�ϴ�
						fi.write(file);
						System.out.println("�ϴ��ɹ�");
					}else {

						System.out.println(fi.getFieldName()+"==="+fi.getString("utf-8"));
					}
				}
				
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}
}
