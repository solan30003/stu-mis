package com.stu;

import com.solan.fx.starter.FxStarterApplication;
import com.solan.fx.starter.boot.BaseApplication;
import com.solan.fx.starter.boot.FxApplication;

import java.util.Properties;

/**
 * Hello world!
 */
public class StudentMisApp implements BaseApplication {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.setProperty("spring.application.name", "TEST.APP");
        FxApplication.run(props.getProperty("spring.application.name"), FxStarterApplication.class, args);

    }
}
