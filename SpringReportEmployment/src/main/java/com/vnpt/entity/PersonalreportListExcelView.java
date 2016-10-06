package com.vnpt.entity;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class PersonalreportListExcelView extends AbstractExcelView {
	

	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HSSFSheet excelSheet = workbook.createSheet("PersonalReportList");
		setExcelHeader(excelSheet);
		
		List<Personalreport> personalreports = (List<Personalreport>)  model.get("PersonalReportList");

		Personalreport total = new Personalreport();
		total.setUsername("Tong");
		for (Personalreport  personalreport: personalreports) {
			
			if(personalreport.getPostpaidDevelop()!=null)	
				total.setPostpaidDevelop(total.getPostpaidDevelop()+personalreport.getPostpaidDevelop());

			
			if(personalreport.getGphoneDevelop()!=null)	
				total.setGphoneDevelop(total.getGphoneDevelop()+personalreport.getGphoneDevelop());


			
			if(personalreport.getFiberDevelop()!=null)	
				total.setFiberDevelop(total.getFiberDevelop()+personalreport.getFiberDevelop());

			
			if(personalreport.getMegaDevelop()!=null)	
				total.setMegaDevelop(total.getMegaDevelop()+personalreport.getMegaDevelop());

			
			if(personalreport.getMytvDevelop()!=null)	
				total.setMytvDevelop(total.getMytvDevelop()+personalreport.getMytvDevelop());

			
			if(personalreport.getIvanDevelop()!=null)	
				total.setIvanDevelop(total.getIvanDevelop()+personalreport.getIvanDevelop());

			
			if(personalreport.getVneduDevelop()!=null)	
				total.setVneduDevelop(total.getVneduDevelop()+personalreport.getVneduDevelop());

			
			if(personalreport.getPrepaidDevelop()!=null)	
				total.setPrepaidDevelop(total.getPrepaidDevelop()+personalreport.getPrepaidDevelop());
			
			if(personalreport.getCardDevelop()!=null)	
				total.setCardDevelop(total.getCardDevelop()+personalreport.getCardDevelop());

		}
		
		personalreports.add(total);
		
		setExcelRows(excelSheet,personalreports);
		
	}
	
	public void setExcelHeader(HSSFSheet excelSheet) {
		HSSFRow excelHeader = excelSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("Ho va Ten");
		excelHeader.createCell(1).setCellValue("DDTS");
		excelHeader.createCell(2).setCellValue("Co Dinh");
		excelHeader.createCell(3).setCellValue("Gphone");
		excelHeader.createCell(4).setCellValue("FTTH");
		excelHeader.createCell(5).setCellValue("MegaVNN");
		excelHeader.createCell(6).setCellValue("MyTV");
		excelHeader.createCell(7).setCellValue("Ivan");
		excelHeader.createCell(8).setCellValue("VnEdu");
		excelHeader.createCell(9).setCellValue("SimVNP");
		excelHeader.createCell(10).setCellValue("The VNP");
	}
	
	public void setExcelRows(HSSFSheet excelSheet, List<Personalreport> personalreports) {
		int record = 1;
		for (Personalreport  personalreport: personalreports) {
			
			HSSFRow excelRow = excelSheet.createRow(record++);
			excelRow.createCell(0).setCellValue(personalreport.getUsername());
			
			if(personalreport.getPostpaidDevelop()!=null)	
			excelRow.createCell(1).setCellValue(personalreport.getPostpaidDevelop());
			else 
				excelRow.createCell(1).setCellValue(0);
			
			if(personalreport.getFixedDevelop()!=null)	
			excelRow.createCell(2).setCellValue(personalreport.getFixedDevelop());
			else 
				excelRow.createCell(2).setCellValue(0);
			
			if(personalreport.getGphoneDevelop()!=null)	
			excelRow.createCell(3).setCellValue(personalreport.getGphoneDevelop());
			else 
				excelRow.createCell(3).setCellValue(0);

			
			if(personalreport.getFiberDevelop()!=null)	
			excelRow.createCell(4).setCellValue(personalreport.getFiberDevelop());
			else 
				excelRow.createCell(4).setCellValue(0);
			
			if(personalreport.getMegaDevelop()!=null)	
			excelRow.createCell(5).setCellValue(personalreport.getMegaDevelop());
			else 
				excelRow.createCell(5).setCellValue(0);
			
			if(personalreport.getMytvDevelop()!=null)	
			excelRow.createCell(6).setCellValue(personalreport.getMytvDevelop());
			else 
				excelRow.createCell(6).setCellValue(0);
			
			if(personalreport.getIvanDevelop()!=null)	
			excelRow.createCell(7).setCellValue(personalreport.getIvanDevelop());
			else 
				excelRow.createCell(7).setCellValue(0);
			
			if(personalreport.getVneduDevelop()!=null)	
			excelRow.createCell(8).setCellValue(personalreport.getVneduDevelop());
			else 
				excelRow.createCell(8).setCellValue(0);
			
			if(personalreport.getPrepaidDevelop()!=null)	
			excelRow.createCell(9).setCellValue(personalreport.getPrepaidDevelop());
			else 
				excelRow.createCell(9).setCellValue(0);
			
			if(personalreport.getCardDevelop()!=null)	
			excelRow.createCell(10).setCellValue(personalreport.getCardDevelop());
			else 
				excelRow.createCell(10).setCellValue(0);
			
		}
	}

}
