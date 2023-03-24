package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooAccountHlpPg {

    WebDriver Internaldriver;
public YahooAccountHlpPg (WebDriver driver) {
	
	driver=Internaldriver;
}

public WebElement helpLink() {
	WebElement helpLink= Internaldriver.findElement(By.linkText("Help"));
    return helpLink;

}




public WebElement faqTopic() {
	WebElement faqTopic= Internaldriver.findElement(By.xpath("(//a[@class='topicLink'])[1]"));
    return  faqTopic;
}

public WebElement passWordAndSignIn() {
	WebElement passWordAndSignIn= Internaldriver.findElement(By.xpath("(//a[@class='topicLink'])[2]"));
    return passWordAndSignIn;
}

public WebElement accountKey() {
	WebElement accountKey= Internaldriver.findElement(By.xpath("(//a[@class='topicLink'])[3]"));
    return accountKey;

}
public WebElement accountSecurity() {
	WebElement accountSecurity= Internaldriver.findElement(By.xpath("(//a[@class='topicLink'])[4]"));	
    return accountSecurity;
}

public WebElement createOrDeleteAccount() {
	WebElement createOrDeleteAccount= Internaldriver.findElement(By.xpath("(//a[@class='topicLink'])[5]"));	
    return createOrDeleteAccount;

}
public WebElement managrAccountSetting() {
	WebElement managrAccountSetting= Internaldriver.findElement(By.xpath("(//a[@class='topicLink'])[6]"));
    return managrAccountSetting;
}

public WebElement accessibility() {
	WebElement accessibility= Internaldriver.findElement(By.xpath("(//a[@class='topicLink'])[7]"));
    return accessibility;
}
public WebElement yahooPolicy() {
	WebElement yahooPolicy= Internaldriver.findElement(By.xpath("(//a[@class='topicLink'])[8]"));
    return yahooPolicy;
}













}
