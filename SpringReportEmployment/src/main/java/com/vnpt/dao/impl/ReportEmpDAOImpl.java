package com.vnpt.dao.impl;
 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.vnpt.dao.ReportEmpDAO;
import com.vnpt.entity.Asset;
import com.vnpt.entity.AssetForm;
import com.vnpt.entity.AssetInfoForm;
import com.vnpt.entity.ChildNode;
import com.vnpt.entity.Dailyreport;
import com.vnpt.entity.Hibernate;
import com.vnpt.entity.NodeTree;
import com.vnpt.entity.Personalreport;
import com.vnpt.entity.Product;
import com.vnpt.entity.User;
import com.vnpt.entity.Userroles;
import com.vnpt.entity.Weeklyplan;
import com.vnpt.entity.Weekreport;

import org.springframework.transaction.annotation.Transactional;
 
@Transactional
public class ReportEmpDAOImpl implements ReportEmpDAO {
 
  private SessionFactory sessionFactory;
 
  public void setSessionFactory(SessionFactory sessionFactory) {
      this.sessionFactory = sessionFactory;
  }
 
  @SuppressWarnings("unchecked")
  public List<Dailyreport> listReport() {
      Session session = this.sessionFactory.getCurrentSession();
 
      List<Dailyreport> list = session.createQuery("from Dailyreport").list();
      return list;
  }
 
  @SuppressWarnings("unchecked")
public List<Dailyreport> listReport(String username) {
      Session session = this.sessionFactory.getCurrentSession();
 
      List<Dailyreport> list = session.createQuery("from Dailyreport where username='"+username+"'").list();
      return list;
  }

  @SuppressWarnings("unchecked")
public List<ChildNode> listUsers (String userparent) {
	  
	@SuppressWarnings("unused")
	List<String> users = new ArrayList<String>(); 
	
	 Session session = this.sessionFactory.getCurrentSession();

	 Query query = session.createSQLQuery("CALL child_manager(:managername)")
				.addEntity(ChildNode.class).setParameter("managername",userparent );

		List<ChildNode> abc = query.list();
	 
	 return abc;
	 
  };
	
	@SuppressWarnings("unchecked")
	public List<Weekreport> listWeekReport(String username, String fromDate, String toDate) {

		Session session = this.sessionFactory.getCurrentSession();

		try {

			Query query = session.createSQLQuery("CALL week_report(:username, :fromdate, :todate)")
					.addEntity(Weekreport.class).setParameter("username", username)
					.setParameter("fromdate", convertDateFormat(fromDate))
					.setParameter("todate", convertDateFormat(toDate));

			List<Weekreport> abc = query.list();

			return abc;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	};
	
	@SuppressWarnings("unchecked")
	public List<Weeklyplan> listWeeklyPlan(String username, String fromDate, String toDate) {

		Session session = this.sessionFactory.getCurrentSession();
		Query query;
		try {
			query = session.createSQLQuery("CALL weekly_plan(:username, :fromdate, :todate)")
					.addEntity(Weeklyplan.class).setParameter("username", username)
					.setParameter("fromdate",convertDateFormat(fromDate))
					.setParameter("todate", convertDateFormat(toDate));
			List<Weeklyplan> abc = query.list();
			return abc;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	};
	@SuppressWarnings("unchecked")
	public List<AssetForm> listAsset(String username) {

		Session session = this.sessionFactory.getCurrentSession();
		Query query;
			query = session.createSQLQuery("CALL list_Asset(:username)")
					.addEntity(AssetForm.class).setParameter("username", username);
					
			List<AssetForm> abc = query.list();
			return abc;

	};
	
	@SuppressWarnings("unchecked")
	public List<AssetForm> listAssetChild(String username, String status) {

		Session session = this.sessionFactory.getCurrentSession();
		Query query;
		
			query = session.createSQLQuery("CALL list_Asset_child(:username, :status)")
					.addEntity(AssetForm.class).setParameter("username", username)
					.setParameter("status", status);
			List<AssetForm> abc = query.list();
			return abc;

	};
	
	
	
	@SuppressWarnings("unchecked")
	public List<Weeklyplan> listWeeklyPlanChild(String username, String fromDate, String toDate, String status) {

		Session session = this.sessionFactory.getCurrentSession();
		Query query;
		try {
			query = session.createSQLQuery("CALL weekly_plan_child(:username, :fromdate, :todate, :status)")
					.addEntity(Weeklyplan.class).setParameter("username", username)
					.setParameter("fromdate",convertDateFormat(fromDate))
					.setParameter("todate", convertDateFormat(toDate))
					.setParameter("status", status);
			List<Weeklyplan> abc = query.list();
			return abc;
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	};
	
	
	@SuppressWarnings("unchecked")
	public List<Personalreport> listPersonalReport(String username, String fromDate, String toDate){

		Session session = this.sessionFactory.getCurrentSession();

		Query query;
		try {
			query = session.createSQLQuery("CALL personalreport(:username, :fromdate, :todate)")
					.addEntity(Personalreport.class).setParameter("username", username)
					.setParameter("fromdate",convertDateFormat(fromDate))
					.setParameter("todate", convertDateFormat(toDate));
			List<Personalreport> list = query.list();

			return list;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	private String convertDateFormat(String date) throws ParseException {
		
				SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
				Date tDate = df.parse(date);

				SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
				String convertDate = formatter.format(tDate);
		return convertDate;
	}
   
  public Integer getMaxDRId() {
      Session session = this.sessionFactory.getCurrentSession();
      String sql = "Select max(d.dailyReportId) from Dailyreport d ";
      Query query = session.createQuery(sql);
      Integer maxDailyReportId = (Integer) query.uniqueResult();
      if (maxDailyReportId == null) {
          return 0;
      }
      return maxDailyReportId;
  }
  
  public Integer getMaxWPId() {
      Session session = this.sessionFactory.getCurrentSession();
      String sql = "Select max(w.weeklyplanid) from Weeklyplan w";
      Query query = session.createQuery(sql);
      Integer maxDailyReportId = (Integer) query.uniqueResult();
      if (maxDailyReportId == null) {
          return 0;
      }
      return maxDailyReportId;
  }
  
  public Integer getMaxAssetId() {
      Session session = this.sessionFactory.getCurrentSession();
      String sql = "Select max(a.assetid) as maxAssetId  from Asset a";
      Query query = session.createQuery(sql);
      Integer maxAssetId = (Integer) query.uniqueResult();
      if (maxAssetId == null) {
          return 0;
      }
      return maxAssetId;
  }
  
  public Integer getUserId(String username) {
      Session session = this.sessionFactory.getCurrentSession();
      String sql = "CALL getUserid(:username)";
      
      Query query = session.createSQLQuery(sql).addEntity(User.class).setParameter("username", username);
      @SuppressWarnings("unchecked")
	List<User> list = query.list();
      
      if(!list.isEmpty())
    	  return list.get(0).getUserid();
      else 
      return 0;
  }
 
  public void createNewReport(String username, String date, Integer prepaidDevelop) {
	  
	  Integer dailyReportId = getMaxDRId()+1;

	  Dailyreport dailyreport = new Dailyreport();
	  
	  dailyreport.setDate(date);
	  dailyreport.setDailyReportId(dailyReportId);
	  dailyreport.setUsername(username);
	  dailyreport.setPrepaidDevelop(prepaidDevelop);
	  
      Session session = this.sessionFactory.getCurrentSession();
      session.persist(dailyreport);
      
  }
  
  public void createNewReport(Dailyreport dailyreport) {
	  
	  Integer dailyReportId = getMaxDRId()+1;
	  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String date = dateFormat.format(cal.getTime());
	
		dailyreport.setDailyReportId(dailyReportId);
		dailyreport.setDate(date);

			try {
				
				Date datereport = new SimpleDateFormat("MM/dd/yyyy").parse(dailyreport.getDatereport());
				String datereport2 = new SimpleDateFormat("yyyy-MM-dd").format(datereport);
				dailyreport.setDatereport(datereport2);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 
      Session session = this.sessionFactory.getCurrentSession();
      
      session.persist(dailyreport);
	  
  };
  
  public void createWeeklyPlan(Weeklyplan weeklyplan) {
	  
	  Integer weeklyplanid = getMaxWPId()+1;
	  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String date = dateFormat.format(cal.getTime());
	
		weeklyplan.setWeeklyplanid(weeklyplanid);
		weeklyplan.setDatecreateplan(date);
		try {
			
			Date datePlan = new SimpleDateFormat("MM/dd/yyyy").parse(weeklyplan.getDate());
			String dateToWork = new SimpleDateFormat("yyyy-MM-dd").format(datePlan);
			weeklyplan.setDate(dateToWork);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

      Session session = this.sessionFactory.getCurrentSession();
      
      session.persist(weeklyplan);
	  
  }
  
  public void createAsset(AssetInfoForm assetInfoForm) {
	  
	  Integer assetid = getMaxAssetId()+1;
	  Integer userid = this.getUserId(assetInfoForm.getUsername()) ;
	  
	  Asset asset = new Asset();
	  
	  asset.setAssetid(assetid);
	  asset.setUserid(userid);
	  asset.setAssetname(assetInfoForm.getAssetname());
	  asset.setNsx(assetInfoForm.getNsx());
	  asset.setHsd(assetInfoForm.getHsd());
	  asset.setLocation(assetInfoForm.getLocation());
	  asset.setPrice(assetInfoForm.getPrice());
	  asset.setImage(assetInfoForm.getFileData().getBytes());
	  asset.setStatus("PRI");
	  asset.setStatusasset(assetInfoForm.getStatusasset());
	  asset.setNote(assetInfoForm.getNote());
//			  assetid, 
//			  userid, 
//			  assetForm.getAssetname(), 
//			  assetForm.getNsx(), 
//			  assetForm.getHsd(), 
//			  assetForm.getLocation(), 
//			  assetForm.getPrice(), 
//			  assetForm.getImage(), 
//			  "PRI", 
//			  assetForm.getStatusasset(), 
//			  assetForm.getNote());
	  
	  asset.setAssetid(assetid);
      Session session = this.sessionFactory.getCurrentSession();

      session.persist(asset);
  
  
  }
  
  public void deleteAsset(int assetid) {

	     Session session = this.sessionFactory.getCurrentSession();
	     	      
	      Asset asset = (Asset) session.load(Asset.class, assetid);
	      session.delete(asset);

	  return;
};

  
  public void createUser(User user){
	  
	  	user.setEnable(1);
	  	
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("CALL test_hibernate(:userid)")
				.addEntity(Hibernate.class).setParameter("userid", user.getManageid());
		
		@SuppressWarnings("unchecked")
		List<Hibernate> list = query.list();
	
		String roleManager = list.get(0).getUserrole();
		Userroles userroles = new Userroles(user.getUsername());
		if(roleManager.equals("ADMIN")){
			userroles.setUserrole("PD_ADMIN");
		}else if (roleManager.equals("PD_ADMIN")){
			userroles.setUserrole("DD_ADMIN");
		}else if (roleManager.equals("DD_ADMIN")){
			userroles.setUserrole("LEADER");
		}else if (roleManager.equals("LEADER")){
			userroles.setUserrole("USER");
		}else if (roleManager.equals("USER")){
			userroles.setUserrole("USER");
		}
		session.persist(userroles);
		
		session = this.sessionFactory.getCurrentSession();
		session.persist(user);
		return;
  }

  public void updateReport(Dailyreport dailyreport) {
	  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String date = dateFormat.format(cal.getTime());
		dailyreport.setDate(date);
 
      Session session = this.sessionFactory.getCurrentSession();
       
      session.saveOrUpdate(dailyreport);
	  
  };
  
  public void deleteWeeklyplan(int weeklyplanid) {

	     Session session = this.sessionFactory.getCurrentSession();
	     	      
	      Weeklyplan weeklyplan = (Weeklyplan) session.load(Weeklyplan.class, weeklyplanid);
	      session.delete(weeklyplan);

	  return;
  };

	public void sendWeeklyplan(int weeklyplanid, String status) {

		Session session = this.sessionFactory.getCurrentSession();

		Query query = session.createSQLQuery("CALL send_weekly_plan(:weeklyplanid, :status)").addEntity(Hibernate.class)
				.setParameter("weeklyplanid", weeklyplanid).setParameter("status", status);

		query.executeUpdate();

		return;
	};
	
	
	public void sendAsset(int assetid, String status) {

		Session session = this.sessionFactory.getCurrentSession();

		Query query = session.createSQLQuery("CALL send_asset(:assetid, :status)").addEntity(Asset.class)
				.setParameter("assetid", assetid).setParameter("status", status);

		query.executeUpdate();

		return;
	};
  

  public NodeTree createChildren(NodeTree parentNode) {
	  
	  List<NodeTree> children = new ArrayList<NodeTree>();
	  List<ChildNode> users = this.listUsers(parentNode.getText());
	  
	  for(int i =0;i<users.size();i++) {
		  NodeTree node = new NodeTree(users.get(i).getUserid(), users.get(i).getUsername());
		  node = createChildren(node);
		  children.add(node);
	  }
	  
	  parentNode.setChildren(children);
	  return parentNode;
	  
  }

public Asset findAsset(int assetid) {
    Session session = sessionFactory.getCurrentSession();
    Criteria crit = session.createCriteria(Asset.class);
    crit.add(Restrictions.eq("assetid", assetid));
    
    Asset asset = (Asset) crit.uniqueResult();
    
    return asset;
}
  
 
}