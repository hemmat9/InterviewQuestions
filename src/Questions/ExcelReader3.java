package Questions;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReader3 {
    public static void main(String[] args) throws IOException {

        String path ="D:\\Batch11.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Data");
        int noRow = sheet.getPhysicalNumberOfRows();

        List<Map<String, String>> excelData = new ArrayList<>();

        for(int i= 0; i<noRow; i++){
            Row row = sheet.getRow(i);
            HashMap<String, String> hashMap = new LinkedHashMap<>();
            hashMap.put("Name", row.getCell(0).toString());
            hashMap.put("F.Name", row.getCell(1).toString());
            hashMap.put("Age", row.getCell(2).toString());
            hashMap.put("Salary", row.getCell(3).toString());

            excelData.add(hashMap);
        }
        System.out.println(excelData);
        }
    }

