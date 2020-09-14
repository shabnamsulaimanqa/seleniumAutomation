package com.qa.util;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static Properties prop;

    public Base() throws FileNotFoundException {
        prop = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/profiles/config.properties");
        try {
            prop.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }

    }
}
