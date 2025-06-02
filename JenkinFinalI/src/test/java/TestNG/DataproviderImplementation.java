package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderImplementation {

	@DataProvider
	public Object[][]getEmpData(){
		Object[][] objArr=new Object[11][2];
		objArr[0][0]="Saurabh";
		objArr[0][1]=123;
		objArr[1][0]="Anand";
		objArr[1][1]=234;
		objArr[2][0]="Meena";
		objArr[2][1]=2534;
		objArr[3][0]="Sim";
		objArr[3][1]=343;
		objArr[4][0]="Aman";
		objArr[4][1]=234;
		objArr[5][0]="Viahsnavi";
		objArr[5][1]=234;
		objArr[6][0]="Vijay";
		objArr[6][1]=234;
		objArr[7][0]="Pratiksha";
		objArr[7][1]=234;
		objArr[8][0]="suyog";
		objArr[8][1]=234;
		objArr[9][0]="suraj";
		objArr[9][1]=234;
		objArr[10][0]="pooja";
		objArr[10][1]=234;
		return objArr;
	}
	
	@Test(dataProvider="getEmpData")
	public void empDetails(String ename, int pnum) {
		System.out.println(ename+"\t"+pnum);
	}
	
}
