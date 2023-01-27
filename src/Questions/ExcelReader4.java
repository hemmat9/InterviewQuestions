package Questions;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReader4 {
    public static void main(String[] args) throws IOException {

        String path ="D:\\Batch11.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Data");
        int noRow = sheet.getPhysicalNumberOfRows();
        Row row0 = sheet.getRow(0);
        List<Map<String, String>> excelData = new ArrayList<>();
        for(int i= 1; i<noRow; i++){
            Row row = sheet.getRow(i);
            LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
            int noCell = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noCell; j++) {
                hashMap.put(row0.getCell(j).toString(), row.getCell(j).toString());
            }
            excelData.add(hashMap);
        }
        System.out.println(excelData);
        fileInputStream.close();
    }


}
