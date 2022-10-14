package com.cydeo.tests.day9_properties_configuration_reader.hw;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class T1HW extends TestBase {
    /*
            TC #1: Login scenario

            1. Create new test and make set ups
            2. Go to : http://login1.nextbasecrm.com/
            3. Enter valid username
            4. Enter valid password
            5. Click to `Log In` button
            6. Verify title is as expected:
            Expected: Portal

            USERNAME  PASSWORD
            helpdesk1@cybertekschool.com  UserUser
            Helpdesk2@cybertekschool.com  UserUser
       */

    @Test
    public void login() {
        driver.get(ConfigurationReader.getProperty("env"));
        CRM_Utilities.login_crm(driver, ConfigurationReader.getProperty("CRM_user1"), ConfigurationReader.getProperty("CRM_password"));
        BrowserUtils.verifyTitle(driver,"Portal");
    }

}
