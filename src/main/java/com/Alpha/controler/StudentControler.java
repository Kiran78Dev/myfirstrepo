package com.Alpha.controler;

import java.util.List;

import org.apache.tomcat.util.net.AprEndpoint.Sendfile;
import org.hibernate.criterion.Restrictions;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alpha.entity.Student;
import com.Alpha.service.StudentService;

@RestController
public class StudentControler {
	@Autowired
	StudentService service;
	
    @GetMapping("/all")
	public List<Student> getStudentdata() {
	List<Student>stulist=service.getStudentdata();
	 return stulist;
	}
	
   @RequestMapping("/add")
    public String insertStudentData(@RequestBody List<Student> al) {
    	System.out.println("comming students = "+al);
    	 String msg=	service.insertStudentData(al);
    	 return msg;
    }
    
   @RequestMapping("/update")
    public String updateStudentData(@PathVariable List<Student> az) {
      String msg= service.updateStudentData(az);
    	return msg;
       
    }
	
   @GetMapping("/yaho")
   public   List<Student> facbookData() {
    List<Student>faclist=service.facbookData();
    return faclist;
    
   }
   
   @GetMapping("/adddata")
   public List<Student> whatsappdata() {
	List<Student>list= service.whatsappdata();
	   return list;
   }
   
   @PutMapping("/ID")
   public  String  dataupdate(@RequestBody List<Student> ee) {
	String msg = service.dataupdate(ee);
	    return msg;
}
@PutMapping("/roll")
   public String Dataupdated(@RequestBody List<Student> ee) {
   String msg = service.Dataupdate(ee);
	return msg;
}

@GetMapping("/just")
public List<Student> justdial() {
	List<Student> msg=service.justdial();
	return msg;	
}
@GetMapping("this")
   public List<Student> flipkartData () {
	List<Student>list=service.flipkartData();
	  return list; 
}
@GetMapping("/map")
   public List<Student> googleData() {
	List<Student>lst= service.googleData();
	return lst;
}
   @GetMapping("sahara")
public List<Student> particularData() {
	List<Student>lst=service.particularData();
	return lst;
}
   @PostMapping("/past")
   public String dataSavaandUpdate(@RequestBody List<Student> aa) {
   String lis=service.dataSavaandUpdate(aa);
   return lis ;
  }
   
   @PostMapping("/data")
   public String DataSave(@RequestBody List<Student>zz) {
	  String msg=service.DataSave(zz);
	   return msg;   
}
   
   @GetMapping("/safari")
  public List<Student> javaData() {
	List<Student>l=service.javaData();
	  return l;
}
   
   @GetMapping("/tata")
   public List<Student> DataStore() {
	List<Student>dj= service.DataStore();
	return dj;
}
   
   @PostMapping("/stud")
  public List<Student> todeleteData(@PathVariable List<Student>uu) {
	List<Student>lst=service.todeleteData(uu);
	  return lst;   
}
   
@PutMapping("/dataupdate")
public String dataUpdate() {
  String stu=service.dataUpdate();
  return stu;
	
}
@PutMapping("/control")
  public String dataSaveorUpdate() {
	String s =service.dataSaveorUpdate();
	return s;
}
   
@PutMapping("/put")
 public String setData() {
  String f= service.setData();
	return f;
}
  
@PutMapping("/kirang")
public String loadingData() {
	String msg=service.loadingData();
	return msg;
}

@DeleteMapping("/delete")
 public String deleteData() {
 String d=service.deleteData();
 return d;
}

@DeleteMapping("/remove")
public String removeData() {
	String k=service.removeData();
	return k;
}

@RequestMapping("/intrnate")
 public String yahoData(@PathVariable Student ee) {
	String kk=service.yahoData(ee);
	 return kk;
}

@GetMapping("/okkk")
public List<Student> daaaaaaaaaaaaaataaaaaaaaa() {
List<Student>lt=service.daaaaaaaaaaaaaataaaaaaaaa();
	return lt;
}
  
@GetMapping("/oho")
public List<Student> dataaaaface() {
	
List<Student>jk=service.dataaaaface();
return jk;
}

@RequestMapping("/latur")
public String cobine(@PathVariable List<Student> u) {
 String dl=service.cobine();
	return dl;
}


public List<Student> m2222222() {
List<Student> gh=service.m2222222();
	return gh;
}

@RequestMapping("/last")
public List<Student> S3bucket(@PathVariable List<Student> ok) {
	
List<Student> aws=service.S3bucket(ok);
return  aws;
}

@PutMapping("/git")
public List<Student> githubData() {
List<Student> lst=	service.githubData();
	return lst;
}

@RequestMapping("/helloworld")
   public List<Student> insertToData(@PathVariable List<Student> kholi) {
   List<Student>xyz=service.insertToData(kholi);
	return xyz;
 }
 
@GetMapping("/twrd")
   public List<Student> twitterData() {
	List<Student>nn=  service.twitterData();
	return nn;
}

@PostMapping("/dil")
public  List<Student> datainserted(@PathVariable List<Student> rr) {
      List<Student> stu=service.datainserted(rr);
      return stu;
}




}
