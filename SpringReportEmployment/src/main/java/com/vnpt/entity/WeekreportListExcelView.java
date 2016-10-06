package com.vnpt.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

@SuppressWarnings("deprecation")
public class WeekreportListExcelView extends AbstractExcelView {

	private static List<Servicereport> listservicereport2 = new ArrayList<Servicereport>();
	
	static {
		listservicereport2.add(new Servicereport("Develop","", 1, 1, 1, 1, 1, 1, 1));

	}

	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HSSFSheet excelSheet = workbook.createSheet("WeekReportList");
		setExcelHeader(excelSheet);
		
		List<Servicereport> serviceList = (List<Servicereport>)  model.get("WeekReportList");

		setExcelRows(excelSheet,serviceList);
		
	}
	
	public void setExcelHeader(HSSFSheet excelSheet) {
		HSSFRow excelHeader = excelSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("Ten Dich Vu");
		excelHeader.createCell(1).setCellValue("Phat trien");
		excelHeader.createCell(2).setCellValue("Khoi Phuc");
		excelHeader.createCell(3).setCellValue("Cat gian");
		excelHeader.createCell(4).setCellValue("Tam dung");
		excelHeader.createCell(5).setCellValue("Thuc tang");
		excelHeader.createCell(6).setCellValue("TB (ko lap kip)");
		excelHeader.createCell(7).setCellValue("TB (ko d/u dc)");
	
	}
	
	public void setExcelRows(HSSFSheet excelSheet, List<Servicereport> serviceList) {
		int record = 1;
		for (Servicereport servicereport : serviceList) {
			
			HSSFRow excelRow = excelSheet.createRow(record++);
			excelRow.createCell(0).setCellValue(servicereport.getNameService());
			excelRow.createCell(1).setCellValue(servicereport.getDevelop());
			excelRow.createCell(2).setCellValue(servicereport.getRestore());
			excelRow.createCell(3).setCellValue(servicereport.getCut());
			excelRow.createCell(4).setCellValue(servicereport.getStop());
			excelRow.createCell(5).setCellValue(servicereport.getIncrease());
			excelRow.createCell(6).setCellValue(servicereport.getUninstall());
			excelRow.createCell(7).setCellValue(servicereport.getUnresponsive());
		}
	}
}
