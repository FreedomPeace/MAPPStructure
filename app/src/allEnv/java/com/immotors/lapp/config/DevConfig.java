package com.immotors.lapp.config;


import com.framework.core_azp.BaseEnvConfig;

/**
 */
public class DevConfig extends BaseEnvConfig {
    @Override
    public String getHttpBaseUrl() {
//        return "https://mh-dev.immotors.com";
        return "http://galaxy-dev.immotors.com";
    }


}
