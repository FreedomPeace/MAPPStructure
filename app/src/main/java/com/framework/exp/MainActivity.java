package com.framework.exp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.framework.core_azp.BaseEnvConfig;
import com.immotors.lapp.config.AppEnvConfig;

public class MainActivity extends AppCompatActivity {

    private EditText flavorEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView url = findViewById(R.id.url);
        flavorEt = findViewById(R.id.editTextTextPersonName);
        String flavor = StorageUtil.getCacheFlavor(getApplication());
        flavorEt.setText(flavor);
        BaseEnvConfig config = AppEnvConfig.getConfig(flavor);
        if (config == null)
            Toast.makeText(this, "没有找到对应的" + flavor, Toast.LENGTH_SHORT).show();
        else {
            url.setText(config.getHttpBaseUrl());
        }
    }

    public void save(View view) {
        StorageUtil.saveFlavor(getApplication(), flavorEt.getText().toString());
    }
}