package web.centos_selenium_jenkins.testmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Screen1 extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://devrabbit.com/\",\"report_upload_url\":\"http://192.168.1.144:80/UploadReportFile\",\"project_name\":\"CentOS_Selenium_Jenkins\",\"project_description\":\"desc\",\"project_id\":274,\"module_name\":\"TestModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":422,\"testcase_name\":\"TC1\",\"testcase_id\":456,\"testset_id\":0,\"executed_timestamp\":2014294836,\"browser_type\":\"chrome\"}";

	public static String projectName = "centos_selenium_jenkins";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Screen1(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_309675A;
	public String clkAContact_309675() {
		waitForExpectedElement(driver, Contact_309675A);		
		String text = Contact_309675A.getText();
		Contact_309675A.click();
		return text;
	}

}