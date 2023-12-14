package ExcelRead;
import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s=ExcelCode.readStringData(1, 0);//calling static method of excelcode class
		System.out.println(s);
		String s1=ExcelCode.readIntegerData(1, 1);
		System.out.println(s1);
		

	}

}
