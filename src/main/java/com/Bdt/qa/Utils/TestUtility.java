package com.Bdt.qa.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtility {

    public static long PAGE_LOADOUT_TIME = 20;
    public static long IMPLICIT_TIMEOUT = 20;

    public static String TESTDATA_SHEET_PATH = "C:\\Users\\UmaMaheswari\\Downloads\\Maven projects\\Maven projects"
            + "\\BdtAutomation.pom\\src\\main\\java\\com\\Bdt\\qa\\Testdata\\Coursexpath.xlsx";

    public static Workbook book;
    public static Sheet sheet;

    public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
            book = WorkbookFactory.create(file);
            sheet = book.getSheet(sheetName);
            
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet \"" + sheetName + "\" does not exist in the workbook");
            }
            
            Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
            for (int i = 0; i < sheet.getLastRowNum(); i++) {
                for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                    data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                }
            }
            return data;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Test data file not found: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to read test data from Excel file: " + e.getMessage());
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
