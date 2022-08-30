import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.FileDownloadMode.PROXY;


abstract public class BaseTest {

    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        Configuration.browser = "firefox";
        Configuration.driverManagerEnabled = true;
        Configuration.proxyEnabled = true;
        Configuration.fileDownload = PROXY;
        Configuration.headless = false;
        Configuration.downloadsFolder = "C:\\downloads";
        Configuration.reportsFolder = "C:\\downloads";
    }

    @Before
    public void init() {
        setUp();
    }

    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}

