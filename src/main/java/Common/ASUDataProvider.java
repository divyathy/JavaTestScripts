package Common;

import org.testng.annotations.DataProvider;

public class ASUDataProvider {

    @DataProvider(name = "getTestData")
    public Object[][] getTestData(){
        Object data[][]= ExcelData.getTestData("Sheet1");
        return data;
    }
}
