package Questions;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException {
        String path ="File/Batch11.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);//reading raw data from the file
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);//to convert the raw bytes to an Excel sheet
        Sheet sheet = xssfWorkbook.getSheet("Data");//to go to the sheet of the Excel file
        Row row = sheet.getRow(4);//to get the data from the row
        Cell cell = row.getCell(3);//Column are called Cell
        System.out.println(cell);

    }
}
