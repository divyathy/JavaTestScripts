package Common;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelData {

    static Workbook book;
    static Sheet sheet;
    public static String filePath= "C:\\Users\\Dbana\\Git\\JavaTestScripts\\src\\main\\resources\\excelData\\WorkBook.xlsx";


    public static Object[][] getTestData(String SheetName){
        FileInputStream file= null;
        try {
            file= new FileInputStream(filePath);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        }catch (InvalidFormatException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        sheet=book.getSheet(SheetName);
        Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i=0; i<sheet.getLastRowNum();i++){
            for (int k=0; k<sheet.getRow(0).getLastCellNum();k++){
                data[i][k] = sheet.getRow(i+1).getCell(k).toString();
            }
        }

return data;

}
}