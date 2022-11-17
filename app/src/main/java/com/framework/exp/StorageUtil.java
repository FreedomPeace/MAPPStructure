package com.framework.exp;

import static android.content.Context.MODE_PRIVATE;

import android.app.Application;

public class StorageUtil {
    public static void saveFlavor(Application application, String cacheFlavor) {
        application.getSharedPreferences("flavorFile", MODE_PRIVATE).edit().putString("flavor", cacheFlavor)
                .commit();
        System.exit(-1);
    }

    public static String getCacheFlavor(Application application) {
        return application.getSharedPreferences("flavorFile", MODE_PRIVATE).getString("flavor", "prod");
    }
}
