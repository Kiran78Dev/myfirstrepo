package com.Alpha.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.criteria.internal.compile.CriteriaCompiler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.Alpha.entity.Student;

import antlr.collections.impl.LList;
@Repository
public class StudentDao {
	@Autowired
	SessionFactory sf;

	public List<Student> getStudentdata() {
     Session session = sf.openSession();
     Criteria criteria=session.createCriteria(Student.class);
     List<Student>list= criteria.list();
     session.close();
	 return list;
	}

	public String insertStudentData(List<Student> al) {
		
		//System.out.println("In dao : "+al);
		
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		for (Student student : al) {
			session.save(student);
		}
		tr.commit();
	    session.close();
		return "<<<<<<<<<<data save sucessfully>>>>>>>>>";
	}

	public String updateStudentData(List<Student> az) {
	  
		//System.out.println("In dao :"+az);
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Criteria criteria=session.createCriteria(String.class);
		for (Student student : az) {
			session.update(student);
		}
		
		tr.commit();
		return "Data update Syucesfully......!!!!!";
	}

	public List<Student> facbookData() {
		Session session= sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		
	    List<Student> list=	criteria.list();
	    
	    return list;
	
	}

	public List<Student> whatsappdata() {
		Session session= sf.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
        List<Student> list=criteria.list();
	    return list;
	}

	public List<Student> dataupdate() {
		Session session=sf.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
        List<Student>lst=criteria.list();
		return lst;
	}

	public String dataupdate(List<Student> ee) {
		
		Session session= sf.openSession();
		Transaction tr= session.beginTransaction();
		Criteria criteria=session.createCriteria(Student.class);
		
		for (Student student : ee) {
			session.update(ee);
		}
		
		return "data update sucessfully";
	}

	public String Dataupdate(List<Student> ee) {
	
		Session session=sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria=session.createCriteria(Student.class);
		
		for (Student student : ee) {
			session.delete(student);
		}
		
		return "delete data sucesfully";
	}

	
	
	public List<Student> justdial() {
		Session session= sf.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
        List<Student>list=criteria.list();
        return list;
       
	}

	public List<Student> flipkartData() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(String.class);
		List<Student>list=criteria.list();
		return list;
	}

	public List<Student> googleData() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
	List<Student>lst=	criteria.list();
		return lst;
	}

	public List<Student> particularData() {
	Session session=sf.openSession();
	Criteria criteria=session.createCriteria(Student.class);
      List<Student>list=criteria.list();
			return list;
	}

	public String dataSavaandUpdate(List<Student> aa) {
	
	Session session=sf.openSession();
	Transaction tr =session.beginTransaction();
	Criteria criteria=session.createCriteria(Student.class);
	for (Student student : aa) {
		session.saveOrUpdate(student);
	}
		
		return "data save and update ";
	}

	public String DataSave(List<Student> zz) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Criteria criteria=session.createCriteria(Student.class);
		
		for (Student student : zz) {
			session.saveOrUpdate(student);
		}
			return "save data";
	}

	public List<Student> javaData() {
		
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		List<Student>l =  criteria.list();
		return l;
	}

	public List<Student> DataStore() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		List<Student>dj= criteria.list();
		return dj;
	}

	public List<Student> todeleteData(List<Student> uu) {
	  Session session=sf.openSession();
	  Transaction tr= session.beginTransaction();
	  Criteria criteria=session.createCriteria(Student.class);
	  criteria.add(Restrictions.gt("student", "1"));
	  for (Student student : uu) {
		System.out.println(student);
	}
		return uu;
	}

	public String dataUpdate() {
		
		Session session=sf.openSession();
		Transaction tr =session.beginTransaction();
		Criteria criteria=session.createCriteria(Student.class);
		
		Student ss =new Student();
		ss.setRoll(6);
		ss.setName("shubh");
		ss.setGrade("x");
		ss.setDep("farmacy");
		
		session.update(ss);
		
		return "data updated" ;
	}

	public String dataSaveorUpdate() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Criteria criteria=session.createCriteria(Student.class);
		Student p=new Student();
		p.setRoll(7);
		p.setName("yadav");
		p.setGrade("w");
        p.setDep("xyz");
		session.saveOrUpdate(p);
	    return "datasaveorupdate";
	}

	public String setData() {
   Session session=sf.openSession();
   Transaction tr=session.beginTransaction();
   Criteria criteria=session.createCriteria(Student.class);
   
   Student lu=new Student();
   lu.setRoll(8);
   lu.setName("baluu");
   lu.setGrade("z");
   lu.setDep("unit");
   
   session.persist(lu);

   tr.commit();
		return "save";
	}

	public String loadingData() {
		Session session=sf.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
		session.load("Student", "5");
		
		return "data load";
	}

	public String deleteData() {
    Session session =sf.openSession();
    Transaction tr = session.beginTransaction();
    Criteria criteria=session.createCriteria(Student.class);
    
    Student o =new Student();
    o.setRoll(7);
    o.setName("yadav");
    o.setGrade("w");
    o.setDep("xyz");
    session.delete(o);
    tr.commit();
	return "Delete data sucessfully";
	}

	public String removeData() {
   Session session=sf.openSession();
   Transaction tr = session.beginTransaction();
   Criteria criteria=session.createCriteria(Student.class);
   
   Student oo =new Student();
   oo.setRoll(45);
   oo.setName("utar");
   oo.setGrade("a");
   oo.setDep("zyx");
   session.delete(oo);
   
		return "data remove";
	}

	public String yahoData(Student ee) {
		Session session=sf.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
	    Student ss= session.load(Student.class, 3);
	    return "ok" ;
	}

	public List<Student> daaaaaaaaaaaaaataaaaaaaaa() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
	    List<Student>lt= criteria.list();
	    return lt;
	}

	public List<Student> dataaaaface() {
		Session session =sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
	List<Student>jk=criteria.list();
				
		return jk;
	}

	public String cobine() {
  Session session =sf.openSession();
  Transaction tr= session.beginTransaction();
  Criteria criteria =session.createCriteria(Student.class);
  List<Student>lt= criteria.list();
  tr.commit();
   return "insert";
	}

	public String loadingDataUpdate() {
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria= session.createCriteria(String.class);
		
		Student ss= new Student();
		ss.setRoll(45);
		ss.setName("hitman");
		session.close();
		tr.commit();
		return "data update";
	}

	public List<Student> m2222222() {
		Session session =sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
	List<Student>gh=criteria.list();
		return gh ;
	}

	public List<Student> S3bucket(List<Student> ok) {

		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
	    List<Student>gh=criteria.list();
	    return gh;
	}

	    public List<Student> githubData() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
	    List<Student>lst=criteria.list();
		return lst;
	}

		public List<Student> insertToData(List<Student> kholi) {
			Session session=sf.openSession();
			Criteria criteria=session.createCriteria(Student.class);
	        List<Student>xyz=criteria.list();
			return xyz ;
		}

		public List<Student> twitterData() {
			Session session=sf.openSession();
			Criteria criteria=session.createCriteria(Student.class);
	        List<Student>nn	=criteria.list();
			return nn;
		}

		public List<Student> datainserted(List<Student> rr) {
			Session session=sf.openSession();
			Criteria criteria=session.createCriteria(Student.class);
	        List<Student>stu=criteria.list();
			
			return stu;
		}

		
	
 




	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
   

	


	
	
	
	


