package com.immotors.lapp.config;

import androidx.annotation.Nullable;
import com.framework.core_azp.BaseEnvConfig;
/**
 */
public class AppEnvConfig {
    private static BaseEnvConfig config;

    /**
     * 获取应用环境配置
     *
     * @return
     */
    public static BaseEnvConfig getConfig(@Nullable String cacheFlavor) {
        if (null == config) {
            config = new ProConfig();
        }
        return config;
    }
}