package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriAutomate {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.naukri.com/");
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys("sruthichinta9@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")).sendKeys("Sruthi@508");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("View & Update Profile")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("//div[@class='chatbot_Nav']/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("DELETE RESUME")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='action right-align']/button")).click();
        Thread.sleep(5000);
        // driver.findElement(By.xpath("//div[@class='uploadBtn']")).click();
        // Thread.sleep(3000);

        String filePath = System.getProperty("user.dir\\reports");

        //upload resume
        driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(filePath+"\\MUNNA PATHAN.pdf");
        Thread.sleep(3000);
        driver.navigate().refresh();

    }
}
