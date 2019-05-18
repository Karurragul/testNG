package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test {
        WebDriver driver;
	@Parameters({ "FirstName", "LastName" ,"Address" , "email", "mobile" , "gender", "Hob", "select", "Skill","Count","nations","DOB","Password","Re-password" })
	@Test
	private void test1(String frstname, String lstname, String addr, String mail , String phone, String Gen , String hobby , String Lang, String Skil, String Coun, String na, String birth, String pass, String password)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\ragul\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//* soft assert
		SoftAssert s = new SoftAssert();
		s.assertTrue(driver.getCurrentUrl().contains("automationtesting"));		
		WebElement FirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		FirstName.sendKeys(frstname);
		WebElement LastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		LastName.sendKeys(lstname);
		WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		Address.sendKeys(addr);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(mail);
		WebElement mobile = driver.findElement(By.xpath("//input[@type='tel']"));
		mobile.sendKeys(phone);
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		WebElement Hob = driver.findElement(By.xpath("//input[@value='Cricket']"));
		Hob.click();
		WebElement Language = driver.findElement(By.xpath("//div[@id='msdd']"));
		Language.click();
		WebElement select = driver.findElement(By.xpath("//a[text()='English']"));
		select.click();
		WebElement Ski = driver.findElement(By.xpath("//option[text()='Select Skills']"));
		Ski.click();
		WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Skills.click();
		WebElement Skill = driver.findElement(By.xpath("//option[text()='Android']"));
		Skill.click();
		WebElement Sk = driver.findElement(By.xpath("//option[text()='Select Country']"));
		Sk.click();
		WebElement Count = driver.findElement(By.xpath("//option[text()='India']"));Count.click();		
		WebElement co = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));co.click();
		WebElement nations = driver.findElement(By.xpath("//li[text()='Australia']"));nations.click();
       // WebElement year = driver.findElement(By.id("yearbox"));year.click();
        WebElement yyyy = driver.findElement(By.xpath("//option[text()='1994']"));yyyy.click();
       // WebElement month = driver.findElement(By.xpath("//option[text()='Month']"));month.click();
        WebElement mm = driver.findElement(By.xpath("//option[text()='July']"));mm.click();
        WebElement DOB =driver.findElement(By.id("daybox"));DOB.click();
        WebElement dd = driver.findElement(By.xpath("//option[text()='16']"));dd.click(); 
        
       WebElement pas = driver.findElement(By.xpath("//input[@id='firstpassword']"));pas.sendKeys(pass);
       WebElement pa = driver.findElement(By.xpath("//input[@id='secondpassword']"));pa.sendKeys(password);
       
       WebElement sub = driver.findElement(By.id("submitbtn"));sub.click();
         
	}
}














