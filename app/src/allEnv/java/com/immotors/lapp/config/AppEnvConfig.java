package com.immotors.lapp.config;

import android.text.TextUtils;

import androidx.annotation.Nullable;

import com.framework.core_azp.BaseEnvConfig;
import com.framework.exp.BuildConfig;

/**
 * @ClassName: AppEnvConfig
 * @Description: APP环境
 * @Author: sligner
 * @Date: 2021/4/27 20:23
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
            String flavor;
            if (!TextUtils.isEmpty(cacheFlavor)) {
                flavor = cacheFlavor;
            } else {
                flavor  = BuildConfig.FLAVOR;
            }

            switch (flavor) {
                case "dev":
                    config = new DevConfig();
                    break;
                case "sit":
                    config = new SitConfig();
                    break;
                case "prod":
                    config = new ProConfig();
                    break;
                case "uat":
                    config = new UatConfig();
                    break;
            }
        }

        return config;
    }


}