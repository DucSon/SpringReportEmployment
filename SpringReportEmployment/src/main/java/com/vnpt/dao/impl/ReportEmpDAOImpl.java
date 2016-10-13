package com.vnpt.dao.impl;
 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.vnpt.dao.ReportEmpDAO;
import com.vnpt.entity.Dailyreport;
import com.vnpt.entity.Personalreport;
import com.vnpt.entity.User;
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
public List<User> listUsers (String userparent) {
	  
	@SuppressWarnings("unused")
	List<String> users = new ArrayList<String>(); 
	
	 Session session = this.sessionFactory.getCurrentSession();

	 Query query = session.createSQLQuery("CALL child_manager(:managername)")
				.addEntity(User.class).setParameter("managername",userparent );

		List<User> abc = query.list();
	 
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
		System.out.println("username:"+ username);
		Query query = session.createSQLQuery("CALL weekly_plan(:username, :fromdate, :todate)")
				.addEntity(Weeklyplan.class).setParameter("username", username)
				.setParameter("fromdate",fromDate)
				.setParameter("todate", toDate);

		List<Weeklyplan> abc = query.list();
		return abc;
		
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
			
			System.out.println("This datereport:"+weeklyplan.getDate());
			Date datePlan = new SimpleDateFormat("MM/dd/yyyy").parse(weeklyplan.getDate());
			String dateToWork = new SimpleDateFormat("yyyy-MM-dd").format(datePlan);
			System.out.println(datePlan);
			weeklyplan.setDate(dateToWork);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

      Session session = this.sessionFactory.getCurrentSession();
      
      session.persist(weeklyplan);
	  
  }

  public void updateReport(Dailyreport dailyreport) {
	  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String date = dateFormat.format(cal.getTime());
		dailyreport.setDate(date);
 
      Session session = this.sessionFactory.getCurrentSession();
 
      System.out.println("dailyreportId:"+dailyreport.getDailyReportId());
      
      session.saveOrUpdate(dailyreport);
	  
  };
  
  public void deleteWeeklyplan(int weeklyplanid) {

	     Session session = this.sessionFactory.getCurrentSession();
	     
	      System.out.println("weeklyplanid"+ weeklyplanid);
	      
	      Weeklyplan weeklyplan = (Weeklyplan) session.load(Weeklyplan.class, weeklyplanid);
	      session.delete(weeklyplan);

	  return;
  };
 
}