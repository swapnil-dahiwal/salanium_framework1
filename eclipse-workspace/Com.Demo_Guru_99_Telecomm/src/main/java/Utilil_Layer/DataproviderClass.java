package Utilil_Layer;

import org.testng.annotations.DataProvider;

public class DataproviderClass {

	@DataProvider(name="Searchprovider")
	
	public static Object[][] getDataFromProvider()
	{
		return new Object[][]
	{
			{"Guru99","india"},
			{"Krishna","UK"},
			{"swapnil","germany"}
				};
	}
	//  @Test(dataProvider="SearchProvider")  // in test class
}
