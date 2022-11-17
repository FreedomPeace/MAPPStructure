package com.immotors.lapp.config;


/**
 **/
public class MockSitConfig extends SitConfig {
    @Override
    public String getHttpBaseUrl() {
        return  "http://mock-sit.immotors.com";
    }


}
