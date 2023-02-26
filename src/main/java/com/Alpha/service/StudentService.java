package com.Alpha.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alpha.dao.StudentDao;
import com.Alpha.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao dao; 

	public List<Student> getStudentdata() {
	List<Student>list = dao.getStudentdata();
		
		return list;
	}

	
	public String insertStudentData(List<Student> al) {
	String msg=	dao.insertStudentData(al);
	return msg;
	}


	public String updateStudentData(List<Student> az) {
		String msg =dao.updateStudentData(az);
		return msg;
	}


	public List<Student> facbookData() {
	List<Student> list=	dao.facbookData();
		return list;
	}


	public List<Student> whatsappdata() {
	List<Student>list=dao.whatsappdata();
		return list;
	}


	public List<Student> dataupdate() {
    List<Student>lst=	 dao.dataupdate();
		return lst;
	}


	public String dataupdate(List<Student> ee) {
	String msg=	dao.dataupdate(ee);
		return msg;
	}


	public String Dataupdate(List<Student> ee) {
	    String msg = dao.Dataupdate(ee);
		return msg;
	}


	public List<Student> justdial() {
		List<Student> msg =dao.justdial();
		return msg;
	}


	public List<Student> flipkartData() {
		List<Student>list=dao.flipkartData();
		return list;
	}


	public List<Student> googleData() {
	List<Student>lst=dao.googleData();
		return lst;
	}


	public List<Student> particularData() {
	List<Student> list=	dao.particularData();
		return list;
	}


	public String dataSavaandUpdate(List<Student> aa) {
	String lis = dao.dataSavaandUpdate(aa);
	return lis;
	}


	public String DataSave(List<Student> zz) {
		String msg=dao.DataSave(zz);
		return msg;
	}


	public List<Student> javaData() {
	List<Student>l=	dao.javaData();
		
		return l;
	}


	public List<Student> DataStore() {
	List<Student>dj=dao.DataStore();
		return dj;
	}


	public List<Student> todeleteData(List<Student> uu) {
	List<Student>lst=dao.todeleteData(uu);
		return lst;
	}


	public String dataUpdate() {
	String stu=dao.dataUpdate();
		return stu;
	}


	public String dataSaveorUpdate() {
    String s=dao.dataSaveorUpdate();
		return s;
	}


	public String setData() {
		String f=dao.setData();
		return f;
	}


	public String loadingData() {
		String msg=dao.loadingData();
		return null;
	}


	public String deleteData() {
		String d=dao.deleteData();
		return d;
	}


	public String removeData() {
		String k=dao.removeData();
		return k;
	}


	public String yahoData(Student ee) {
	String kk = dao.yahoData(ee);
		return kk;
	}


	public List<Student> daaaaaaaaaaaaaataaaaaaaaa() {
	List<Student>lt=dao.daaaaaaaaaaaaaataaaaaaaaa();
		return lt;
	}


	public List<Student> dataaaaface() {
	List<Student>jk= dao.dataaaaface();
		return jk;
	}


	public String cobine() {
		String dl=dao.cobine();
		return dl;
	}


	public String loadingDataUpdate() {
		String msg=dao.loadingDataUpdate();
		return msg;
	}


	public List<Student> m2222222() {
	List<Student> gh=dao.m2222222();
		return gh;
	}


	public List<Student> S3bucket(List<Student> ok) {
	List<Student>aws=dao.S3bucket(ok);
		return aws;
	}


	public List<Student> githubData() {
	List<Student>lst=	dao.githubData();
		return lst;
	}


	public List<Student> insertToData(List<Student> kholi) {
    List<Student>xyz=dao.insertToData(kholi);
		return xyz;
	}


	public List<Student> twitterData() {
	List<Student>nn=dao.twitterData();
		return nn;
	}


	 public List<Student> datainserted(List<Student> rr) {
	 List<Student>stu=dao.datainserted(rr);
		return stu;
		
	}



}
	

	


	


