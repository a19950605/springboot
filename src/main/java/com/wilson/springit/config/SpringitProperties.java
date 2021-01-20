package com.wilson.springit.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringitProperties {

    private String welcomeMsg="hello world";

    public String getWelcomeMsg(){
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg){
        this.welcomeMsg=welcomeMsg;
    }

}
