package Todoist;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Robot;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;


import static org.junit.jupiter.api.Assertions.assertTrue;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TodoistChrome {
    public static WebDriver driver = null;
    private final String baseUrl = "https://todoist.com";

    @Test
    @Order(1)
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/selenium driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    @Order(2)
    public void GetTitle() throws InterruptedException {
        System.out.println(driver.getTitle());
        assertTrue(driver.getTitle().toUpperCase()
                .contains("todoist".toUpperCase()));

    }


    @Test
    @Order(3)
    public void GoToLink() throws InterruptedException {
        driver.get(baseUrl + "/auth/login");
        Thread.sleep(1000);


    }


    @Test
    @Order(4)
    public void SignIn() throws InterruptedException {
        WebElement input = driver.findElement(By.id("element-0"));
        input.sendKeys("kalchenko.marya@gmail.com");
        input = driver.findElement(By.id("element-3"));
        input.sendKeys("seledkasmolokom28");
    }

    @Test
    @Order(5)
    public void PressButton() throws AWTException, InterruptedException {
        WebElement button = driver.findElement(By.id("todoist_app"));
        Robot rr = new Robot();
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }
/*
    @Test
    @Order(6)
    public void Addproject() throws InterruptedException {
        WebElement project = driver.findElement(By.id("list_holder"));
        Robot rr = null;
        try {
            rr = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }
        /*WebElement name = driver.findElement(By.id("edit_project_modal_field_name"));
        name.sendKeys("12345");
        Thread.sleep(3000);
        WebElement add = driver.findElement(By.id("reactist-modal-box-8"));
        add.click();
        Thread.sleep(1000);*/


    @Test
    @Order(6)
    public void AddTask() throws AWTException, InterruptedException {
        WebElement task = driver.findElement(By.id("quick_add_task_holder"));
        Robot rr = new Robot();
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);

    }
}
      /*  @Test
        @Order(7)
        public void GetTask() throws  InterruptedException {
            driver.findElement(By.xpath ("//*[@id='reactist-modal-box-0']/section/form/div[1]/div[1]/div[1]/div/div/div[2]/div/div/div/div"));
            Thread.sleep(5000);

        }
            @Test
            @Order(8)
            public void GetClick() throws  InterruptedException {
            WebElement input =driver.findElement(By.id("reactist-modal-box-0"));
           input.click();
           Thread.sleep(5000);
    }
}
/*
    @Test
    @Order(11)
    public void Add() throws AWTException, InterruptedException {
        WebElement add = driver.findElement(By.id("reactist-modal-box-12"));
        Robot rr = new Robot();
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);

    }
}
    /*
    @Test
    @Order(7)
    public void signNameProject() throws InterruptedException {
        WebElement input = driver.findElement(By.id("edit_project_modal_field_name"));
        input.sendKeys("new project");
        WebElement color = driver.findElement(By.xpath("//*[@id='reactist-modal-box-6']/form/section/div[2]/button"));
        Thread.sleep( 1000 );
        Robot rr = new Robot();
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }
}
*/
  /*  @Test
    @Order(5)
    public void signOut(){
        driver.get(baseUrl+"sign-out");
        Assertions.assertTrue(driver.getTitle().toUpperCase()
                .contains("Stock images".toUpperCase()));
    }


    @Test
    @Order(5)
    public String generate(){
        String s = "";
        Random random = new Random();
        for (int i=0; i<4; i++){
            int n = random.nextInt(127-97+1)+97;
            char c =(char)n;
            s+=c;
        }

        int number = random.nextInt(1000)+1000;
        s+=String.valueOf(number);
        s+="@gmail.com";
        return s;


    }
*/

