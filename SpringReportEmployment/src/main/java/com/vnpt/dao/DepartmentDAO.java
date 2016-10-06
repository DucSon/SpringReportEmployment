package com.vnpt.dao;
 
import java.util.Date;
import java.util.List;
import com.vnpt.entity.Department;
 
public interface DepartmentDAO {
 
  public List<Department> listDepartment() ;
  
//  public Integer getMaId();
  
  public void createDepartment(String name,String location, Date date);  
}