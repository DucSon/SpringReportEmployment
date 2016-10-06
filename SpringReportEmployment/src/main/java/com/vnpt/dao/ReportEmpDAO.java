package com.vnpt.dao;

import java.util.List;
import com.vnpt.entity.Dailyreport;
import com.vnpt.entity.Personalreport;
import com.vnpt.entity.User;
import com.vnpt.entity.Weeklyplan;
import com.vnpt.entity.Weekreport;

public interface ReportEmpDAO {
	 
	  public List<Dailyreport> listReport() ;
	  
	  public List<Dailyreport> listReport(String username) ;
	  
	  public List<Weekreport> listWeekReport(String username, String fromDate, String toDate);
	
	  public List<Weeklyplan> listWeeklyPlan(String username, String fromDate, String toDate);
	  
	  public Integer getMaxDRId();
	  
	  public void createNewReport(String username,String date, Integer prepaidDevelop); 
	  
	  public void createNewReport(Dailyreport dailyreport);
	  
	  public void createWeeklyPlan(Weeklyplan weeklyplan);
	  
	  public void deleteWeeklyplan(int weeklyplanid);
	  
	  public void updateReport(Dailyreport dailyreport);
	  
	  public List<User> listUsers (String userparent);
	  
	  public List<Personalreport> listPersonalReport(String username, String fromDate, String toDate);

	}