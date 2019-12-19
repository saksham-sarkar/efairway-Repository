package com.efairway.shop.utils.slx;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToExcel {

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Store data");

        Object[][] bookData = {
                {"S_NO", "CATEGORY_ID", "CREATED_BY", "CREATED_DATE", "sku", "STORE_ID", "UPDATED_BY", "UPDATED_DATE"},
                {1, 11,null,null,"P1_AP11_MO2_EL1", 1,null,null},
        };

        int rowCount = 0;

        for (Object[] aBook : bookData) {
            XSSFRow row = sheet.createRow(rowCount++);

            int columnCount = 0;

            for (Object field : aBook) {
                Cell cell = row.createCell(columnCount++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }

        }


        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\saksh\\Downloads\\storedata.xlsx")) {
            workbook.write(outputStream);
            System.out.println("File created");
        }
    }

}