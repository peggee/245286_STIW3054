
package com.mycompany.assignment2_ypg;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class App {
    public static void main( String[] args ) throws InvalidFormatException{
        ReadExcel.readExcel();
        ToPdf.convertToPdf();
        
    }
    
}
