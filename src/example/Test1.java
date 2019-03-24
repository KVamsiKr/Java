package example;

import java.util.Iterator;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws Exception {
		/*System.setProperty("webdriver.chrome.driver", "C:/Users/acer/Downloads/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();*/
		FirefoxDriver cd=new FirefoxDriver();
		cd.manage().window().maximize();
		//cd.manage().deleteAllCookies();
		//cd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		cd.get("https://www.online.citibank.co.in/");
		Thread.sleep(10000);
		String parent=cd.getWindowHandle();
		System.out.println("parent window ID is :"+parent);
		cd.findElement(By.xpath("//a[text()='APPLY FOR CREDIT CARDS']/parent::*[@class='visible-desktop']")).click();
		Set<String> childs=cd.getWindowHandles();
		System.out.println(childs);
		Iterator<String> it=childs.iterator();
		while(it.hasNext()){
			String current=it.next().toString();
			System.out.println("current value loaded is:"+current);
			if (!current.contains(parent)){
				cd.switchTo().window(current);
				cd.findElement(By.xpath("//a[@class='downArrow']")).click();
				Thread.sleep(5000);
				cd.close();
				}
			}
			cd.close();
		}
	}
