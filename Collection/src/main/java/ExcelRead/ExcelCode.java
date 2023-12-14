package ExcelRead;
import java.io.IOException;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;//these comes automatically
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelCode {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String readStringData(int row,int col) throws IOException//for reading string values
	{
		f=new FileInputStream("C:\\Users\\sinju\\eclipse-workspace\\Collection\\src\\main\\resources\\tessting.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		XSSFRow r=sh.getRow(row);
		XSSFCell c=r.getCell(col);//inside that row choose the cell needed
		return c.getStringCellValue();//get string value of that cell
	}
	public static String readIntegerData(int row,int col) throws IOException
	{
		f=new FileInputStream("C:\\Users\\sinju\\eclipse-workspace\\Collection\\src\\main\\resources\\tessting.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		XSSFRow r=sh.getRow(row);
		XSSFCell c=r.getCell(col);
		int val=(int)c.getNumericCellValue();
		return String.valueOf(val);//val is integer and convert it to string
	}
	

}
