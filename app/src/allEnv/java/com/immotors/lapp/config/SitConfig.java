package com.immotors.lapp.config;


import com.framework.core_azp.BaseEnvConfig;

/**
 */
public class SitConfig extends BaseEnvConfig {

    @Override
    public String getHttpBaseUrl() {
        return "https://mh-sit.immotors.com";
    }
}