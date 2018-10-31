
package com.mycompany.assignment2_ypg;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static com.mycompany.assignment2_ypg.ReadExcel.chessData;
import java.io.FileOutputStream;


public class ToPdf {
    public static void convertToPdf() {
        try {
            System.out.println("Converting to Pdf File.......");
            Document document = new Document();
            PdfPTable table = new PdfPTable(new float[]{3, 12, 4, 4, 4, 9});//content size of pdf table

                for (int i = 0; i < chessData.size(); i++) {
                
                table.addCell(chessData.get(i).getNo());
                table.addCell(chessData.get(i).getName());
                table.addCell(chessData.get(i).getFideID());
                table.addCell(chessData.get(i).getFed());
                table.addCell(chessData.get(i).getRtg());
                table.addCell(chessData.get(i).getCc());
                
            }

            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\user\\Desktop\\ChessResult.pdf"));
                document.open();
                document.add(table);
                document.close();
                System.out.println("Successfully convert to Pdf file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
