package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Two {
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
		//*soft assert
		s.assertEquals(frstname, FirstName.getAttribute("value"));
		WebElement LastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		LastName.sendKeys(lstname);
//		//*soft assert
  	s.assertEquals(lstname, LastName.getAttribute("value"));
		WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		Address.sendKeys(addr);
		//* soft assert
		s.assertEquals(addr, Address.getAttribute("value"));
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(mail);
		//* soft assert
				s.assertEquals(mail, email.getAttribute("value"));
		WebElement mobile = driver.findElement(By.xpath("//input[@type='tel']"));
		mobile.sendKeys(phone);
		//* soft assert
		s.assertEquals(phone, mobile.getAttribute("value"));
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		//* soft assert
		s.assertTrue(gender.isSelected());
	
		WebElement Hob = driver.findElement(By.xpath("//input[@value='Cricket']"));
		Hob.click();
		s.assertTrue(Hob.isSelected());
		
		WebElement Language = driver.findElement(By.xpath("//div[@id='msdd']"));
		Language.click();
		s.assertTrue(Language.isSelected());
		WebElement select = driver.findElement(By.xpath("//a[text()='English']"));
		select.click();
		s.assertTrue(select.isSelected());
		WebElement Ski = driver.findElement(By.xpath("//option[text()='Select Skills']"));
		Ski.click();
		s.assertTrue(Ski.isSelected());
		WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Skills.click();
		s.assertTrue(Skills.isSelected());
		WebElement Skill = driver.findElement(By.xpath("//option[text()='Android']"));
		Skill.click();
		s.assertTrue(Skill.isSelected());
		WebElement Sk = driver.findElement(By.xpath("//option[text()='Select Country']"));
		Sk.click();
		s.assertTrue(Sk.isSelected());
		WebElement Count = driver.findElement(By.xpath("//option[text()='India']"));Count.click();	
		s.assertTrue(Count.isSelected());
		WebElement co = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));co.click();
		s.assertTrue(co.isSelected());
		WebElement nations = driver.findElement(By.xpath("//li[text()='Australia']"));nations.click();
		s.assertTrue(nations.isSelected());
       // WebElement year = driver.findElement(By.id("yearbox"));year.click();
        WebElement yyyy = driver.findElement(By.xpath("//option[text()='1994']"));yyyy.click();
       // WebElement month = driver.findElement(By.xpath("//option[text()='Month']"));month.click();
        WebElement mm = driver.findElement(By.xpath("//option[text()='July']"));mm.click();
        s.assertTrue(mm.isSelected());
        WebElement DOB =driver.findElement(By.id("daybox"));DOB.click();
        s.assertTrue(DOB.isSelected());
        WebElement dd = driver.findElement(By.xpath("//option[text()='16']"));dd.click();
        s.assertTrue(dd.isSelected());
        
       WebElement pas = driver.findElement(By.xpath("//input[@id='firstpassword']"));pas.sendKeys(pass);
       s.assertEquals(pass, pas.getAttribute("value"));
       WebElement pa = driver.findElement(By.xpath("//input[@id='secondpassword']"));pa.sendKeys(password);
       s.assertEquals(password, pa.getAttribute("value"));
       WebElement sub = driver.findElement(By.id("submitbtn"));sub.click();
       s.assertTrue(sub.isSelected());  
       s.assertAll();
	}
}
