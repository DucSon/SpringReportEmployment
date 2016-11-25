package com.vnpt.dao;

import java.util.List;

import com.vnpt.entity.Asset;
import com.vnpt.entity.AssetForm;
import com.vnpt.entity.ChildNode;
import com.vnpt.entity.Dailyreport;
import com.vnpt.entity.NodeTree;
import com.vnpt.entity.Personalreport;
import com.vnpt.entity.User;
import com.vnpt.entity.Weeklyplan;
import com.vnpt.entity.Weekreport;

public interface ReportEmpDAO {
	 
	  public List<Dailyreport> listReport() ;
	  
	  public List<Dailyreport> listReport(String username) ;
	  
	  public List<Weekreport> listWeekReport(String username, String fromDate, String toDate);
	
	  public List<Weeklyplan> listWeeklyPlan(String username, String fromDate, String toDate);
	 
	  public List<AssetForm> listAsset(String username);
	  
	  public List<AssetForm> listAssetChild(String username, String status);
	  
	  public List<Weeklyplan> listWeeklyPlanChild(String username, String fromDate, String toDate, String status);
	  
	  public void sendWeeklyplan(int weeklyplanid, String status);
	  
	  public Integer getMaxDRId();
	  
	  public void createNewReport(String username,String date, Integer prepaidDevelop); 
	  
	  public void createNewReport(Dailyreport dailyreport);
	  
	  public void createWeeklyPlan(Weeklyplan weeklyplan);
	  
	  public void deleteWeeklyplan(int weeklyplanid);
	  
	  public void createAsset(AssetForm assetForm);
	  
	  public void deleteAsset(int assetid);
	  
	  public void sendAsset(int assetid, String status);
	  
	  public void updateReport(Dailyreport dailyreport);
	  
	  public List<ChildNode> listUsers (String userparent);
	  
	  public List<Personalreport> listPersonalReport(String username, String fromDate, String toDate);

	  public NodeTree createChildren(NodeTree parentNode);
	  
	  public void createUser(User user);
	  
	}