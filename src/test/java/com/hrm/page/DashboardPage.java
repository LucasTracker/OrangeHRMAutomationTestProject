package com.hrm.page;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")
public class DashboardPage extends PageObject {

    public String getUrl() {
        $(By.xpath("//h6[text()='Dashboard']")).shouldBeVisible();
        return getDriver().getCurrentUrl();
    }
}
