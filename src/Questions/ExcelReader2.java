package Questions;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader2 {
    public static void main(String[] args) throws IOException {

        String path = "File/Batch11.xlsx";

        FileInputStream fis = new FileInputStream(path);//Load the data in raw format
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssfWorkbook.getSheet("Data");
        int noRows = sheet.getPhysicalNumberOfRows();
        System.out.println(noRows);

        for (int i = 0; i < noRows; i++) {
            Row row = sheet.getRow(i);
            int noCell = row.getPhysicalNumberOfCells();

            for (int j = 0; j < noCell; j++) {
                System.out.print(row.getCell(j) + "   ");
            }
            System.out.println();
        }
    }
}
