package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./exe/chromedriver");//chromを使えるようにする
		WebDriver	driver	=	new	ChromeDriver(); //ChromeDriverの作成　（APIで調べる）
		driver.get("http://www.google.com/xhtml"); //get()でブラウザ起動　(getとpost)
		Thread.sleep(5000); //処理を停止(動作確認の為)　（5秒待つ）
		//ブラウザの要素を指定　メソッド名がわかりやすいですよね。
		WebElement	searchBox	=	driver.findElement(By.name("q"));//
		searchBox.sendKeys("ChromeDriver");//ChromeDriverで検索
		searchBox.submit();
		Thread.sleep(5000);		
		//driver.quit();	//ブラウザを閉じる

		
	}
	
	
}
