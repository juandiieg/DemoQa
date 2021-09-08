package Helpers;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadDataFrmXL {

    public static int xRows;
    public static int xCols;
    private static HSSFWorkbook wb;

    public static String[][] readData(String fPath, int sheetNum) throws Exception {

        File file = new File(fPath);
        FileInputStream fIP = new FileInputStream(file);
        wb = new HSSFWorkbook(fIP);
        HSSFSheet sheet = wb.getSheetAt(sheetNum);
        xRows = sheet.getLastRowNum() + 1;
        System.out.println("Rows are :" + xRows);
        xCols = sheet.getRow(0).getLastCellNum();
        System.out.println("Columns are : " + xCols);
        String[][] xData = new String[xRows][xCols];

        for (int i = 0; i < xRows; i++) {
            HSSFRow row = sheet.getRow(i);
            for (int j = 0; j < xCols; j++) {
                HSSFCell cell = row.getCell(j);
                String value = cell.getStringCellValue();
                xData[i][j] = value;
            }
        }
        return xData;
    }


}
