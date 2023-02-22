package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriAutomate {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.naukri.com/");
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys("noushad.pathan79@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")).sendKeys("Noushad@79");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='mb10']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"lazyAttachCV\"]/div/div/div[2]/div[1]/div[2]/div/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[6]/div[6]/div/div/button")).click();
        Thread.sleep(5000);

        String filePath = System.getProperty("user.dir");

        //upload resume
        driver.findElement(By.id("attachCV")).sendKeys(filePath+"\\reports\\Noushad_QA_TestEng.pdf");
        Thread.sleep(3000);
        driver.navigate().refresh();

    }
}
