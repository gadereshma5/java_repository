package KeywordDriven;

public class DriverScript
{
 public static void main(String[] args) throws Exception 
 {
 
 String sPath = "E:\\framework\\testscript.xlsx"; 

 ReadExcelData.setExcelFile(sPath, "Sheet1");

 
  for (int iRow=1;iRow<=7;iRow++)
 {
 String sActions = ReadExcelData.getCellData(iRow, 2); 
 System.out.println(sActions);
 
  if(sActions.equals("openBrowser"))
 { 
 Actions.openBrowser();
 
 }
 else if(sActions.equals("navigate"))
 {
// Actions.navigate();
 }
 else if(sActions.equals("type"))
 {
 Actions.type();
 }
 else if(sActions.equals("click"))
 {
 Actions.click();
 }
 
/* else if(sActions.equals("closeBrowser"))
 {
 Actions.closeBrowser();
 }*/ 
 }
 }
}