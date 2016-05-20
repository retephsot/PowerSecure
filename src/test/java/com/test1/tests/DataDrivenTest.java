package com.test1.tests;

import com.test1.util.DataDrivenHelper;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataDrivenHelper ddh = new DataDrivenHelper("MasterTestDataFile.xlsx");
		
		Object[][] testData = ddh.getTestCaseDataSets("TestCaseDataSets", "addScheduledTest");
		
		for(Object[] testRow:testData)
		{
			for(Object cell:testRow)
			{
				System.out.println(cell.toString());
			}
		}
			
	}

}
