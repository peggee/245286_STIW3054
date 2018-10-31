
package com.mycompany.assignment2_ypg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {    
    public static List<ExcelList> chessData = new ArrayList();
    public static void readExcel() {
        try {
            System.out.println("Loading file...");
            FileInputStream excelFile=new FileInputStream("D:\\Users\\User\\Downloads\\real time\\chessResultsList.xlsx");
            XSSFWorkbook workBook = new XSSFWorkbook(excelFile);
            XSSFSheet sheet = workBook.getSheetAt(0);
            

            Iterator<Row> rowIterator = sheet.iterator();
            
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Cell col1 = row.getCell(0);
                String no = String.valueOf(col1);
                
                Cell col2 = row.getCell(2);
                String name = String.valueOf(col2);
                
                Cell col3 = row.getCell(3);
                String fideID = String.valueOf(col3);
                
                Cell col4 = row.getCell(4);
                String fed = String.valueOf(col4);
                
                Cell col5 = row.getCell(5);
                String rtg = String.valueOf(col5);
                
                Cell col6 = row.getCell(6);
                String cc = String.valueOf(col6);
                
                chessData.add(new ExcelList (no, name, fideID, fed, rtg, cc));
                
            }
            System.out.println("Data has been recorded");
            workBook.close();
            excelFile.close();
            
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
       
    }
}
