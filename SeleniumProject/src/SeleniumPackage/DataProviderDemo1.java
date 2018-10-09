package SeleniumPackage;

import org.testng.annotations.Test;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {

	
	@Test(dataProvider="providenumbers")
	
	public void test(int number,int expected)
	{
		AssertJUnit.assertEquals(number+10, expected);
	}
	@DataProvider(name= "providenumbers")
	public Object[][] providedata()
	{
		return new Object[][]{
			{10,20},
			{20,30}
			
		};
	}
	
}
