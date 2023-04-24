package cia2_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class task1 {
	WebDriver driver;
	  @Test
		 public void f() throws InterruptedException{
		 ChromeOptions co=new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver(co);
		 driver.get("https://www.trivago.in/");
		 driver.manage().window().maximize();
		 String currtitle=driver.getTitle();
		 System.out.println(currtitle);
		 driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[1]/div/div")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[24]/time")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[26]/time")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/input")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[2]/div/button[2]")).click();
}
}
